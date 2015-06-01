package rql_editor.views;


import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.*;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Resource;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.core.resources.*;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;

import rql_editor.Activator;
import rql_editor.PanelRequest;

import com.parallels.aps.ide.rqleditor.xtext.rql.ui.internal.RQLActivator;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
//import com.parallels.aps.ide.ui.preferences.*;
import com.parallels.aps.ide.ui.preferences.PanelSettings;
import com.parallels.aps.ide.ui.preferences.PanelSettings.PanelType;
//import com.parallels.aps.ide.ui.preferences.PanelSettings;
import com.parallels.aps.ide.ui.preferences.SiteWithCredentials;

public class RQLEditor extends ViewPart {

	public static final String ID = "rql_editor.views.RQLEditor";

	private Action action1;
	private MessageConsole outConsole;
	private EmbeddedEditorModelAccess editor;
	private ToolBarCombo controllersCmbBox;
	

	public RQLEditor() {
	}

	public void createPartControl(Composite parent) {

		RQLActivator activator = RQLActivator.getInstance();
		final Injector injector = activator
				.getInjector(RQLActivator.COM_PARALLELS_APS_IDE_RQLEDITOR_XTEXT_RQL_RQL);

		IEditedResourceProvider resourceProvider=new IEditedResourceProvider() {
			
			private IProject project;

			public IProject getProject() {
				return project;
			}

			public void setProject(IProject project) {
				this.project = project;
			}

			@Override
			public XtextResource createResource() {
				try {
					XtextResourceSet resourceSet = (XtextResourceSet)(injector.getInstance(XtextResourceSetProvider.class).get(project));//getInstance(XtextResourceSetProvider.class).get();
					org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(URI.createURI("temp.rql"));

					return (XtextResource) resource;
				} catch (Exception e) {
					return null;
				}
			}
		};

		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
		EmbeddedEditor handle= factory.newEditor(resourceProvider).showErrorAndWarningAnnotations().withParent(
				parent);

		editor = handle.createPartialEditor(true);
		outConsole = findConsole("RQL Output");
		makeActions();
		contributeToActionBars();
		Activator.getDefault().getPreferenceStore().
		addPropertyChangeListener(new IPropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent event) {
				controllersCmbBox.updateList();	//doesn't react			
			}
		});
	}
	
	private MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	   }

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		controllersCmbBox = new ToolBarCombo("RQL Controller");
		manager.add(controllersCmbBox);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
			   MessageConsoleStream out = outConsole.newMessageStream();
			   String editablePart = editor.getEditablePart();
			   out.println(PanelRequest.request(controllersCmbBox.getCurrent(), editablePart));
			   outConsole.activate();
			}
		};
		action1.setText("Execute");
		action1.setToolTipText("Run against selected controller and log results");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
	}

	public void setFocus() {
	}
}
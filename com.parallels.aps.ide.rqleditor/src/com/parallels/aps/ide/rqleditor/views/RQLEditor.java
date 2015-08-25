package com.parallels.aps.ide.rqleditor.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.*;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.action.*;
import org.eclipse.ui.*;
import org.eclipse.core.resources.*;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;

import com.parallels.aps.ide.rqleditor.Activator;
import com.parallels.aps.ide.rqleditor.PanelRequest;
import com.parallels.aps.ide.rqleditor.xtext.rql.ui.internal.RQLActivator;
import com.parallels.aps.ide.ui.preferences.SiteWithCredentials;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Injector;

public class RQLEditor extends ViewPart {

	public static final String OUR_ID = "rql_editor.views.RQLEditor";

	private Action myAction1; // for button at up right bottom
	private MessageConsole myOutConsole;
	private EmbeddedEditorModelAccess myEditor;
	private PanelSettingsCombo myControllersCmbBox;
	private TypesOrResourcesCombo myTypesOrResourcesCombo;

	public RQLEditor() {
	}

	public void createPartControl(Composite parent) {

		RQLActivator activator = RQLActivator.getInstance();
		final Injector injector = activator.getInjector(RQLActivator.COM_PARALLELS_APS_IDE_RQLEDITOR_XTEXT_RQL_RQL);

		IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {

			private IProject project;

			@Override
			public XtextResource createResource() {
				try {
					XtextResourceSet resourceSet = (XtextResourceSet) (injector
							.getInstance(XtextResourceSetProvider.class).get(project));// getInstance(XtextResourceSetProvider.class).get();
					org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(URI
							.createURI("temp.rql"));

					return (XtextResource) resource;
				} catch (Exception e) {
					return null;
				}
			}
		};

		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
		EmbeddedEditor handle = factory.newEditor(resourceProvider).showErrorAndWarningAnnotations().withParent(parent);

		myEditor = handle.createPartialEditor(true);
		myOutConsole = findConsole("RQL Output");
		makeActions();
		contributeToActionBars();
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent event) {
				myControllersCmbBox.updateList(); // doesn't react
				myTypesOrResourcesCombo.updateList();
			}
		});
	}

	// finds needed console by name or creates the new one if it doesn't exist
	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(myAction1);
		myControllersCmbBox = new PanelSettingsCombo("RQL Controller");
		myTypesOrResourcesCombo = new TypesOrResourcesCombo("Types or resources");
		manager.add(myControllersCmbBox);
		manager.add(myTypesOrResourcesCombo);
	}

	private void makeActions() {
		myAction1 = new Action() {
			public void run() {
				MessageConsoleStream out = myOutConsole.newMessageStream();
				String editablePart = myEditor.getEditablePart();
				ObjectMapper mapper = new ObjectMapper();
				SiteWithCredentials xmlrpcSite = myControllersCmbBox.getCurrentXmlrpcSite();
				SiteWithCredentials requestSite = xmlrpcSite;
				String restType = "GET ";
				String typesOrResources = myTypesOrResourcesCombo.getCurrent();
				JsonNode resultNode = PanelRequest.request(xmlrpcSite, editablePart, typesOrResources);
				String indented = "Error occured.";
				try {
					indented = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(resultNode);
				} catch (JsonProcessingException e) {
					System.err.println(e.getLocalizedMessage());
				}
				out.println("Request: " + restType + requestSite.getAddress() + typesOrResources + "?" + editablePart );
				out.println("Response:");
				out.println(indented);
				myOutConsole.activate();
			}
		};
		myAction1.setText("Execute");
		myAction1.setToolTipText("Run against selected controller and log results");
		myAction1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	}

	public void setFocus() {
	}
}
package rql_editor.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.parallels.aps.ide.ui.preferences.PanelSettings;
import com.parallels.aps.ide.ui.preferences.SiteWithCredentials;
import com.parallels.aps.ide.ui.preferences.PanelSettings.PanelType;

public class ToolBarCombo extends ControlContribution {

	private Combo combo;
	private ArrayList<SiteWithCredentials> poaControllers;
	public ToolBarCombo(String str)
	{
		super(str);
		poaControllers = new ArrayList<SiteWithCredentials>();
	}

	@Override
	protected Control createControl(Composite parent)
	{
		combo = new Combo(parent, SWT.NONE | SWT.DROP_DOWN | SWT.READ_ONLY);

		updateList();
		reloadCombo();
		combo.select(0);

//		combo.addModifyListener(
//				new ModifyListener()
//				{
//					public void modifyText(final ModifyEvent e)
//					{
//						MessageDialog.openInformation(
//								null, "My App",
//								"Item at " + combo.getSelectionIndex() + " clicked.");
//
//					}
//				});

		return combo;
	}
	
	public void updateList() {
		   List<PanelSettings> controllers = PanelSettings.loadSettings();
		   for (PanelSettings controller: controllers) {
			   if (controller.getType() == PanelType.poa) {
				   poaControllers.add(controller.getPOASite());
			   }
		   }
	}
	
	private void reloadCombo() {
		combo.removeAll();
		for (SiteWithCredentials controller: poaControllers) {
			combo.add(controller.getAddress());
		}
	}
	
	public SiteWithCredentials getCurrent() {
		return poaControllers.get(combo.getSelectionIndex());
	}

	public void setValue(int index)
	{
		combo.select(index);
	}

}

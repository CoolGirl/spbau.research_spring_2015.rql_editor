package rql_editor.views;

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

	private Combo myCombo;
	private List<PanelSettings> myPanelSettings;

	public ToolBarCombo(String str) {
		super(str);
		myPanelSettings = PanelSettings.loadSettings();
	}

	@Override
	protected Control createControl(Composite parent) {
		myCombo = new Combo(parent, SWT.NONE | SWT.DROP_DOWN | SWT.READ_ONLY);

		updateList();
		reloadCombo();
		myCombo.select(0);

		// combo.addModifyListener(
		// new ModifyListener()
		// {
		// public void modifyText(final ModifyEvent e)
		// {
		// MessageDialog.openInformation(
		// null, "My App",
		// "Item at " + combo.getSelectionIndex() + " clicked.");
		//
		// }
		// });

		return myCombo;
	}

	public void updateList() {
		List<PanelSettings> panelSettings = PanelSettings.loadSettings();
		for (PanelSettings controller : panelSettings) {
			if (controller.getType() == PanelType.poa) {
				this.myPanelSettings.add(controller);
			}
		}
	}

	private void reloadCombo() {
		myCombo.removeAll();
		for (PanelSettings settings : myPanelSettings) {
			myCombo.add(settings.getPOASite().getAddress());
		}
	}

	public SiteWithCredentials getCurrent() {
		return myPanelSettings.get(myCombo.getSelectionIndex()).getXMLRPCSite();

	}

	public void setValue(int index) {
		myCombo.select(index);
	}

}

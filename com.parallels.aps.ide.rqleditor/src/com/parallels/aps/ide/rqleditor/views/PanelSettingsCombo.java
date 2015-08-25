package com.parallels.aps.ide.rqleditor.views;

import java.util.List;


import com.parallels.aps.ide.ui.preferences.PanelSettings;
import com.parallels.aps.ide.ui.preferences.PanelSettings.PanelType;
import com.parallels.aps.ide.ui.preferences.SiteWithCredentials;

public class PanelSettingsCombo extends ToolBarCombo<PanelSettings> {

	public PanelSettingsCombo(String str) {
		super(str);
		myComboContent = PanelSettings.loadSettings();
	}
	
	public void updateList() {
		List<PanelSettings> panelSettings = PanelSettings.loadSettings();
		for (PanelSettings controller : panelSettings) {
			if (controller.getType() == PanelType.poa) {
				this.myComboContent.add(controller);
			}
		}
	}
	
	protected void reloadCombo() {
		myCombo.removeAll();
		for (PanelSettings settings : myComboContent) {
			myCombo.add(settings.getPOASite().getAddress());
		}
	}
	
	public SiteWithCredentials getCurrentXmlrpcSite() {
		return getCurrent().getXMLRPCSite();

	}
}

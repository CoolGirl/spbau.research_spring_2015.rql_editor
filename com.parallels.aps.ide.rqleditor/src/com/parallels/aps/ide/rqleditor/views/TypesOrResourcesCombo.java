package com.parallels.aps.ide.rqleditor.views;

import java.util.ArrayList;

public class TypesOrResourcesCombo extends ToolBarCombo<String> {

	public static final String APS_2_RESOURCES = "aps/2/resources";
	public static final String APS_2_TYPES = "aps/2/types";
	
	public TypesOrResourcesCombo(String str) {
		super(str);
		myComboContent = new ArrayList<String>();
		myComboContent.add(APS_2_RESOURCES);
		myComboContent.add(APS_2_TYPES);
	}
	
	protected void reloadCombo() {
		myCombo.removeAll();
		for (String content: myComboContent){
			myCombo.add(content);
		}
	}

}

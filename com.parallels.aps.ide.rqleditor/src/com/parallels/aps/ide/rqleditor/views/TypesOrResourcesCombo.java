package com.parallels.aps.ide.rqleditor.views;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.events.SelectionEvent;

import com.parallels.aps.ide.rqleditor.Activator;

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

	@Override
	protected void selectDefault() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings dialogSettings = settings.getSection(RQL_VIEW_SECTION);
		if (dialogSettings!=null){
			myCombo.select(dialogSettings.getInt(RQL_VIEW_SELECTED_TYPES_OR_RESOURCES));
		}
	}

	@Override
	protected void putLastSelectionByKey(IDialogSettings dialogSettings) {
		dialogSettings.put(ToolBarCombo.RQL_VIEW_SELECTED_TYPES_OR_RESOURCES, myCombo.getSelectionIndex());
	}

}

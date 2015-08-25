package com.parallels.aps.ide.rqleditor.views;

import java.util.List;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import com.parallels.aps.ide.rqleditor.Activator;

public abstract class ToolBarCombo<T> extends ControlContribution implements SelectionListener{

	protected Combo myCombo;
	protected List<T> myComboContent;
	
	public static final String RQL_VIEW_SECTION = "rql_view_section";
	public static final String RQL_VIEW_SELECTED_PANEL = "rql_view_selected_panel";
	public static final String RQL_VIEW_SELECTED_TYPES_OR_RESOURCES = "rql_view_selected_types_or_resources";

	public ToolBarCombo(String str) {
		super(str);
	}

	@Override
	protected Control createControl(Composite parent) {
		myCombo = new Combo(parent, SWT.NONE | SWT.DROP_DOWN | SWT.READ_ONLY);
		myCombo.addSelectionListener(this);
		updateList();
		reloadCombo();
		selectDefault();
		return myCombo;
	}
	
	protected abstract void reloadCombo();
	
	public void updateList(){
		return;
	}
	
	protected abstract void selectDefault();
	
	public T getCurrent() {
		return myComboContent.get(getSelectionIndex());

	}
	
	public int getSelectionIndex(){
		int selectionIndex = myCombo.getSelectionIndex();
		return selectionIndex;
	}
	
	public void setValue(int index) {
		myCombo.select(index);
	}
	
	private void saveLastSelection(){
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings dialogSettings = settings.getSection(RQL_VIEW_SECTION);
		if (dialogSettings == null){
			dialogSettings = settings.addNewSection(RQL_VIEW_SECTION);
		}
		putLastSelectionByKey(dialogSettings);
	}
	
	protected abstract void putLastSelectionByKey(IDialogSettings dialogSettings);
	
	@Override
	public void widgetSelected(SelectionEvent e){
		saveLastSelection();
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e){
		return;
	}
	
}

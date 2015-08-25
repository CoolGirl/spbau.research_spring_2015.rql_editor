package com.parallels.aps.ide.rqleditor.views;

import java.util.List;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.parallels.aps.ide.ui.preferences.PanelSettings;

public class ToolBarCombo<T> extends ControlContribution implements SelectionListener{

	protected Combo myCombo;
	protected List<T> myComboContent;

	public ToolBarCombo(String str) {
		super(str);
	}

	@Override
	protected Control createControl(Composite parent) {
		myCombo = new Combo(parent, SWT.NONE | SWT.DROP_DOWN | SWT.READ_ONLY);
		myCombo.addSelectionListener(this);
		updateList();
		reloadCombo();
		myCombo.select(0);
		return myCombo;

	}
	
	protected void reloadCombo(){
		return;
	}
	
	public void updateList(){
		return;
	}
	

	
	public T getCurrent() {
		return myComboContent.get(myCombo.getSelectionIndex());

	}

	public void setValue(int index) {
		myCombo.select(index);
	}
	

	@Override
	public void widgetSelected(SelectionEvent e) {
		//getSelectionIndex()
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		return;
	}

	
}

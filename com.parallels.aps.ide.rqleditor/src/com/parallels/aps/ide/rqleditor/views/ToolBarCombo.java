package com.parallels.aps.ide.rqleditor.views;

import java.util.List;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public abstract class ToolBarCombo<T> extends ControlContribution {

	protected Combo myCombo;
	protected List<T> myComboContent;

	public ToolBarCombo(String str) {
		super(str);
	}

	@Override
	protected Control createControl(Composite parent) {
		myCombo = new Combo(parent, SWT.NONE | SWT.DROP_DOWN | SWT.READ_ONLY);
		myCombo.select(0);
		updateList();
		reloadCombo();
		return myCombo;
	}

	abstract public void updateList();
	
	abstract protected void reloadCombo();
	
	public T getCurrent() {
		return myComboContent.get(myCombo.getSelectionIndex());

	}

	public void setValue(int index) {
		myCombo.select(index);
	}

}

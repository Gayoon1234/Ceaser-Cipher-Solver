package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import view.MainJPanel;

public class ResetAll extends MouseAdapter {
	
	MainJPanel mjp;
	public ResetAll(MainJPanel mjp) {
		this.mjp = mjp;
	}
	
	public void mouseClicked(MouseEvent e) {
		mjp.clearAll();
	}
	
}

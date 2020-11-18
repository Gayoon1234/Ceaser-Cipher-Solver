package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.Shifting;
import view.MainJPanel;

public class Encoder extends MouseAdapter {
	
	MainJPanel mjp;
	private static Shifting shifting = new Shifting(); //There seem to be two instances of this...

	public Encoder(MainJPanel mjp) {
		this.mjp = mjp;
	}
	
	public void mouseClicked(MouseEvent e) {
		mjp.setText(shifting.shiftByN(mjp.getText(), mjp.getN()));
	}

}

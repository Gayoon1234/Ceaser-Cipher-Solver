package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import view.MainJPanel;

public class AmountToShiftBy extends MouseAdapter {

	MainJPanel mjp;
	public static int N = 13;
	public AmountToShiftBy(MainJPanel mjp) {
		this.mjp = mjp;
	}
	
	public void mouseClicked(MouseEvent e) {
		switch(((JButton) e.getSource()).getText()){
		case " + ":
			mjp.changeN((N < 25) ? N+= 1:N);
			break;
		case " - ":
			mjp.changeN((N > 0) ? N-=1:N);
			break;
		}
	}
	
	
}

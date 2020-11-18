package view;


import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

import controller.AmountToShiftBy;
import controller.Encoder;
import controller.Solver;
import controller.ResetAll;

@SuppressWarnings("serial")
public class MainJPanel extends JPanel {
	
	JTextArea jtb, answer;
	JButton solve, reset, shiftByN, plus, minus;
	JToolBar Buttons;
	private int N = 13;
	public MainJPanel(MainView mv) {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		add(Box.createVerticalStrut(10));
		jtb = new JTextArea(5,60);
		jtb.setLineWrap(true);
		jtb.setWrapStyleWord(true);
		JScrollPane sp = new JScrollPane(jtb);
		add(sp);
		
		
		Buttons = new JToolBar();
		
		solve = new JButton("Solve");
		solve.addMouseListener(new Solver(this));
		reset = new JButton("Reset");
		reset.addMouseListener(new ResetAll(this));
		shiftByN = new JButton("Shift by 13");
		shiftByN.addMouseListener(new Encoder(this));
		plus = new JButton(" + ");
		plus.addMouseListener(new AmountToShiftBy(this));
		minus = new JButton(" - ");
		minus.addMouseListener(new AmountToShiftBy(this));
		
		Buttons.setFloatable(false);

		Buttons.add(solve);
		Buttons.add(shiftByN);
		Buttons.add(minus);
		Buttons.add(plus);
		Buttons.add(reset);

		
		add(Buttons);
		
		answer = new JTextArea(5,60);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setEditable(false);
		JScrollPane sp2 = new JScrollPane(answer);
		add(sp2);
		add(Box.createVerticalStrut(10));
		
		
		setVisible(true);
	}
	
	public String getText() {
		return jtb.getText();
	}
	
	public void setText(String s) {
		answer.setText(s);
	}
	
	public void clearAll() {
		answer.setText("");
		jtb.setText("");
	}
	
	public void changeN(int n) {
		this.N = n;
		shiftByN.setText(String.format("Shift by %d", n));
	}
	
	public int getN() {
		return N;
	}
}

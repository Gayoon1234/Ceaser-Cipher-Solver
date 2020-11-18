package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainView extends JFrame {

	public MainView() {
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setTitle("Shift Solver");
		add(new MainJPanel(this), BorderLayout.CENTER);
		
		setVisible(true);

	}	
}

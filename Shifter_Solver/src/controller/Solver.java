package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.Shifting;
import view.MainJPanel;

public class Solver extends MouseAdapter {

	private MainJPanel shftr;
	private static Shifting shifting = new Shifting();
	
	public Solver(MainJPanel shftr) {
		this.shftr = shftr;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		String[] words = shftr.getText().split(" ");
		int[] answer = new int[26];
		
		for(String s: words) {
			if(s.length() > 2) { //Words of length two or shorter tend to be incorrect
			int shift = shifting.shifter(s);
			if(shift == -1)
				answer[0]++;
			else if(answer[shift] > 10 && shift != 0)
				break;
			else
				answer[shift]++;
			}
		}
		
		
		int max = 0;
		for(int i = 0; i<answer.length;i++) {
			if(answer[i] > max)
				max = i;
		}	
		max++;
		
		StringBuilder finalAnswer = new StringBuilder();
		for(String str: words)
			finalAnswer.append(shifting.shiftByN(str, max) + " ");
		
		shftr.setText(finalAnswer.toString());
	}
}

package org.comstudy21.ch01;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ch01Ex02 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("삼국지");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640, 480);
		frame.setVisible(true);
		
//		JOptionPane pane = new JOptionPane("자바 세상 시작은 옛날에 시작. Gotta learn other things on top it");
//		pane.setLocation(100, 200);
//		pane.setVisible(true);
		
		JOptionPane.showMessageDialog(null, "Hello World!");

	}

}

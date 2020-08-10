package org.comstudy21.ch01;

import javax.swing.JOptionPane;

public class Ch01Ex03 {

	public static void main(String[] args) {
		if(args.length > 0) {
			JOptionPane.showMessageDialog(null, args[0] + "님 환영합니다!");			
		} else {
			JOptionPane.showMessageDialog(null, "이름이 누락되었습니다");
			
		}
		
		

	}

}

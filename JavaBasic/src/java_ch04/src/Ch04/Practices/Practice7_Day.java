package Ch04.Practices;

import java.util.Scanner;

public class Practice7_Day {
	private String work; // �Ϸ翡 �� ���� ��Ÿ���� ���ڿ�
	
	
	//constructor
	public Practice7_Day() {
		
	}
	
	// setter getter. �̸� ���� �ȵ�
	public void set(String work) {
		this.work = work;
	}
	
	public String get() {
		return work;
	}
	
	// method
	public void show() {
		if(work == null) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println(work + "�Դϴ�.");
		}
	}
	
}

package org.comstudy21.ch05.ex02;

import org.comstudy21.ch05.ex02_1.Person;

class Student extends Person {
	public void set() {
//		age = 30; // Person Ŭ�������� ��� ����Ʈ �����������̹Ƿ� ������
		name = "ȫ�浿"; //public
		height = 175; // protected. Accessible through inheritance
//		weight = 99; // private�̹Ƿ� �翬�� ���� �ȵ�
		setWeight(99); //setter����  public�̹Ƿ� ����
	}
	
	public void showInfo() {
		
	}

	@Override
	public String toString() {
		return "Student [age=" + getAge() + ", height=" + height + ", name=" + name + "]";
	}
	
	
}



public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();

	}

}

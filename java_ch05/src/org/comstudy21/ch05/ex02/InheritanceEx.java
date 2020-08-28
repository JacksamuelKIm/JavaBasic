package org.comstudy21.ch05.ex02;

import org.comstudy21.ch05.ex02_1.Person;

class Student extends Person {
	public void set() {
//		age = 30; // Person 클래스에서 얘는 디폴트 접근제한자이므로 빨간줄
		name = "홍길동"; //public
		height = 175; // protected. Accessible through inheritance
//		weight = 99; // private이므로 당연히 접근 안됨
		setWeight(99); //setter값은  public이므로 가능
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

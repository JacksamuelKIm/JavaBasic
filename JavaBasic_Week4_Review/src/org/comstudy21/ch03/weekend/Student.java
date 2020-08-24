package org.comstudy21.ch03.weekend;

public class Student {
	
	int no;
	String name;
	
	
	int kor;
	int eng;
	int math;
	final int subNums =3;
	
	int total = 0;
	double avg = 0;
	String grade;
	
	int rank = 1;

	@Override
	public String toString() {
		return "no: " + no + ", name: " + name + ", kor: " + kor + ", eng: " + eng + ", math: " + math + ", total: "
				+ total + ", avg: " + avg + ", grade: " + grade + ", rank: " + rank;
		
	}
	
}
package org.comstudy21.ch03.array.homework;

import java.util.Scanner;
public class Ch03ArrEx00 {
static Scanner scanner = new Scanner (System.in);
	
	enum Week{월, 화, 수, 목, 금, 토, 일}
	public Ch03ArrEx00() {
	//		test01();
	//		test02();
	//		test03();
	//		test04();
		
		
	}
	
	private void test01() {
		// 예제 3-8
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라
		
		int [] arr = new int [5];
		int max = 0;
		int size = arr.length;
		System.out.print("양수 5개를 입력하시오>>>");
		for (int i = 0; i<5; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i]>max) {
				max = arr[i];
			}			
		}
		System.out.println("제일 큰 수: " + max);
	}
	
	private void test02() {
		// 예제 3-8 
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하라!
		
		
		int[] intArray = new int[7];
		int sum = 0;
		int arrSize =  intArray.length;
				
		System.out.print("정수를 " + arrSize + "개 입력하시오>> ");
		for (int i = 0; i<arrSize; i++) {
			intArray[i] = scanner.nextInt();
			sum = sum + intArray[i];
		}
		double average = (double) sum / arrSize;
		System.out.printf("평균은 %.2f이다", average);
		
	}

	private void test03() {
		// for each문 이용하여  sum 구하기
		int[] n = {1,2,3,4,5};
		int sum = 0;
		for ( int k : n) {
			sum +=k;
		}
		System.out.println(sum);
		
		// 예제  3-9 (for each문 연습)
		
	}
	
	private void test04() {
		// 출력
		String[] names = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		for (String s : names) {
			System.out.print(s + " ");
		}

	}
	
	


	public static void main(String[] args) {
		new Ch03ArrEx00();
		
		// enum 과 for each문 활용사례
		for (Week day : Week.values()) {
			System.out.print(day + "요일");
			System.out.println();
		}
		
		
		
		
		 
		
		

	}

}

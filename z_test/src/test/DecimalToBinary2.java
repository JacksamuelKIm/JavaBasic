package test;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("십진법 수 32비트 내에서 입력해보게>>");
		int n  = scanner.nextInt();
		int [] b = new int [32]; // int 어짜피 32비트 이니까 이게 최대(??)
		
		int i = 0;
		while (n != 1) {  // 첨부터 n <2라고 하면 진입 자체가 안 되는 경우가 대다수
			b[i] = n % 2; // 배열에다가 역순으로 2진법 값 넣어주기
			n = n / 2; // 이어서 나오는 몫(share)들을  계속해서 나눠주기 위해서
			if(n<2) {
				b[i+1] = n; //가장 마지막 몫이 1이니까 거기다 넣어줘야지
			}			
			i++; // 여기서 i = i+1 되니 걱정 no no
		}		
		
		//System.out.println(n); //제일 앞자리. 무조건 1이 되어야 할텐데.... => 휴 다행 이제 필요 없음
//		System.out.println(Arrays.toString(b)); // 배열 다 보는 방법
		//여기에서 String으로 변해서 계산이 안되나보다
		// => 엥 아니네 =>????
		
		
		//System.out.println(b[i]).indexof(b); // 확인을 하고 싶은데 함수를 모름;;;


		int j = 0;
		// 실험. 결과 문제 없음
//		System.out.println(b[i-j]);
		
		
		int[] b2;
		b2 = new int[j+1];
		for (j = 0; j < i + 1 ; j++) { //j의 한계 설정이 뭔가 이상해서 안됐던거 임. for 구문 파라미터 연구 필요
//			System.out.print(b[i-j]);
			b2 = new int[j+1];
			b2[j] = b[i-j];			
		}
		
		
		
		
		System.out.println(Arrays.toString(b2)); // for 밖으로 b2가 안나옴;;;;
		// # 남은 짜투리 0은 어떻게 제거하지?
		// # 총체적 난국
//		int j = 0;
//		while (i != 0) {  // 아 이 i가 0일 때를 여기더 안에 못 넣는게 안타깝군
//			b[j] = b[i];
//			i--; j++;
//		}
////		b[j+1] = b[i=0]; // 마지막 하나
//		
//		System.out.println(Arrays.toString(b));
		
		
	}

}

package org.comstudy21.ch03.array2;

public class Ch03ArrEx02 {

	public static void main(String[] args) {
		
		double score[][] = {{3.3, 3.4, 0, 0}, //���� ��, ��� �� �߰�
							{3.1,3.7, 0, 0}, 
							{2.8, 4.1, 0, 0}, 
							{3.0,3.9, 0, 0}};
		double sum =0;
		
			
		for (int year = 0; year<score.length; year++) {
			for (int term = 0; term<score[year].length ; term++) {
				if(term<2){
				score [year][2] += score[year][term];  //�� �̰� ����
				sum += score[year][term];
				}								
			}
			score [year][3] += score[year][2] / 2;
			
		}
		int y = score.length;
		int t = score[0].length/2;
		System.out.printf("8�б� �� ������ ��: %.2f\n",sum);
		System.out.printf("8�б� �� ������ ����� %.2f�̴�\n",sum/(y*t) );
		
		
		
		for (int year = 0; year<score.length; year++) {
			System.out.print((year+1)+"�г�  ");
			for (int term = 0; term<score[year].length ; term++) {
				if(term<2){
					System.out.print(score[year][term] +"  ");
				}
				if(term==2) {
					System.out.printf("��������: %.2f  ", score[year][term]);
				}
				if(term==3) {
					System.out.printf("�������: %.2f", score[year][term]);
				}
			}
			System.out.println();	
		}
	} // end

}

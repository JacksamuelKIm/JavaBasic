package reflectionOnWhatIlearnedToday;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aug142020 {
	/*
	 * 1. Buffer 
	 * Ű����� CPU�� �ӵ��� ���濪��
	 * 
	  InputStreamReader isr = new InputStreamReader(System.in);
	 	BufferedReader in = new BufferedReader(isr); �̷� ������ �� �ټ��� �ְ�
	 	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 	// InputStreamReader�� ���� �޾��ְ� �װ� BufferedReader�� wrapping
	 	// �׷��� ���⳪ �ѱ��� �ν��� �� �ִ�.
	 	 * 
	 	 * 
	 	 * 
	 * 
	 * 
	 * 2. for ��
	 * �ʱ⹮�� ���α׷��� �ʱ�ȭ��Ų�ٴ� ���� �ƴ�. Initialization��.
	 * ���ǽ��� ����� false�� �� ������ �ݺ�
	 * ���ǽ��� �� true�� �ǹ�
	 * 
	 * �������ϱ� ���� ���� ���� - �ݺ��� �ۿ� ���� �� �ʱ�ȭ�Ѵ�
	 * ���������� �ʱ�ȭ ���� ������ �� �� ���� ���� ����.
	 * �ʵ�� �ڵ����� �ʱ�ȭ�Ǹ� ���������� ������ ���� �Ǽ� ���� ���� ��
	 * 
	 * �ݺ� �� �۾��� �� i++ ���� �Ǵ� �͵� �ƴϰ� �ϳ��� �־�� �ϴ� �͵� �ƴϴ�.
	 * 
	 * ���α׷����� �� ���� ���Ϸ��� ���� ���� �ϳ��� �ܰ躰�� �غ���.

		1+3+5+7+9+11+13 = 49�� © ���� 

		=�� ����� ����

		if���� ġ�� ���� ���� �����ϰ� �׽�Ʈ �ؼ� 13579111349���� �̾ƺ���
	 * 
	 * for���� while���� ��ǻ� ����. ������ ���� �ٸ� ��
	 * 
	 * for�� ���ǹ��� ����ΰ� �ܺο��� �ʱ�ȭ �����൵ ��
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 
		for(int cnt = 1; cnt <=9 ; cnt++) {
			System.out.println(cnt); 						// �̷���  cnt �־ �Է��غ� cnt ==1�϶��� �״�� �����Ѵ� ��
			for (; startDan<=endDan ;startDan++) { 			// startDan�� �״�� �־��ָ� 1�ܸ� ������ ���� 
			System.out.printf("%d x %d = %d\t\n", startDan, cnt, startDan*cnt ); 		// startDan�� ������ �ִ� �����μ� ��. �װ� �ٲ�� �ȵ���
			} 												// ����� ��������ξ� �׳� startDan �ʱⰪ 6�̾����ϱ�(e.g)�׳� �״�� ��! ��� �ϰ���
		}	 												// ��ǻ�� ���忡���� ó������(cnt==1) �׳� ���� �ַ� �����߰�����, �� ���Ŀ��� �ʱ⹮�� �ƹ��͵� ������ ��Ȳ. �� �ϰ� ���� ��� �ȳ���!!!!!!!!! 	
			     											// ���� for�� �� �ܺ� for���� �׷����� �ʱⰪ (6)~������ ����(�� 1ȸ) ���������� / 1ȸ �̻�(���⼱ 4ȸ, �������̴� �ּ� 9ȸ �ݺ��Ҷ��� ���� ����
		
	
	*/
	
	
	
}

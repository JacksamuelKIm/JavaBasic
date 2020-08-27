package org.comstudy21.test2;
public class Ch04Ex14 {		
	public static void main(String[] args) {
		MusicPlayer mp = new MusicPlayer();
		
		mp.append(new Music("������", "�ٶ��� �뷡"));
		mp.append(new Music("�̼���", "�ο�"));
		mp.append(new Music("�̹���", "��ȭ������"));
		mp.append(new Music("������", "��� �ҳ��� �⵵"));
		mp.append(new Music("�Ͼ���", "�� ���� �ٴ尡"));
		
		mp.play(3); // �̹����� ��ȭ������ ���� ��
		mp.prev(); // �������� �̼����� �ο��Դϴ�.
		mp.next(); // �������� �������� ��� �ҳ��� ����뷡�Դϴ�.
		mp.playAll(); // ����缺					
	}	
	public static void test(String[] args) {
		Music[] playList = new Music[20];
		int top = 0;
		
		playList[top++] = new Music("������", "�ٶ��� �뷡");
		playList[top++] = new Music("�̼���", "�ο�");
		playList[top++] = new Music("�̹���", "��ȭ������");
		playList[top++] = new Music("������", "��� �ҳ��� �⵵");
		playList[top++] = new Music("�Ͼ���", "�� ���� �ٴ尡");
		
		
		for(int i=0; i<top; i++) {
			playList[i].play(); // �������� �ٶ��� �뷡�� ����˴ϴ�.
		}
	}
}

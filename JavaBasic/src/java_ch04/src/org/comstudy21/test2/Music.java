package org.comstudy21.test2;

public class Music {
	
	String singer;
	String song;
	
	
	Music() {
		this("","");
	}
	
	
	Music(String singer, String song) {
		this.singer = singer;
		this.song = song;
	}
	
	public void play() {
		System.out.printf("%s�� %s�� ����˴ϴ�.\n", singer, song);
	}
}

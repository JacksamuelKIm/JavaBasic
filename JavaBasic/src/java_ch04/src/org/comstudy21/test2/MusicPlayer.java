package org.comstudy21.test2;
public class MusicPlayer {
	private Music[] playList;
	private int top;
	private int i;
	
	public MusicPlayer() {
		playList = new Music[20];
		top = 0;
	}	
	public void append(Music music) {
		this.playList[top++] = music;		
	}	
	public void play(int i){
		this.i = (i-1);
		System.out.printf("다음은 %s의 %s입니다.\n",playList[i-1].singer, playList[i-1].song);
	}	
	public void prev(){		
		System.out.printf("이전곡은 %s의 %s입니다.\n",playList[i-1].singer, playList[i-1].song);
	}
	public void next(){
		System.out.printf("다음곡은 %s의 %s입니다.\n",playList[i+1].singer, playList[i+1].song);
	}
	public void playAll(){
		System.out.println();
		System.out.println("전 곡이 모두 재생됩니다.");
		for(int j = 0; j<top; j++) {
			System.out.printf("%s의 %s가 실행됩니다.\n", playList[j].singer, playList[j].song);
		}
	}
}

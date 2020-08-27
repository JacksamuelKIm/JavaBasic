package org.comstudy21.test2;
public class Ch04Ex14 {		
	public static void main(String[] args) {
		MusicPlayer mp = new MusicPlayer();
		
		mp.append(new Music("조용필", "바람의 노래"));
		mp.append(new Music("이선희", "인연"));
		mp.append(new Music("이문세", "광화문연가"));
		mp.append(new Music("민혜경", "어느 소녀의 기도"));
		mp.append(new Music("싹쓰리", "그 여름 바닷가"));
		
		mp.play(3); // 이문세의 광화문연가 실행 중
		mp.prev(); // 이전곡은 이선희의 인연입니다.
		mp.next(); // 다음곡은 민혜경의 어느 소녀의 사랑노래입니다.
		mp.playAll(); // 모두재성					
	}	
	public static void test(String[] args) {
		Music[] playList = new Music[20];
		int top = 0;
		
		playList[top++] = new Music("조용필", "바람의 노래");
		playList[top++] = new Music("이선희", "인연");
		playList[top++] = new Music("이문세", "광화문연가");
		playList[top++] = new Music("민혜경", "어느 소녀의 기도");
		playList[top++] = new Music("싹쓰리", "그 여름 바닷가");
		
		
		for(int i=0; i<top; i++) {
			playList[i].play(); // 조용필의 바람의 노래가 실행됩니다.
		}
	}
}

package Ch04.Practices;

class Song {
	String title, artist, country;
	int year;	
	
	public Song() {//�⺻ ������
		
	}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}	
	@Override
	public String toString() {
		return year + "�� " + country + "������  " + artist + "�� �θ� " + title;
	}

	public void show() {
		System.out.println(toString());
	}

}
public class Practice3 {	
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "Sweden");
		
		song.show();		
	}
}


package songs;

public class Songs {

	public static void main(String[] args) {

//		Song s = new Song();
//		s.setAlbum("Real");
//		s.setArtist("아이유");
//		s.setComposer("이민수");
//		s.setTitle("좋은날");
//		s.setTrack(3);
//		s.setYear(2010);
		
		Song s = new Song("좋은날","아이유","Real","이민수",2010,3);
		Song song2 = new Song( "러빙유", "씨스타");
	    Song song3 = new Song( "여수 밤바다", "버스커 버스커"); 
		
		s.show();
		song2.show();
		song3.show();

	}
}

package day18statickeyword;

public class Static01 {
	static int en=12;
	static int boy=10;
	static int yaricap=4;
	static double pi;
	static int alan;
	// e�er bir variable  degerini olu�tururken hesap yapmam�z gerekirse
	//"ststic blok" olu�turmak iyidir yani" int alan=en *boy yerine "ststic blok" olu�turup bu i�lemi
	//static blok i�ine  yazmak daha iyidir
	//static blok variable lara deger atamak i�in de kullanabilir
	//"ststic blok"  class�n i�inde b�t�n methodlar�n (main method dahil)ve condtructurlar�n di�inda olmal�dr
	//"ststic blok" class olu�turuldugu zaman olu�turulur
	//"ststic blok" t�m methodlardan  (main method dahil) ve constructorlardan �nce �al��t�r�l�r
	//birdrn fazla "ststic blok" �stteki �nce �al���r
	static {
	
		pi=3.14;
	}
	static {
		alan=en*boy;
		
	}

	public static void main(String[] args) {
		

	}
	//static classolu�turulabilir ama alt classlar (inner class)static class olabilirler
	//�st classlar (auter class)static class olamaz
	static class AltClass{
		
	}
}

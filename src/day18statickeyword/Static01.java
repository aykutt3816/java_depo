package day18statickeyword;

public class Static01 {
	static int en=12;
	static int boy=10;
	static int yaricap=4;
	static double pi;
	static int alan;
	// eðer bir variable  degerini oluþtururken hesap yapmamýz gerekirse
	//"ststic blok" oluþturmak iyidir yani" int alan=en *boy yerine "ststic blok" oluþturup bu iþlemi
	//static blok içine  yazmak daha iyidir
	//static blok variable lara deger atamak için de kullanabilir
	//"ststic blok"  classýn içinde bütün methodlarýn (main method dahil)ve condtructurlarýn diþinda olmalýdr
	//"ststic blok" class oluþturuldugu zaman oluþturulur
	//"ststic blok" tüm methodlardan  (main method dahil) ve constructorlardan önce çalýþtýrýlýr
	//birdrn fazla "ststic blok" üstteki önce çalýþýr
	static {
	
		pi=3.14;
	}
	static {
		alan=en*boy;
		
	}

	public static void main(String[] args) {
		

	}
	//static classoluþturulabilir ama alt classlar (inner class)static class olabilirler
	//üst classlar (auter class)static class olamaz
	static class AltClass{
		
	}
}

package day21multidimensionalarray;

public class SplitMethodSoru {

	public static void main(String[] args) {
		// verilen bir cumledeki bo�luklar hari� charakter  say�s�n� bulunuz.
		//c�mle"verilen bir cumledeki bo�luklar hari� charakter  say�s�n� bulunuz."
		
		String str="verilen bir cumledeki bo�luklar hari� charakter  say�s�n� bulunuz.";
		str=str.replace(" ", "");//bo�luklar� att�k
		String character[]=str.split("");
	System.out.println(character.length);	
	
	
	//2. yol
	 //Bosluk sayisi kelime sayisindan bir azdir
    //Bosluk sayisi = Kelime sayisi - 1
    String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
    
    String kelime[] = str1.split(" ");
    int boslukSayisi = kelime.length - 1;
    System.out.println(boslukSayisi);
    
    String harf[] = str1.split("");
    System.out.println(harf.length - boslukSayisi);
	
	}

}

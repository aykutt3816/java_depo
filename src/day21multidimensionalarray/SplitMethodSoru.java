package day21multidimensionalarray;

public class SplitMethodSoru {

	public static void main(String[] args) {
		// verilen bir cumledeki boþluklar hariç charakter  sayýsýný bulunuz.
		//cümle"verilen bir cumledeki boþluklar hariç charakter  sayýsýný bulunuz."
		
		String str="verilen bir cumledeki boþluklar hariç charakter  sayýsýný bulunuz.";
		str=str.replace(" ", "");//boþluklarý attýk
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

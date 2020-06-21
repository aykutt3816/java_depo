package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
	
	byte by = 101;	// kücük datayý büyük data ya cevirmeyi jawa otomatik yapar
		//auto Widening
	int sayi1= by;	
	System.out.println(sayi1);	
		
		int sayi2 =53;
		byte by2 = (byte) sayi2;//büyük datayý kücük dataya jawa tarafindan yapilmaz
		System.out.println(by2);// dönüsturmek istedimiz data tipini parantez icinde yazýlýr
	                         	//Explicit Narrowing casting
		
	double sayi3 =23.5;
	int by3 = (int) sayi3;
		System.out.println(by3);//23
		float sayi4 = -23.9f;
		short by4 = (short) sayi4;
		System.out.println(by4);
		
		
		double sayi5 = 4.8;
		double sayi6 = 1.4;
		double sonuc1 = sayi5 /sayi6;
		System.out.println(sonuc1);//3.428571428571429
		
		int sonuc2 = (int) (sayi5 / sayi6);
		System.out.println(sonuc2);//3
		
		int sayi7 = 5;
		int sayi8 = 3;
		int sonuc3 =sayi7 / sayi8;//1.6666666.. gider ama data type i int yaparsanýz
	System.out.println(sonuc3);	                             // sadece tam kýsmý cýkar
		
		int sayi9 = 255;
		byte by5 = (byte) sayi9;
		System.out.println(by5);//normalde byte (-128....-101..127)256 sayi var 255 1 eksik
	                               	// bu yuzden -1 ekrana yazýlýr
	                     	//255i 256 ya böler kalaný yazar
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

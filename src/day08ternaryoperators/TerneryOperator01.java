package day08ternaryoperators;

import java.util.Scanner;

public class TerneryOperator01 {

	public static void main(String[] args) {
		// kullanýcýdan bir sayi alýnýz 
		//sayý pozitif veya sifir ise pozitif veya 0 yazdýrýnýz
		//sayý negatif ise negati yazdýrýnýz

	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen bir sayý giriniz");
	int num=scan.nextInt();
	if( num>=0) {
		System.out.println("pozitif veya 0");
	}else  {
		System.out.println("negatif");
	}
	
	//ternery op (if else)
	//condition yazýp soru iþareti    cond. dogru ise  iki nokta üst üste    cond. dogru ise
	String sonuc=(num>=0) ?          "pozitif veya 0"          :                 "negatif";
	System.out.println(sonuc);
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}

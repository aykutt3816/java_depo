package day08ternaryoperators;

import java.util.Scanner;

public class TerneryOperator01 {

	public static void main(String[] args) {
		// kullan�c�dan bir sayi al�n�z 
		//say� pozitif veya sifir ise pozitif veya 0 yazd�r�n�z
		//say� negatif ise negati yazd�r�n�z

	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen bir say� giriniz");
	int num=scan.nextInt();
	if( num>=0) {
		System.out.println("pozitif veya 0");
	}else  {
		System.out.println("negatif");
	}
	
	//ternery op (if else)
	//condition yaz�p soru i�areti    cond. dogru ise  iki nokta �st �ste    cond. dogru ise
	String sonuc=(num>=0) ?          "pozitif veya 0"          :                 "negatif";
	System.out.println(sonuc);
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}

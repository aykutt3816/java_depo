package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		//kullan�c�dan ad ve soadini alalim ekrana yazd�ral�m
		//kullan�cdan adres alp yazd�ral�m 2.cadde Bakirkoy istanbul turkiye
		// yasini alip ekrana yazdiralim
		//turkkiyede yasiyorum dogru yanli� olarak yazd�ralim
		// true folse olarak
		
		
		
	Scanner scan =new Scanner(System.in);
		
		System.out.println("lutfen ad ve soyadinizi giriniz");
		System.out.println("adresinizi giriniz");
		System.out.println("yasinizi giriniz");
		System.out.println("t�rkiyede yasiyorum. tru/false");
		boolean blTr =scan.nextBoolean();
		System.out.println(blTr);
		scan.close();

	}

}

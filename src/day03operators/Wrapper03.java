package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		//kullanýcýdan ad ve soadini alalim ekrana yazdýralým
		//kullanýcdan adres alp yazdýralým 2.cadde Bakirkoy istanbul turkiye
		// yasini alip ekrana yazdiralim
		//turkkiyede yasiyorum dogru yanliþ olarak yazdýralim
		// true folse olarak
		
		
		
	Scanner scan =new Scanner(System.in);
		
		System.out.println("lutfen ad ve soyadinizi giriniz");
		System.out.println("adresinizi giriniz");
		System.out.println("yasinizi giriniz");
		System.out.println("türkiyede yasiyorum. tru/false");
		boolean blTr =scan.nextBoolean();
		System.out.println(blTr);
		scan.close();

	}

}

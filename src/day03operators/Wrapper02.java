package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
	//kullanicidan ilk isim alýn yazdýrýn
	//soyisminialýn ekrana ilk ismin altýna yazdýrýn	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Ilk isminizi girin");
		
		String ilkIsim=scan.nextLine();
		System.out.println("soy isminizi girin");
		String soyIsim =scan.nextLine();
		System.out.println(ilkIsim);
		System.out.println(soyIsim);
		
		
		
		
		
		
scan.close();		
		

	}

}

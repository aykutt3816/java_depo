package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
	//kullanicidan ilk isim al�n yazd�r�n
	//soyisminial�n ekrana ilk ismin alt�na yazd�r�n	
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

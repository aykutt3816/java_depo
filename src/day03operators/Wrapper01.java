package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {

	//kullan�c�dan  ad ve soyad al ekrana yazdr	
		
	//String kullan	
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen adinizi ve soyadinizi giriniz");
		
		String isim = scan.nextLine();//Stringleri kullan�c�dan almak next veya nextL�NE KULLANILR
		//next tek kelime i�in kullan�l�r
		//nextLine girilen t�m Stringler() icin kullanilir
		
		System.out.println(isim);
		
		
		
		
		
scan.close();
	}

}

package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {

	//kullanýcýdan  ad ve soyad al ekrana yazdr	
		
	//String kullan	
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen adinizi ve soyadinizi giriniz");
		
		String isim = scan.nextLine();//Stringleri kullanýcýdan almak next veya nextLÝNE KULLANILR
		//next tek kelime için kullanýlýr
		//nextLine girilen tüm Stringler() icin kullanilir
		
		System.out.println(isim);
		
		
		
		
		
scan.close();
	}

}

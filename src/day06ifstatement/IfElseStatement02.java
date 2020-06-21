package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// kullanýcýdan bir tam sayi isteyin otam sayinin mutlak degerini ekrana yazdýrýn
        //mutlak deger sayinin kendi isareti ile carpýmý
		//-3.-1=3       3.+1=3      o ýn mutlak degri sifirdr
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int ts=scan.nextInt();
		if(ts>0) {
			System.out.println(ts*(+1));
		}else {
			System.out.println(ts*(-1));
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		scan.close();	
		
		
		
		
	}

}

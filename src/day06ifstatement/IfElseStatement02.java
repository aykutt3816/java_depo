package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// kullan�c�dan bir tam sayi isteyin otam sayinin mutlak degerini ekrana yazd�r�n
        //mutlak deger sayinin kendi isareti ile carp�m�
		//-3.-1=3       3.+1=3      o �n mutlak degri sifirdr
		
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

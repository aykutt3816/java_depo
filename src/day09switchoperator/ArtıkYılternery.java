package day09switchoperator;

import java.util.Scanner;

public class Art�kY�lternery {

	public static void main(String[] args) {
		
	
	
	
	
	
	
		// Kullan�c�dan bir y�l girmesini isteyin, 
		//y�l art�k y�l ise ekrana �Art�k y�l� degilse ekrana �Art�k y�l degil� yazd�r�n
//100 b�l�n�yorsa 400          100 e b�l�nm�yorsa  4 e b�l�nmeli
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir y�l giriniz");
	    int yil=scan.nextInt();
	
String result=	(yil%100==0&&yil%400==0)?"Art�k y�l":yil%100!=0 && yil%4==0?"Art�k y�l":"Art�k y�l degil";

	System.out.println(result);
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// kullan�c�dan bir say� al�n
		//bu say� pozitif veya 0 ise 9 dan b�y�km� diye kontrol edin9 dan b�y�k ise ekrana say� yazd�r�n
		//9 dan k�c�k esit ve s�f�rdan b�y�k e�itse ekrana rakam yazd�r�n
        // bu say� negatif ise say� yazd�r�n
		
	Scanner scan=new Scanner(System.in);
	System.out.println("bir tamsayi giriniz");
	
	int num=scan.nextInt();
	if(num>=0) {
		if(num>9) {
			System.out.println("sayi");
		}else if(num<=9&&num>=0) {
			System.out.println("rakam");
		}
	}else if(num<0) {
		System.out.println("sayi");
	}
	
	
	
	
	
	
	
	
	scan.close();// scanner class �n� kulland�ktan sonra en altta main metodun icinde  scanner class �n� kapat�n�z
	//kapatmak i�in scan.close(); yazmak yeterlidir
	}

}

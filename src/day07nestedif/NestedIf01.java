package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý alýn
		//bu sayý pozitif veya 0 ise 9 dan büyükmü diye kontrol edin9 dan büyük ise ekrana sayý yazdýrýn
		//9 dan kücük esit ve sýfýrdan büyük eþitse ekrana rakam yazdýrýn
        // bu sayý negatif ise sayý yazdýrýn
		
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
	
	
	
	
	
	
	
	
	scan.close();// scanner class ýný kullandýktan sonra en altta main metodun icinde  scanner class ýný kapatýnýz
	//kapatmak için scan.close(); yazmak yeterlidir
	}

}

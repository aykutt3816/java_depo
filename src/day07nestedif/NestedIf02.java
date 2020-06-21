package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// kullanıcıdan password girmesiniisteyin
		//password 4 basamaklı bir sayiise ciftolup olmadigini kontrol edin
		// çift ise ekrana Password tamam yazdırın tek sayı ise tkrr deneyın yazdırın 
		//password 4 basamaklı degilse tkrr denryin yazdırın
	//4basmaklı   999 dan buyuk 10000 den küçük
		//0123 java icin 123 demektir
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen  tamsyı olarak password giriniz");
	int num=scan.nextInt();
	if(num>999&&num<10000) {
		
	
	if (num%2==0) {
		System.out.println("password tmm");
	
	
	}else if(num%2!=0) {
		System.out.println("tkrr deneyin ilk"); 
	}
	
	
	}else {
		System.out.println("tkrr deneyin son");
	}
	
	
	
	
	
	
	
	
	scan.close();
	
	
	}

}

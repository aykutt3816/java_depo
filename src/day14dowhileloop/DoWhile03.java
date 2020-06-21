package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		//kullanýcýdan sayý alýn
		//sayý ondan küçükise ekrana kazandýnýz yazdýrýn
		//sayý 10 veya 10 dan büyük ise tekrar deneyin yazdýrýnýz
		
		Scanner scan=new Scanner(System.in);
		
		int num=0;
		
		do {
			System.out.println("lütfen bir sayý deðerini giriniz");
			num=scan.nextInt();
		}while(num>=10);
		
		System.out.println("kazandýnýz");
		
		
	scan.close();
		
		
		

	}

}

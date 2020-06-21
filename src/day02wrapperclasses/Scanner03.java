package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
	
	//kullanýcýdan alýnan birsayýnýn kübünü bulunuz
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen birsayý girin");
		
		int sayi1 = scan.nextInt();
		
		System.out.println(sayi1*sayi1*sayi1);
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}

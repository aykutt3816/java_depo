package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
	
	//kullan�c�dan al�nan birsay�n�n k�b�n� bulunuz
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen birsay� girin");
		
		int sayi1 = scan.nextInt();
		
		System.out.println(sayi1*sayi1*sayi1);
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		

	}

}

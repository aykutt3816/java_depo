package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		//kullan�c�dan say� al�n
		//say� ondan k���kise ekrana kazand�n�z yazd�r�n
		//say� 10 veya 10 dan b�y�k ise tekrar deneyin yazd�r�n�z
		
		Scanner scan=new Scanner(System.in);
		
		int num=0;
		
		do {
			System.out.println("l�tfen bir say� de�erini giriniz");
			num=scan.nextInt();
		}while(num>=10);
		
		System.out.println("kazand�n�z");
		
		
	scan.close();
		
		
		

	}

}

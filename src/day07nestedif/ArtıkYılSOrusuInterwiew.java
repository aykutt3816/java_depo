package day07nestedif;

import java.util.Scanner;

public class Art�kY�lSOrusuInterwiew {

	public static void main(String[] args) {
		// kullan�c�dan y�l girmesini isteyin
//girilen y�l art�k y�l se art�k y�l
//girilen y�l art�k y�l degil se art�k y�l	degil yazd�r�n
	
	//art�k y�l 29 subat cekmesi  1)y�l100 e b�l�n�rse 400 ede b�l�nmeli
	//2)y�l100 e b�l�nmezse 4 e b�l�nmeli (100 den k���k say�lar)
	Scanner scan=new Scanner(System.in);
	System.out.println("y�l giriniz");
	int yil=scan.nextInt();
	if(yil%100==0 && yil%400==0) {
		System.out.println(yil+" art�ky�l");
	}else if(yil%100!=0 && yil%4==0) {
		System.out.println(yil+" art�k y�ld�r");
	}
	else {
		System.out.println(yil+" art�ky�l de�ildir");
	}
	
	
	scan.close();
	
	
	}

}

package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		//kullan�c�dan 3 basamakl� bir tam say� al�n rakamlar� top bulun
		
		Scanner scan =new Scanner(System.in);
		System.out.println("ucbasamakl� tam say�  girin");
		int s = scan.nextInt();
		int sonRakam = s%10;
		int v = s/10;
		int ortaRakam = v%10;
		int ilkRakam = s/100;//3 basamakl� say�lar�n �lk rakam� bulmak i�in say� 100 bolunur
		//4 basamakl� say�lar�n �lk rakam� bulmak i�in say� 1000 bolunur....
		System.out.println(sonRakam+ortaRakam+ilkRakam);
		
		
		
		
		scan.close();
		
		
		
		
		
	}

}

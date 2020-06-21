package day06ifstatement;

import java.util.Scanner;

public class IfElsIFStatement02 {

	public static void main(String[] args) {
		//Kullanicidan sinav notunu tamsayi olarak girmesini isteyin
		//Negatif girerse ekrana "Yanlis deger girdiniz" yazdirin
		//0 dan buyuk ve esit 50 den kucuk girerse ekrana "kaldiniz" yazdirin
		//50 den buyuk ve esit 80 den kucuk ise ekrana "Gectiniz" yazdirin
		//80 den buyuk ve esit 100 den kucuk ise ekrana "Tebrikler" yazdirin
	
		Scanner scan=new Scanner(System.in);
		System.out.println("sýnav notunuzu tamsayi olarak giriniz");
		
	int sn =scan.nextInt();
	if(sn<0) {
		System.out.println("negatif deger giremezsiniz");
	}else if(sn<50) {
		System.out.println("kaldýnýz");
	}else if(sn<80) {
		System.out.println("gectiniz");
	}else if(sn<=100) {
		System.out.println("tebrikler");
	}else {
		System.out.println("100 den büyük giremezsiniz");
	}
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	}

}

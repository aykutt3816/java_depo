package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// kullan�c�dan password girmesiniisteyin
		//password 4 basamakl� bir sayiise ciftolup olmadigini kontrol edin
		// �ift ise ekrana Password tamam yazd�r�n tek say� ise tkrr deney�n yazd�r�n 
		//password 4 basamakl� degilse tkrr denryin yazd�r�n
	//4basmakl�   999 dan buyuk 10000 den k���k
		//0123 java icin 123 demektir
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen  tamsy� olarak password giriniz");
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

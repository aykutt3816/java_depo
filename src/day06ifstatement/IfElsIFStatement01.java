package day06ifstatement;

import java.util.Scanner;

public class IfElsIFStatement01 {

	public static void main(String[] args) {
		// KULLANICIDAN yasini alin 
	//yas 13 den az ise ekran calisamaz mes yazdirin
	//yas 13 den 65 e kadar ise ekrana calisabilir yazdirin
	//yas 65 ten buyuk se emekli yazzdýrýn
	// negatifsayý girerse yas negatif olamaz yazsýn ekran	
		
		Scanner scan=new Scanner(System.in);
	System.out.println("yasýnýzý giriniz");
	
	int yas=scan.nextInt();
	
	if(yas<0) {
		System.out.println("yas negatifolamaz");
	}else if(yas<13) {
		System.out.println("calisamaz");
	}else if(yas<=65) {
		System.out.println("calisabilir");
		
	}else {
		System.out.println("emekli");
	}
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	}

}

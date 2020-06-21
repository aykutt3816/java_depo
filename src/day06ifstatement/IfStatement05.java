package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		// kullanicidan bir dikdortgenin en ve boy alýnýz
		//en ve boy esitse bu bir karedir yazdýrýn
		// farkliise bu bir dikdortgendir yazdýrýn
		Scanner scan =new Scanner(System.in);
		System.out.println("lütfen en  ve boy giriniz");
		int en=scan.nextInt();
		int boy=scan.nextInt();
		//if(en==boy) {
	//		System.out.println("bu bir karedir");
	//	}
		
	//	if(en!= boy) {
	//		System.out.println("bu bir dikdortgendir");
	//	}
		
		
		//else==> diger ihtimallerin tamami
		
		//en ile boy ya esittir yada degildir
		
		if(en==boy) {
			System.out.println("bu bir karedir");
		}else {
			System.out.println("bu bir dikdortgendir");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

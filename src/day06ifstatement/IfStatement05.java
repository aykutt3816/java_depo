package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		// kullanicidan bir dikdortgenin en ve boy al�n�z
		//en ve boy esitse bu bir karedir yazd�r�n
		// farkliise bu bir dikdortgendir yazd�r�n
		Scanner scan =new Scanner(System.in);
		System.out.println("l�tfen en  ve boy giriniz");
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

package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// kullanýc haftanýn gün numarasýný girsin
		//// Programiniz gunun ismini yazsin
	//yanliþ gün girerse "gecerli gün sayýsý giriniz"
		// switch() kullanarak yapiniz.
 
		
		Scanner  scan=new Scanner(System.in);
	System.out.println("lütfen haftanýn gün sayýsýný giriniz");
	  int day=scan.nextInt();
		
	switch (day){
		case 1:
	System.out.println("pazartesi");
	break;
		case 2:
	System.out.println("salý");
	break;
		case 3:
	System.out.println("carsamba");
	break;
		case 4:
		System.out.println("persembe");
		break;
		
		case 5:
		System.out.println("cuma");
		break;
		
		case 6:
		System.out.println("cumartesi");
		break;
		
		case 7:
		System.out.println("pazar");
		break;
		default:
	System.out.println("gecerli gün no giriniz");
	}
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	}

}

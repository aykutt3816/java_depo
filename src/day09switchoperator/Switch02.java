package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// kullan�c haftan�n g�n numaras�n� girsin
		//// Programiniz gunun ismini yazsin
	//yanli� g�n girerse "gecerli g�n say�s� giriniz"
		// switch() kullanarak yapiniz.
 
		
		Scanner  scan=new Scanner(System.in);
	System.out.println("l�tfen haftan�n g�n say�s�n� giriniz");
	  int day=scan.nextInt();
		
	switch (day){
		case 1:
	System.out.println("pazartesi");
	break;
		case 2:
	System.out.println("sal�");
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
	System.out.println("gecerli g�n no giriniz");
	}
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	}

}

package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// kullan�c� ay ismini girsin program kac�nc� ay oldugunu yazs�n
		// buyk harf kucuk harf hepsi icin �al��s�n
		//yanl�� ay ismi ise gecerli ay ismi giriniz

		Scanner  scan=new Scanner(System.in);
		System.out.println("l�tfen  ay ismini giriniz");
		 
		String ay	=scan.next();
		ay=ay.toLowerCase();//STR�NGLER� K���K HARFE �EV�RMEK ���N KULLANILIR
		
		
	switch( ay) {
	case "ocak":
		System.out.println("1.ay");
		break;
	case "�ubat":
		System.out.println("2.ay");
		break;
	case "mart":
		System.out.println("3.ay");
		break;
	case "nisan":
		System.out.println("4.ay");
		break;
	case "may�s":
		System.out.println("5.ay");
		break;
	case "haziran":
		System.out.println("6.ay");
		break;
	case "temmuz":
		System.out.println("7.ay");
		break;
	case "agustos":
		System.out.println("8.ay");
		break;
	case "eyl�l":
		System.out.println("9.ay");
		break;
	case "ekim":
		System.out.println("10.ay");
		break;
	case "kas�m":
		System.out.println("11.ay");
		break;
	case "aral�k":
		System.out.println("12.ay");
		break;
	default:
	System.out.println("gecerli bir ay giriniz");
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}

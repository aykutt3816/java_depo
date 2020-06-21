package day09switchoperator;

import java.util.Scanner;

public class ArtýkYýlternery {

	public static void main(String[] args) {
		
	
	
	
	
	
	
		// Kullanýcýdan bir yýl girmesini isteyin, 
		//yýl artýk yýl ise ekrana “Artýk yýl” degilse ekrana “Artýk yýl degil” yazdýrýn
//100 bölünüyorsa 400          100 e bölünmüyorsa  4 e bölünmeli
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir yýl giriniz");
	    int yil=scan.nextInt();
	
String result=	(yil%100==0&&yil%400==0)?"Artýk yýl":yil%100!=0 && yil%4==0?"Artýk yýl":"Artýk yýl degil";

	System.out.println(result);
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

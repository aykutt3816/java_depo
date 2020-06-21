package day08ternaryoperators;

import java.util.Scanner;

public class TerneryOperator03 {

	public static void main(String[] args) {
		//kullanýcýdan iki sayi alýnýz
		// kücük sayýyý ekrana yazdýrýnýz
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen iki sayý giriniz");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
	double result =  (num1>=num2) ?  num2  :num1;
	System.out.println(result);
	
	
	
	
	
	
	
	
	
scan.close();
	
	
	
	
	
	
	
	}

}

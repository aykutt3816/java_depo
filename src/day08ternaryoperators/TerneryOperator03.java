package day08ternaryoperators;

import java.util.Scanner;

public class TerneryOperator03 {

	public static void main(String[] args) {
		//kullan�c�dan iki sayi al�n�z
		// k�c�k say�y� ekrana yazd�r�n�z
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen iki say� giriniz");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
	double result =  (num1>=num2) ?  num2  :num1;
	System.out.println(result);
	
	
	
	
	
	
	
	
	
scan.close();
	
	
	
	
	
	
	
	}

}

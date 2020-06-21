package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaziniz.
		
	Scanner scan = new Scanner(System.in);
		
	System.out.println("dort basamakli bir sayý girin");
	
		int s = scan.nextInt();// birler basam bulmak için ona böleriz
		int sonRakam = s%10;//
		
		int ilkRakam = s/1000;
		System.out.println(sonRakam+ilkRakam);//1+4=5
		
		
		
		scan.close();
		
		
	}

}

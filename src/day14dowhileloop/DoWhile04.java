package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// kullanýcýdan bir String alýn
		//bu Stringin indexi tek sayý olan karakterlerini ekrana yazdýrýn
       // almanya      l,a,y
		Scanner scan=new Scanner(System.in);
	System.out.println("lütfen bir kelime ve cümle giriniz ");
	String str=scan.nextLine();
	int lenght=str.length();
	int i=0;
	do {
		if(i%2==1) {
			System.out.print(str.charAt(i)+" ");
		}
		i++;
	}while(i<lenght);
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	}

}

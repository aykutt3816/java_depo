package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// kullan�c�dan bir String al�n
		//bu Stringin indexi tek say� olan karakterlerini ekrana yazd�r�n
       // almanya      l,a,y
		Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen bir kelime ve c�mle giriniz ");
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

package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview {

	public static void main(String[] args) {
		// kullan�c�dan bir string al�n ve bu stringi ekrana tersten yazd�r�n

	Scanner scan=new Scanner(System.in);
	System.out.println("bir c�mle veye kelime giriniz");
	String str=scan.nextLine();
//	for(int i=str.length()-1;i>=0;i--) {
//		System.out.print(str.charAt(i));//nac ilA
//	}
	
	int lenght=str.length()-1;
	while(lenght>=0) {
		System.out.print(str.charAt(lenght));
		lenght--;
	}
	
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}

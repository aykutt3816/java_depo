package day07nestedif;

import java.util.Scanner;

public class odevCharSorusu {

	public static void main(String[] args) {
		//harf ise harf   karakter ise karakter yazdırın

		Scanner scan=new Scanner(System.in);
	System.out.println("bir karakter girin");
	char harf=scan.next().charAt(0);//kullanıcıdan char  next()charAt(0); ile alinir
	
	if( (harf<=122&&harf>=97)||(harf<=90&&harf>=65)){
		System.out.println("bu bir harftir");
	}else {
		System.out.println("bu harf değildir");
	}
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	}
	
}

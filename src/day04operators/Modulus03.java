package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		//kullanýcýdan 3 basamaklý bir tam sayý alýn rakamlarý top bulun
		
		Scanner scan =new Scanner(System.in);
		System.out.println("ucbasamaklý tam sayý  girin");
		int s = scan.nextInt();
		int sonRakam = s%10;
		int v = s/10;
		int ortaRakam = v%10;
		int ilkRakam = s/100;//3 basamaklý sayýlarýn ýlk rakamý bulmak için sayý 100 bolunur
		//4 basamaklý sayýlarýn ýlk rakamý bulmak için sayý 1000 bolunur....
		System.out.println(sonRakam+ortaRakam+ilkRakam);
		
		
		
		
		scan.close();
		
		
		
		
		
	}

}

package day06ifstatement;

import java.util.Scanner;

public class IfElsIFStatement03 {

	public static void main(String[] args) {
		// kullanýcýdan 6 basamakli bir sayi isteyin,0 ilede baslayabilir
	//kazanma ihtimali %20 , amorti ihtimali%30,kaybetme ihtimali%50 olan bir
	//jackpot oyunu icin program yazýnýz
	//000000-000001-000002-.....-999998-99999==>100000 tane sayi
	
		Scanner scan=new Scanner(System.in);
		System.out.println("altý basamaklý bir sayi giriniz sifir basta kullanilabilir\"");
	int num=scan.nextInt();
	if(num<200000) {
		System.out.println("kazandýnýz");
	}else if(num<500000) {
		System.out.println("tekrar deneyin");
	}else {
		System.out.println("kaybettiniz");
	}
	
	

	
	
	scan.close();
	
	
	
	
	
	
	
	}

}

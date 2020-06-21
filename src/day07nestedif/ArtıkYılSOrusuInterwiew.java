package day07nestedif;

import java.util.Scanner;

public class ArtýkYýlSOrusuInterwiew {

	public static void main(String[] args) {
		// kullanýcýdan yýl girmesini isteyin
//girilen yýl artýk yýl se artýk yýl
//girilen yýl artýk yýl degil se artýk yýl	degil yazdýrýn
	
	//artýk yýl 29 subat cekmesi  1)yýl100 e bölünürse 400 ede bölünmeli
	//2)yýl100 e bölünmezse 4 e bölünmeli (100 den küçük sayýlar)
	Scanner scan=new Scanner(System.in);
	System.out.println("yýl giriniz");
	int yil=scan.nextInt();
	if(yil%100==0 && yil%400==0) {
		System.out.println(yil+" artýkyýl");
	}else if(yil%100!=0 && yil%4==0) {
		System.out.println(yil+" artýk yýldýr");
	}
	else {
		System.out.println(yil+" artýkyýl deðildir");
	}
	
	
	scan.close();
	
	
	}

}

package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		//kullanicidan alacagi urun miktarini  ve fiyatinialalim
	//eger kullan�c� 1000 den fazla urun al�rsa %20 ind yapan
	//kullan�c�nn odeyecegi degeri yazd�r�n
	//kullan�c� 1000 den az  ve 1000urun al�rsa %20 ind yapmayn
	//kullan�c�nn odeyecegi degeri yazd�r�n
	//�rnek.  60 e%20indirim60*80/100
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen  miktari giriniz");
	
	double miktar=scan.nextDouble();
	System.out.println("l�tfen urunfiyat giriniz");
	double fiyat=scan.nextDouble();
	if(miktar>1000) {
		System.out.println(miktar*(fiyat*80)/100);
	}else {
		System.out.println(miktar*fiyat);
	}
	
	
	
	
	
	scan.close();
	
	
	
	
	
	}

}

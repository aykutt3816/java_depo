package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		//kullanicidan alacagi urun miktarini  ve fiyatinialalim
	//eger kullanýcý 1000 den fazla urun alýrsa %20 ind yapan
	//kullanýcýnn odeyecegi degeri yazdýrýn
	//kullanýcý 1000 den az  ve 1000urun alýrsa %20 ind yapmayn
	//kullanýcýnn odeyecegi degeri yazdýrýn
	//örnek.  60 e%20indirim60*80/100
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen  miktari giriniz");
	
	double miktar=scan.nextDouble();
	System.out.println("lütfen urunfiyat giriniz");
	double fiyat=scan.nextDouble();
	if(miktar>1000) {
		System.out.println(miktar*(fiyat*80)/100);
	}else {
		System.out.println(miktar*fiyat);
	}
	
	
	
	
	
	scan.close();
	
	
	
	
	
	}

}

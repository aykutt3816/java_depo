package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		// saatisaniyeye  mili km ye      kg grama 
		// çevirem method yazýnýz
		// Bu methodu main methodun disinda olusturup main methodun
		// icinden cagiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("birimi  giriniz");
        String birim=scan.nextLine().toLowerCase();
        System.out.println("miktarý giriniz");
        double miktar=scan.nextDouble();
        donusturucu(birim,miktar);//10800
        scan.close();
}
	public static void donusturucu(String birim,double miktar) {
		switch(birim) {
		case "saat":
		System.out.println(	miktar*60*60);
		break;
		case "mil":
		System.out.println(	miktar*1.6);
		break;
		case "kg":
			System.out.println(	miktar*1000);
			break;
			default:
				System.out.println("saat mil kg diþinda miktar girmeyiniz");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
package day34collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		//kullan�c�dan ad�n� ve soyad�n� al�n�z
		//ad ve soyad�n� konsola yazd�r�n
		//sadece ad�n� konsola yazd�r�n
		//ad ve soyad�n�n �lk harflerini consolo yazd�r�n
		//ad ve soyad�n� tersten yazd�r�n
		//ad ve soyad�nda kullan�lan t�m karakterleri alfabetik s�raya g�re yazd�r�n
		Scanner scan=new Scanner(System.in);
	
		System.out.println("l�tfen ad�n�z� giriniz");
String ad=scan.nextLine();
System.out.println("l�tfen soyad�n�z� giriniz");
String soyad=scan.nextLine();
System.out.println("ad ve soyad : "+ad+" "+soyad);
System.out.println("sadece ad "+ad);
System.out.println("ilk harfler : "+ad.charAt(0)+" "+soyad.charAt(0));
System.out.print("tersten ad soyad:");
          for (int i=ad.length()-1;i>=0;i--) {
	System.out.print(ad.charAt(i));
          }
          System.out.print(" ");
     for (int i=soyad.length()-1;i>=0;i--) {
	System.out.print(soyad.charAt(i));
	
   }
     System.out.println();
     String tamad=ad+soyad;
 	String arr[]=tamad.split("");
 	Arrays.sort(arr);
 System.out.println(	Arrays.toString(arr));
//		 // Kullanicidan adini ve soyadini aliniz
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Ilk adinizi giriniz");
//        String ilkAd = scan.next();
//        System.out.println("Soyadinizi giriniz");
//        String soyAd = scan.next();
//        
//        // 1)Ad ve soyadini console'a yazdirin
//        System.out.println("Tam Ad: " + ilkAd + " " + soyAd);
//        
//        // 2)Sadece adini console'a yazdirin
//        System.out.println("Ilk ad: " + ilkAd);
//            
//        // 3)Ad ve soyadinin ilk harflerini console'a yazdirin
//        System.out.println("Ilk adin ilk harfi: " + ilkAd.charAt(0));
//        System.out.println("Soyadin ilk harfi: " + soyAd.charAt(0));
//        
//        // 4)Ad ve soyadini console'a tersten yazdirin
//        StringBuilder strB = new StringBuilder(ilkAd + " " + soyAd);
//        System.out.println("Tam isim tersten yazildi: " + strB.reverse());
//        
//        // 5)Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada 
//        //   console'a yazdirin.
//        String tamAd = ilkAd + soyAd;
//        String harfArr[] = tamAd.split(""); 
//        Arrays.sort(harfArr);
//        System.out.println("Harfler alfabetik sirada: " + Arrays.toString(harfArr));	
//		
		scan.close();
		

	}

}

package day11Strinngmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		//substring() methodu bir Stringin belli bir b�l�m�n�kesip almaki�in kullan�l�r 
	String str1="Java calisana kolaydir";
	//1.versiyon
	System.out.println(str1.substring(5));//5 indexi g�sterr
	System.out.println(str1.substring(8));//8 isana kolaydir 8dahilr (inclusive)
	System.out.println(str1.substring(22));;// ekranda hi�birsey g�remezsiniz
	//System.out.println(str1.substring(23));hata verr olmayan bir yer
	System.out.println(str1.substring(0));// anlams�z olur tamam�n� verr c�nk� hi�kullan�lmaz
	//2.versiyon
	System.out.println(str1.substring(5, 13));//ilk index dahil olur 2.index dahil de�ildiryaniilk index ekranda g�r�rs�n�z ikinci g�z�kmez[5,13)
	System.out.println(str1.substring(6, 12));//alisan
	System.out.println(str1.substring(6, 6));//hi�birseygz�kmez mant�kl�de�ildr kullan�lmaz
//	System.out.println(str1.substring(7, 6));  hata verir exception ilk index herzamn k���kolmal�d�r
	
	
	
	
	
	
	}

}

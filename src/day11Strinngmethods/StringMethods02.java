package day11Strinngmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		//substring() methodu bir Stringin belli bir bölümünükesip almakiçin kullanýlýr 
	String str1="Java calisana kolaydir";
	//1.versiyon
	System.out.println(str1.substring(5));//5 indexi gösterr
	System.out.println(str1.substring(8));//8 isana kolaydir 8dahilr (inclusive)
	System.out.println(str1.substring(22));;// ekranda hiçbirsey göremezsiniz
	//System.out.println(str1.substring(23));hata verr olmayan bir yer
	System.out.println(str1.substring(0));// anlamsýz olur tamamýný verr cünkü hiçkullanýlmaz
	//2.versiyon
	System.out.println(str1.substring(5, 13));//ilk index dahil olur 2.index dahil deðildiryaniilk index ekranda görürsünüz ikinci gözükmez[5,13)
	System.out.println(str1.substring(6, 12));//alisan
	System.out.println(str1.substring(6, 6));//hiçbirseygzükmez mantýklýdeðildr kullanýlmaz
//	System.out.println(str1.substring(7, 6));  hata verir exception ilk index herzamn küçükolmalýdýr
	
	
	
	
	
	
	}

}

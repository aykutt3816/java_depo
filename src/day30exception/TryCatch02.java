package day30exception;

public class TryCatch02 {
	 static String m;
	public static void main(String[] args) {
		String s="";
		System.out.println(s.length());//0
try {
	s+="t";
}catch(Exception e) {
	//hata vernesse exception i� g�z�kmez
	
	s+="c";
}finally {
	s+="f";
}
s+="a";
System.out.println(s);
//String'e null atandigi zaman veya instance variable'a 
//deger atamasi yapilmadiginda length() methodu calismaz
//ve NullPointerException exception alirsiniz.
//NullPointerException exception rtime excepd�r
String n = null;
//Asagidaki iki satirdaki kod da exception verir
//System.out.println(n.length());
//System.out.println(m.length());   

	}

}

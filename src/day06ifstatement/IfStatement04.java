package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// birtane String variable olusturun 
//ve birgun ismini kucuk harf bir deger atay�n
	//deger hafta icigunlerinden birinin ilk harfi ise hi�iyazd�r�n
	//	deger hafta sonu gunlerinden birinin ilk harfi ise hsonu yazd�r�n
	
	String gun="pazar";
	if (gun.equals("pazartesi") ||  gun.equals("sali") ||  gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
		System.out.println("haftai�i");
	}
	
	if(gun.equals("cumartesi") || gun.equals("pazar")) {
		System.out.println("haftasonu");
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}

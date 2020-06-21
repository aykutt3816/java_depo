package day06ifstatement;

public class IfStatement04 {

	public static void main(String[] args) {
		// birtane String variable olusturun 
//ve birgun ismini kucuk harf bir deger atayýn
	//deger hafta icigunlerinden birinin ilk harfi ise hiçiyazdýrýn
	//	deger hafta sonu gunlerinden birinin ilk harfi ise hsonu yazdýrýn
	
	String gun="pazar";
	if (gun.equals("pazartesi") ||  gun.equals("sali") ||  gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
		System.out.println("haftaiçi");
	}
	
	if(gun.equals("cumartesi") || gun.equals("pazar")) {
		System.out.println("haftasonu");
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}

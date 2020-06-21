package day17constructors;

public class Constructors01 {
	String isim="Ali Can";
			int yas=33;
	
	
	//method ile main method ayný classda  ise methodu sadece ismi ile kullana biliriz    buyume
	

	public static void main(String[] args) {
		buyume(33);
		isimDegistir("Ayse Han");
	}
	public static void buyume(int yas) {
		yas++;
		System.out.println(yas);
	}
	public static void isimDegistir(String isim)    {
		System.out.println(isim);
	}
}

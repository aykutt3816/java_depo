package day32abstraction;

public class KralOdasý extends Otel {

	public static void main(String[] args) {
		KralOdasý musteri3=new KralOdasý();
		musteri3.kahvalti();
		System.out.println("uydu ücreti:"+musteri3.tv("international",12));
		System.out.println("wifi ücreti:"+musteri3.wifi(11));
		//Herhangi bir parent tarafindan override edilen abstract method alttaki concrete child’lar tarafindan override edilmese de olur
		//ABSTRCTCLASS   FÝNAL VE PRÝVATE OLAMAZZZ OLMAZZ
		
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltýnýz teras kat kral restaurandadýr");
		
	}
public int tv (String international,int saat) {
	if(international.equals("international")) {
		return saat*5;
	}else {
		return 0;
	}
}
}
//Herhangi bir parent tarafindan override edilen abstract method alttaki concrete child’lar tarafindan override edilmese de olur
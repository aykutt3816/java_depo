package day32abstraction;

public class AileOdasý extends Otel {

	public static void main(String[] args) {
		AileOdasý musteri2=new AileOdasý();
		musteri2.kahvalti();
		System.out.println("wifi ücreti:"+musteri2.wifi(6));
	}

	@Override
	public void kahvalti() {
		System.out.println("kahvaltýnýz cafeterya da olacaktýr");
		
	}

}
//Herhangi bir parent tarafindan override edilen abstract method alttaki concrete child’lar tarafindan override edilmese de olur
//abstract method FÝNAL OLAMAZ  OLAMA
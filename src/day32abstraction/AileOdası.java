package day32abstraction;

public class AileOdas� extends Otel {

	public static void main(String[] args) {
		AileOdas� musteri2=new AileOdas�();
		musteri2.kahvalti();
		System.out.println("wifi �creti:"+musteri2.wifi(6));
	}

	@Override
	public void kahvalti() {
		System.out.println("kahvalt�n�z cafeterya da olacakt�r");
		
	}

}
//Herhangi bir parent tarafindan override edilen abstract method alttaki concrete child�lar tarafindan override edilmese de olur
//abstract method F�NAL OLAMAZ  OLAMA
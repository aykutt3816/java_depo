package day32abstraction;

public class KralOdas� extends Otel {

	public static void main(String[] args) {
		KralOdas� musteri3=new KralOdas�();
		musteri3.kahvalti();
		System.out.println("uydu �creti:"+musteri3.tv("international",12));
		System.out.println("wifi �creti:"+musteri3.wifi(11));
		//Herhangi bir parent tarafindan override edilen abstract method alttaki concrete child�lar tarafindan override edilmese de olur
		//ABSTRCTCLASS   F�NAL VE PR�VATE OLAMAZZZ OLMAZZ
		
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvalt�n�z teras kat kral restaurandad�r");
		
	}
public int tv (String international,int saat) {
	if(international.equals("international")) {
		return saat*5;
	}else {
		return 0;
	}
}
}
//Herhangi bir parent tarafindan override edilen abstract method alttaki concrete child�lar tarafindan override edilmese de olur
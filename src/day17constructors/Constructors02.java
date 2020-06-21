package day17constructors;

public class Constructors02 {
// buyume methodu bu classda degil Constructors01 classýnda buyuzden java kullanmamýza musade etmiyor
	//eger baska bir classdaki methodu kullanmak istiyorsak o classdan bir oje oluþturup istediðimiz methodukullanabiliriz
	public static void main(String[] args) {
	//buyume(33);
		Constructors01 obj1 =new Constructors01();
		// buyume methodu static oldugundan java obrje kullanarak
		//buyume çagirmamýzý istemez ve kodun altýný sarý olarak çizer
	///	obj1.buyume(33);
		Constructors01.buyume(45);//46
		// isimDegistir methodu static oldugundan java obrje kullanarak
		//isimDegistir çagirmamýzý istemez ve kodun altýný sarý olarak çizer
	///	obj1.isimDegistir("Kemal Can");
		Constructors01.isimDegistir("merhaba naci diyoruz");
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
	System.out.println(	Constructors03.ad);//ali can
	System.out.println(	Constructors03.kilo);//33
	Constructors03.artirma(45);//46
	Constructors03.degistirme("merhaba naci");//merhaba naci
	}

}

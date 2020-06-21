package day33interface;

public class LuxHonda extends Araba implements IcAraba,DisAraba{
//classlar�n badilerioldugu i�in inherit edilemezinterface de methodlar�n badisi yok oyuzden cok say�da parent olabilir
	public static void main(String[] args) {
		LuxHonda luxHonda=new LuxHonda();
		luxHonda.benzinl();
		luxHonda.direksiyon();
		luxHonda.kapi();
		luxHonda.klima();
		luxHonda.koltuk();
		luxHonda.move();
		System.out.println("i�araba interfacden"+IcAraba.price);//2000
		System.out.println("Disaraba interfacden"+DisAraba.price);//3000
		System.out.println(old);// iktane old olmad�gii�in buna izin verdi cag�rmaya//interface adini kullanmaya gerek yok
		luxHonda.doseme();
	
	}

	@Override
	public void move() {
		System.out.println("3 sn yede 100 km h�za ulasir");
		
	}

	@Override
	public void kapi() {
		System.out.println("parmak izli kap�");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("deri direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println("isitmali derikoltuk");
	}

	@Override
	public void klima() {
		System.out.println("digital klimal� araba");
		
	}

}

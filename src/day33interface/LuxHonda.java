package day33interface;

public class LuxHonda extends Araba implements IcAraba,DisAraba{
//classlarýn badilerioldugu için inherit edilemezinterface de methodlarýn badisi yok oyuzden cok sayýda parent olabilir
	public static void main(String[] args) {
		LuxHonda luxHonda=new LuxHonda();
		luxHonda.benzinl();
		luxHonda.direksiyon();
		luxHonda.kapi();
		luxHonda.klima();
		luxHonda.koltuk();
		luxHonda.move();
		System.out.println("içaraba interfacden"+IcAraba.price);//2000
		System.out.println("Disaraba interfacden"+DisAraba.price);//3000
		System.out.println(old);// iktane old olmadýgiiçin buna izin verdi cagýrmaya//interface adini kullanmaya gerek yok
		luxHonda.doseme();
	
	}

	@Override
	public void move() {
		System.out.println("3 sn yede 100 km hýza ulasir");
		
	}

	@Override
	public void kapi() {
		System.out.println("parmak izli kapý");
		
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
		System.out.println("digital klimalý araba");
		
	}

}

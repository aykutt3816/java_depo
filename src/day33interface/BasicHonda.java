package day33interface;

public class BasicHonda  extends Araba implements IcAraba,DisAraba {
//Class===>interface:imlements
	//Class===>class:extends
	//interface===>interface:extends
	public static void main(String[] args) {
		BasicHonda basicHonda=new BasicHonda();
		basicHonda.diezel();
		basicHonda.direksiyon();
		basicHonda.kapi();
		basicHonda.klima();
		basicHonda.koltuk();
		basicHonda.move();

	}



	@Override
	public void kapi() {
		System.out.println("normal kapý");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("normal direksiyon");
		
	}

	@Override
	public void koltuk() {
		System.out.println(" derikoltuk");
	}

	@Override
	public void klima() {
		System.out.println(" klimalý araba");
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}

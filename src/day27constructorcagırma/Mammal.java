package day27constructorcagýrma;



public class Mammal extends Animal {
public boolean doðum=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Mammal mammal=new Mammal();
Mammal mammal01=new Mammal(15);
	}

	public void feed () {
		System.out.println("cocuklarýný besler");
	}
	
	Mammal(){
		this(11);
	//	super();//parentteki parametresiz constructur u caðýr
		//super() keywordunu kullanmasanýda olur bazýlarý kullanýr sasýrmayýn
		//super kullanýlacaksa mutlaka ilk satýrd olmalýdýr
		//super() ve this() ayný constructorda kullanýlamaz cünkü ikisininde ilk satýrda olma zorunlulugu var
		System.out.println("mammal parametresiz constructor");
	}
	public Mammal(int age) {
		super();
		System.out.println("mammal parametreli constructor");
	}
}

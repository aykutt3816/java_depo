package day27constructorcag�rma;



public class Mammal extends Animal {
public boolean do�um=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Mammal mammal=new Mammal();
Mammal mammal01=new Mammal(15);
	}

	public void feed () {
		System.out.println("cocuklar�n� besler");
	}
	
	Mammal(){
		this(11);
	//	super();//parentteki parametresiz constructur u ca��r
		//super() keywordunu kullanmasan�da olur baz�lar� kullan�r sas�rmay�n
		//super kullan�lacaksa mutlaka ilk sat�rd olmal�d�r
		//super() ve this() ayn� constructorda kullan�lamaz c�nk� ikisininde ilk sat�rda olma zorunlulugu var
		System.out.println("mammal parametresiz constructor");
	}
	public Mammal(int age) {
		super();
		System.out.println("mammal parametreli constructor");
	}
}

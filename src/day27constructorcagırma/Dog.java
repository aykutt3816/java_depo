package day27constructorcag�rma;

public class Dog extends Mammal {
	public boolean sad�k=true;

	public static void main(String[] args) {
		Dog dog=new Dog();

	}
public void bark() {
	System.out.println("k�pekler havlar");
}

Dog(){
	super();//istege bagli kullan�rsan�zda kullan�lmazsada olur
	//this() ayn� class i�indeki parametresiz constructuru cag�rmak i�in kullan�l�r
	System.out.println("dog parametresiz constructor");
}

}

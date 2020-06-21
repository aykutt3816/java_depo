package day27constructorcagýrma;

public class Dog extends Mammal {
	public boolean sadýk=true;

	public static void main(String[] args) {
		Dog dog=new Dog();

	}
public void bark() {
	System.out.println("köpekler havlar");
}

Dog(){
	super();//istege bagli kullanýrsanýzda kullanýlmazsada olur
	//this() ayný class içindeki parametresiz constructuru cagýrmak için kullanýlýr
	System.out.println("dog parametresiz constructor");
}

}

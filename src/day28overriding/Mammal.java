package day28overriding;

public class Mammal extends Animal {
	public boolean birth=true;
	public String name="Kedi";

	public static void main(String[] args) {
		Mammal mammal=new Mammal();

	}
public void feed() {
	System.out.println("Yavrular�n� besler");
}

public Mammal() {
	// this i�inde bulundu�unuz class daki variable ve methodlara ula�man�z� sa�lar
	//child parent ili�kisi varsa parant class daki variable ve methodlarada ula��rname move gibi
	System.out.println(this.birth);//true
	this.feed();//Yavrular�n� besler
	System.out.println(this.yas);//4
	System.out.println(this.name);//Karabas
	this.move();//Hayvanlar hareket eder
	System.out.println(this.name);
	//parantessiz super parentlerdaki variable ve methodlara ula�mam�z� sa�lar kendiclass�na ula�amaz
	//parenttek�lere super kullanarak ula�mak daha g�venlidir
	System.out.println(super.yas);//4
	System.out.println(super.name);//Karabas
	super.move();//Hayvanlar hareket eder

}
}

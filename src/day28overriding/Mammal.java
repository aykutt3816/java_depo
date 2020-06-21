package day28overriding;

public class Mammal extends Animal {
	public boolean birth=true;
	public String name="Kedi";

	public static void main(String[] args) {
		Mammal mammal=new Mammal();

	}
public void feed() {
	System.out.println("Yavrularýný besler");
}

public Mammal() {
	// this içinde bulunduðunuz class daki variable ve methodlara ulaþmanýzý saðlar
	//child parent iliþkisi varsa parant class daki variable ve methodlarada ulaþýrname move gibi
	System.out.println(this.birth);//true
	this.feed();//Yavrularýný besler
	System.out.println(this.yas);//4
	System.out.println(this.name);//Karabas
	this.move();//Hayvanlar hareket eder
	System.out.println(this.name);
	//parantessiz super parentlerdaki variable ve methodlara ulaþmamýzý saðlar kendiclassýna ulaþamaz
	//parenttekýlere super kullanarak ulaþmak daha güvenlidir
	System.out.println(super.yas);//4
	System.out.println(super.name);//Karabas
	super.move();//Hayvanlar hareket eder

}
}

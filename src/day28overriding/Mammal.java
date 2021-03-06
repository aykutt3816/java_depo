package day28overriding;

public class Mammal extends Animal {
	public boolean birth=true;
	public String name="Kedi";

	public static void main(String[] args) {
		Mammal mammal=new Mammal();

	}
public void feed() {
	System.out.println("Yavrularını besler");
}

public Mammal() {
	// this içinde bulunduğunuz class daki variable ve methodlara ulaşmanızı sağlar
	//child parent ilişkisi varsa parant class daki variable ve methodlarada ulaşırname move gibi
	System.out.println(this.birth);//true
	this.feed();//Yavrularını besler
	System.out.println(this.yas);//4
	System.out.println(this.name);//Karabas
	this.move();//Hayvanlar hareket eder
	System.out.println(this.name);
	//parantessiz super parentlerdaki variable ve methodlara ulaşmamızı sağlar kendiclassına ulaşamaz
	//parenttekılere super kullanarak ulaşmak daha güvenlidir
	System.out.println(super.yas);//4
	System.out.println(super.name);//Karabas
	super.move();//Hayvanlar hareket eder

}
}

package day26encapsulation;

public class Cat extends Mammal {
public boolean clean=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
		System.out.println("animal classdan geldi: "+cat.age);//0
		System.out.println("animal classdan geldi: "+cat.name);//null
		cat.eat();//yemek yer
		cat.move();//hareket edebiliyor
		System.out.println("mammal classdan geldi: "+cat.doðum);//true
		cat.feed();//cocuklarýný besler
		System.out.println("cat kendi classdan geldi: "+cat.clean);//true
		cat.meow();//kediler miyavlar
	}
public void meow() {
	System.out.println("kediler miyavlar");
}
}

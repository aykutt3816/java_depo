package day26encapsulation;

public class Dog extends Mammal {
public boolean sadýk=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog dog=new Dog();
System.out.println("animal classdan geldi: "+dog.age);//0
System.out.println("animal classdan geldi: "+dog.name);//null
dog.eat();//yemek yer
dog.move();//hareket edebiliyor
System.out.println("mammal classdan geldi: "+dog.doðum);//true
dog.feed();//cocuklarýný besler
System.out.println("dog kendi classdan geldi: "+dog.sadýk);//true
dog.bark();

	}

	public void bark() {
		System.out.println("köpekler havlaer");
	}
}

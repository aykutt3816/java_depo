package day26encapsulation;

public class Dog extends Mammal {
public boolean sad�k=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog dog=new Dog();
System.out.println("animal classdan geldi: "+dog.age);//0
System.out.println("animal classdan geldi: "+dog.name);//null
dog.eat();//yemek yer
dog.move();//hareket edebiliyor
System.out.println("mammal classdan geldi: "+dog.do�um);//true
dog.feed();//cocuklar�n� besler
System.out.println("dog kendi classdan geldi: "+dog.sad�k);//true
dog.bark();

	}

	public void bark() {
		System.out.println("k�pekler havlaer");
	}
}

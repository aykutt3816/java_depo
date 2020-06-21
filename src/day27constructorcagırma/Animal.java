package day27constructorcagýrma;

public class Animal {
	public int age;
	protected String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal animal=new Animal();
	}
	public void move() {
		System.out.println("hareket edebiliyor");
	}
public void eat() {
	System.out.println("yemek yer");
}

Animal(){
	System.out.println("animal parametresiz constructor");
}
}

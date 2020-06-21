package day33interface;

public interface IcAraba {
int price=2000;
	boolean old=true;
	
	
	public abstract void direksiyon();
	void koltuk();
	abstract void klima();
	// default keywordunu kullanýrsak methoda bady eklemekzorundayýz aksi takdirde compile time error alýrýz
	public default void doseme() {
		System.out.println("interfacede default keyword ile döseme yaptým");
	}
	public static void isitma() {
		System.out.println("interfacede static keyword ile döseme yaptým");
	}
}

package day33interface;

public interface IcAraba {
int price=2000;
	boolean old=true;
	
	
	public abstract void direksiyon();
	void koltuk();
	abstract void klima();
	// default keywordunu kullan�rsak methoda bady eklemekzorunday�z aksi takdirde compile time error al�r�z
	public default void doseme() {
		System.out.println("interfacede default keyword ile d�seme yapt�m");
	}
	public static void isitma() {
		System.out.println("interfacede static keyword ile d�seme yapt�m");
	}
}

package day11Strinngmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		// ilk 4 sayma say�s�n�n �arp�m�n� veren for loop olu�turunuz
	//1,2,3,4,        1*2*3*4=24
	int product=1;
	for(int i=1;i<5;i++) {
		product=product*i;
	}
	System.out.println(product);
	System.out.println();
	//ilk 6 �ift sayma say�s�n�n �arp�m�n� vren forLoop olu�turunuz
	
	int product1=1;
	for(int i=2;i<13;i=i+2) {
		product1=product1*i;
	}
	System.out.println(product1);
	System.out.println();
	
	// matematikte birer birer geri say�m yap�p �arpmaya fakt�ryel denir
	//6!=6*5*4*3*2*1
	// intervievlerde sorulur
	//9! hesaplayan program� for loop ile yap�n�z
	int product12=1;
	for(int i=1;i<10;i=i+1) {
		product12=product12*i;
	}
	System.out.println(product12);
	System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

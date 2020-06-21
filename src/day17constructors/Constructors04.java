package day17constructors;

public class Constructors04 {
	int num1=12;
	static int num2=22;
	public static void main(String[] args) {
		//static methodlarýn içinde sadece static elemanlar kullanýlabilir
		//num1 static olmadýgýndan main methodun içinden kullanýlamaz
		//num2 static oldugundan main methodun içinden kullanýlabilir
//		num++;         // komment kaldýrýrsak java num++ nýn altýný kýrmýzý çizer
		num2++;
/*kural 1: static ise method ve variable larý class ismiyle cagýrabiliriz
  kural 2: static medholarda static olmayan variable kullanýlmaz.
  kural 3: class daki bir variable staticse o variable da yapýlan degisim butun objelerde gecerlidir.(gokdeki ay gibi)*/
	}

}

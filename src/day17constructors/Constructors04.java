package day17constructors;

public class Constructors04 {
	int num1=12;
	static int num2=22;
	public static void main(String[] args) {
		//static methodlar�n i�inde sadece static elemanlar kullan�labilir
		//num1 static olmad�g�ndan main methodun i�inden kullan�lamaz
		//num2 static oldugundan main methodun i�inden kullan�labilir
//		num++;         // komment kald�r�rsak java num++ n�n alt�n� k�rm�z� �izer
		num2++;
/*kural 1: static ise method ve variable lar� class ismiyle cag�rabiliriz
  kural 2: static medholarda static olmayan variable kullan�lmaz.
  kural 3: class daki bir variable staticse o variable da yap�lan degisim butun objelerde gecerlidir.(gokdeki ay gibi)*/
	}

}

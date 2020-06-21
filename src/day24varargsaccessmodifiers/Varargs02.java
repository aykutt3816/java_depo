package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		// VARARGS IN YANL�� KULLANIMLARI
		//Kural 1: Varargs herzaman son parametre olmal�d�r
		//��nk� ilk parametre yaparsak girdi�imiz her de�er varanks�n i�ine d��er asla 2. parametreye de�er veremeyiz
		valueChar("Character:",'a');
		valueChar("Character:",'a','b');
		product(5,6,7);
	}
	public static void valueChar (String s,char... c) {
		for(char w:c) {
			System.out.print(s);
			System.out.println(w);
		}
		
		
	}
	//Kural  2:parametre olarak 1 den fazla varangs kullan�lamaz ��nk� varangs ensonda olmal�d�r buda tek olmay� gerektirr
	
	public static void product(int x,int... y) {
		int product=1;
		for(int w:y) {
			product=product*w;
		
		// x i kullanmad� yazmad��i i�in  o yuzden 42
		}
		System.out.println(product);
	}
	
	
	
	
}

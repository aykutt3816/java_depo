package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		// VARARGS IN YANLÝÞ KULLANIMLARI
		//Kural 1: Varargs herzaman son parametre olmalýdýr
		//çünkü ilk parametre yaparsak girdiðimiz her deðer varanksýn içine düþer asla 2. parametreye deðer veremeyiz
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
	//Kural  2:parametre olarak 1 den fazla varangs kullanýlamaz çünkü varangs ensonda olmalýdýr buda tek olmayý gerektirr
	
	public static void product(int x,int... y) {
		int product=1;
		for(int w:y) {
			product=product*w;
		
		// x i kullanmadý yazmadýði için  o yuzden 42
		}
		System.out.println(product);
	}
	
	
	
	
}

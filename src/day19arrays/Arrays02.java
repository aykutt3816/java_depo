package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// char bir array e 4elemanl� olu�turun elemanlar yerle�tirin
		// t�m elemanlar� for d�ng�s� ile yazd�r�n
		// son eleman� ekrana yazd�r�n
		char arr1[]=new char[4];
		arr1[0]='A';
		arr1[1]='D';
		arr1[2]='E';
		arr1[3]='M';
		for(int i=0;i<4;i++) {
			System.out.println(arr1[i]);
		}
			System.out.println(arr1[3]);
			
			//array lenght ini bulmak i�in ArrayIsmi  .lenght yazmak yetrlidir
			//stringlerdede lenght methodu kullan�l�r stringlerdekilenght methodu parantezlidir
			//  strnghte  lenght() arraylerde  lenght kullan�l�r
			System.out.println(arr1.length);
			//array deki son eleman kullan�mi�in lenght kullan�r�z
			System.out.println(arr1[arr1.length-1]);//m
			
		}
		
	}



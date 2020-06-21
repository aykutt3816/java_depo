package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// char bir array e 4elemanlý oluþturun elemanlar yerleþtirin
		// tüm elemanlarý for döngüsü ile yazdýrýn
		// son elemaný ekrana yazdýrýn
		char arr1[]=new char[4];
		arr1[0]='A';
		arr1[1]='D';
		arr1[2]='E';
		arr1[3]='M';
		for(int i=0;i<4;i++) {
			System.out.println(arr1[i]);
		}
			System.out.println(arr1[3]);
			
			//array lenght ini bulmak için ArrayIsmi  .lenght yazmak yetrlidir
			//stringlerdede lenght methodu kullanýlýr stringlerdekilenght methodu parantezlidir
			//  strnghte  lenght() arraylerde  lenght kullanýlýr
			System.out.println(arr1.length);
			//array deki son eleman kullanýmiçin lenght kullanýrýz
			System.out.println(arr1[arr1.length-1]);//m
			
		}
		
	}



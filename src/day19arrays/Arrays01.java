package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// integer arryay olusturalým
		int arr1[]= new int[5];
		System.out.println(arr1);//adresi verir reference
		System.out.println(arr1[2]); // array in indexi 2 olan elemanýný yazdýrmiþ olur
		
		arr1[0]=12;
		System.out.println(arr1[0]);
		arr1[4]=22;
		System.out.println(arr1[4]);
		arr1[1]=13;
		System.out.println(arr1[1]);
		arr1[2]=14;
		System.out.println(arr1[2]);
		arr1[3]=15;
		System.out.println(arr1[3]);
		
		//array deki elemanlarý ekrana yazdýrmak için for döngüsü kullanýnýz
		
		for(int i=0;i<5;i++) {
			System.out.println(arr1[i]);
		}
		//array da olmayan indexe deger atamasý yapýlirsa run time erroe verir
		//array da olmayan indexe i kullanmakistersk  "ArrayIndexOutOfBoundsException" uyarýsý alýrýz
		
		arr1[5]=23;
		System.out.println(arr1[5]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
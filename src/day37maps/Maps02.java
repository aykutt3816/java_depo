package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		//HashTable: HashMaple hemen hemen aynýdýr Farklarý:
	        	//1-Key ve valuelarda null' e müsade etmez
	        	//2-HashTable "thread safe " dir
		        //HashTable konsolo yazdýrýldiginda rastgele sýralamada yazdýrýlýr
		        //HashTable daha yavastýr
		Hashtable<String,String>hTable=new Hashtable<>();
		hTable.put("Dil", "Gönül");
		hTable.put("Gönül", "Kalp");
		hTable.put("Dil", "tad alma organý");
		hTable.put("Ali", "");
	//	hTable.put(null, "tad ");//null run time error verr
		//hTable.put("Dil", null);//null run time error verr
		//ayný key degerini tekrar kullanýrsanýz son value kabul eder ve onu yazar
		System.out.println(hTable);//{Ali=, Dil=tad alma organý, Gönül=Kalp}
		
		
		//hashmapda kullandigimiz methodlarýn tamaý hashtabledede kullanýlabilir
	}

}

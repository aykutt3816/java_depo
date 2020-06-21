package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		//HashTable: HashMaple hemen hemen ayn�d�r Farklar�:
	        	//1-Key ve valuelarda null' e m�sade etmez
	        	//2-HashTable "thread safe " dir
		        //HashTable konsolo yazd�r�ldiginda rastgele s�ralamada yazd�r�l�r
		        //HashTable daha yavast�r
		Hashtable<String,String>hTable=new Hashtable<>();
		hTable.put("Dil", "G�n�l");
		hTable.put("G�n�l", "Kalp");
		hTable.put("Dil", "tad alma organ�");
		hTable.put("Ali", "");
	//	hTable.put(null, "tad ");//null run time error verr
		//hTable.put("Dil", null);//null run time error verr
		//ayn� key degerini tekrar kullan�rsan�z son value kabul eder ve onu yazar
		System.out.println(hTable);//{Ali=, Dil=tad alma organ�, G�n�l=Kalp}
		
		
		//hashmapda kullandigimiz methodlar�n tama� hashtabledede kullan�labilir
	}

}

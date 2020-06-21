package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// Map bir interface dir 3 tane child claas ý vardr
//1-HashMap  k ey-value yapýsýný kullanýr  key ve value programcý tarafýndan yazýlýr key ve valuede null degeri
		//kullanýlabilir key de bir den fazla null degeri kullanýlýrsa java son kullanýlan null u kabul eder
		//value de birden fazla null kullanýlabilir
		//HasMap degerleri consolo yazdýrýrken onve key sonra value arada eþittir bulunur
		//Ekrana yazdýrýrken rastgele yazdýrýr
		//HasMap maplar arasýnda en hýzlýsýdýr sýralama yapmadýgý için
		//HashMapler "thread safe " degildir
//2-HashTable
//3-TreeMap
HashMap<Integer,String>hashMap=new HashMap<>();
hashMap.put(3333, "Ali");
hashMap.put(12, "Veli");
hashMap.put(29, "Mine");
hashMap.put(4, "Kemal");
System.out.println(hashMap);//{4=Kemal, 3333=Ali, 12=Veli, 29=Mine}
hashMap.remove(4);
System.out.println(hashMap);//{3333=Ali, 12=Veli, 29=Mine}
System.out.println(hashMap.remove(12, "Veli"));//true
System.out.println(hashMap.remove(29, "Ayse"));//false  29 mine ayse yok bu yuzden false
System.out.println(hashMap);//{3333=Ali, 29=Mine}
System.out.println(hashMap.get(29));//Mine
System.out.println(hashMap.get(100));//null
System.out.println(hashMap.keySet());//[3333, 29] keyler set içerisinde verilir
System.out.println(hashMap.values());//[Ali, Mine]valuler
System.out.println(hashMap.size());//2 eleman var
System.out.println(hashMap.containsKey(3333));//true alinin keyi var true
System.out.println(hashMap.containsKey(4));//false böyle birkey yok
System.out.println(hashMap.containsValue("Mine"));//true
System.out.println(hashMap.containsValue("osman"));//false  yok cunku
hashMap.clear();// tüm elemanlarý siler
System.out.println(hashMap);//{}



}
	}

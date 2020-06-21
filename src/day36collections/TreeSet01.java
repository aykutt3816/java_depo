package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// tree set 1- hasSetle hemen hemen aynýdýr key  kullanýrdupilicasyano izin vermez dupilicasyano izin vermez 
		//          2-Farký elemanlarýný natural ordere göre dizer(alfabetik sira)
		//          -hasSet ise elemanlarýný rastgele  dizer
        //          3-hasSet ile farký; hashset daha hýzlýdýr
        //          4- Naturalordere sahipbir set lazým oldugunda hashset olusturulur elemanlaer eklenir sonra buhashset  tree sete dönüþtürülür
        //böylelikletree set hýzlandýrýlmýþ olur tree set  oluþturma genellikle kullanýlmaz
		TreeSet<String>tSet=new TreeSet<>();
		
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		System.out.println(tSet);//[ABC, Ink, Jack, Pen, String, Test]
		//hashset oluþturup javanýn elemanlarý hýzlý eklemesini saðlarýz
		HashSet<String> hSet1 = new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);//[ABC, Test, Ink, Pen, String, Jack]   rastgele
		//oluþturdugumuz hashseti  tree set constructura  parametre olarak koyup treesete ceviririz 
		//böylelikle NaturalOrder ozelliginden faydalanmiþ oluruz
		TreeSet<String>tSet1=new TreeSet<>(hSet1);
		System.out.println(tSet1);//[ABC, Ink, Jack, Pen, String, Test]   sýraya dizdi
	}

}

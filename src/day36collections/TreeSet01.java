package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// tree set 1- hasSetle hemen hemen aynıdır key  kullanırdupilicasyano izin vermez dupilicasyano izin vermez 
		//          2-Farkı elemanlarını natural ordere göre dizer(alfabetik sira)
		//          -hasSet ise elemanlarını rastgele  dizer
        //          3-hasSet ile farkı; hashset daha hızlıdır
        //          4- Naturalordere sahipbir set lazım oldugunda hashset olusturulur elemanlaer eklenir sonra buhashset  tree sete dönüştürülür
        //böylelikletree set hızlandırılmış olur tree set  oluşturma genellikle kullanılmaz
		TreeSet<String>tSet=new TreeSet<>();
		
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		System.out.println(tSet);//[ABC, Ink, Jack, Pen, String, Test]
		//hashset oluşturup javanın elemanları hızlı eklemesini sağlarız
		HashSet<String> hSet1 = new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);//[ABC, Test, Ink, Pen, String, Jack]   rastgele
		//oluşturdugumuz hashseti  tree set constructura  parametre olarak koyup treesete ceviririz 
		//böylelikle NaturalOrder ozelliginden faydalanmiş oluruz
		TreeSet<String>tSet1=new TreeSet<>(hSet1);
		System.out.println(tSet1);//[ABC, Ink, Jack, Pen, String, Test]   sıraya dizdi
	}

}

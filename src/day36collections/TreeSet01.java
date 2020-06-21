package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// tree set 1- hasSetle hemen hemen ayn�d�r key  kullan�rdupilicasyano izin vermez dupilicasyano izin vermez 
		//          2-Fark� elemanlar�n� natural ordere g�re dizer(alfabetik sira)
		//          -hasSet ise elemanlar�n� rastgele  dizer
        //          3-hasSet ile fark�; hashset daha h�zl�d�r
        //          4- Naturalordere sahipbir set laz�m oldugunda hashset olusturulur elemanlaer eklenir sonra buhashset  tree sete d�n��t�r�l�r
        //b�ylelikletree set h�zland�r�lm�� olur tree set  olu�turma genellikle kullan�lmaz
		TreeSet<String>tSet=new TreeSet<>();
		
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		System.out.println(tSet);//[ABC, Ink, Jack, Pen, String, Test]
		//hashset olu�turup javan�n elemanlar� h�zl� eklemesini sa�lar�z
		HashSet<String> hSet1 = new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		System.out.println(hSet1);//[ABC, Test, Ink, Pen, String, Jack]   rastgele
		//olu�turdugumuz hashseti  tree set constructura  parametre olarak koyup treesete ceviririz 
		//b�ylelikle NaturalOrder ozelliginden faydalanmi� oluruz
		TreeSet<String>tSet1=new TreeSet<>(hSet1);
		System.out.println(tSet1);//[ABC, Ink, Jack, Pen, String, Test]   s�raya dizdi
	}

}

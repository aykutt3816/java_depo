package day37maps;

import java.util.TreeMap;

public class Maps03 {

	public static void main(String[] args) {
		// TreeMap:1-TreeMap de keyler de null kullanmaya musade etmez valuelerde istedigimiz kadar m�sade eder edr
		//         2-TreeMap "keyler" natural ordere g�re s�ralar consola
		//         3-TreeMap en yavas olan�d�r
		
		TreeMap<String,Integer>tMap=new TreeMap<>();
tMap.put("Kanaat", null);
tMap.put("Bezelye", 7);
tMap.put("Elma", 10);
tMap.put("Armut", 8);
System.out.println(tMap);//{Armut=8, Bezelye=7, Elma=10, Kanaat=null}

	}

}

package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueue {

	public static void main(String[] args) {
		//DeQue: Double Ended Queue(iki uclu queue)
		//==> 	Queue lerde ekleme sona silme basa yap�l�r
		//DeQue kullan�rsak eklemeyi hembasa hem sonda yapabiliriz silmeyide  hembasa hem sonda yapabiliriz
		//DeQue da F�FO var bununyan�nda LIFO da var(Last In First Out)
		//DeQue resizable diryani kapasitesi de�i�tirilebilir
		
		//Queue lara eleman olarak null eklenebilir ama DeQueue lere eklenemez
		
		Deque<String>dq=new LinkedList <String>();
		dq.add("Son1");
		dq.addFirst("Bas1");
		System.out.println(dq);//[Eleman Bas 1, ElemanSon 1]
		dq.addLast("Son2");
		System.out.println(dq);//[Bas1, Son1, Son2]
		dq.push("Bas2");
		System.out.println(dq);//[Bas2, Bas1, Son1, Son2]
        dq.offer("Son3");
        System.out.println(dq);//[Bas2, Bas1, Son1, Son2, Son3]
        dq.offerFirst("Bas3");
        System.out.println(dq);//[Bas3, Bas2, Bas1, Son1, Son2, Son3]
        dq.offerLast("Son4");
        System.out.println(dq);//[Bas3, Bas2, Bas1, Son1, Son2, Son3, Son4]
        
        //pap()methodu  bastaki eleman� siler ve return eder
       System.out.println( dq.pop());//Bas3
       System.out.println(dq);//[Bas2, Bas1, Son1, Son2, Son3, Son4]
       System.out.println(dq.removeLast());//Son4
       System.out.println(dq);//[Bas2, Bas1, Son1, Son2, Son3]
       System.out.println(dq.removeFirst());//Bas2
       System.out.println(dq);//[Bas1, Son1, Son2, Son3]
        
	}

}

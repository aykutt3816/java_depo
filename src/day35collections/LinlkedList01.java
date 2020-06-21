package day35collections;

import java.util.LinkedList;

public class LinlkedList01 {

	public static void main(String[] args) {
		// linked list objesi oluşturunuz
		LinkedList<String>linklist=new LinkedList<>();
		linklist.add("Mark");
		linklist.add("Amanda");
		linklist.add("John");
		linklist.add("Ann");
		linklist.add("Pamela");
		System.out.println(linklist);//[Mark, Amanda, John, Ann, Pamela]
		linklist.remove(2);
		System.out.println(linklist);//[Mark, Amanda, Ann, Pamela]
		linklist.removeFirst();
		System.out.println(linklist);//[Amanda, Ann, Pamela]
		linklist.removeLast();
		System.out.println(linklist);//[Amanda, Ann]
		linklist.add(1, "Ali");
		System.out.println(linklist);//[Amanda, Ali, Ann]
		linklist.addFirst("Kemal");
		System.out.println(linklist);//[Kemal, Amanda, Ali, Ann]
		linklist.addLast("Zeynep");
		System.out.println(linklist);//[Kemal, Amanda, Ali, Ann, Zeynep]
		linklist.set(1, "Ajanda");
		System.out.println(linklist);//[Kemal, Ajanda, Ali, Ann, Zeynep]
		LinkedList<String>linklist2=new LinkedList<>();
		linklist2.add("x");
		linklist2.add("Y");
		linklist2.addAll(linklist);
		System.out.println(linklist2);//[x, Y, Kemal, Ajanda, Ali, Ann, Zeynep]
		linklist.addAll(3, linklist2);
		System.out.println(linklist);//[Kemal, Ajanda, Ali,      x, Y, Kemal, Ajanda, Ali, Ann, Zeynep,     Ann, Zeynep]
		System.out.println(linklist2.contains("Can"));//false
		System.out.println(linklist2.contains("Ali"));//true
		linklist2.clear();
		System.out.println(linklist2);//
	}

}

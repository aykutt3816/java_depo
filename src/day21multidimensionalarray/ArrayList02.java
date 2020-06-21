package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		//list olu�turun isim list01 olsun elemanlar�nteger olsun
		//listler  data typeolarak primitivleri kabul etmez
		//primitivlerde data typini non primitiv yapmaki�in wrapper class lar� kullan�r
		List<Integer> list01 =new ArrayList<>();
        // bu listin i�inde eleman olupolmad���n� kontrol edin. isEmpty() methodu kullan�l�r bo�ise true dolu ise false return eder
	System.out.println(	list01.isEmpty());//true
	
	// bu liste bir eleman ekleyin
	list01.add(123);
	System.out.println(	list01.isEmpty());//false
	// listten eleman silmek. remave() methodu
	list01.add(124);
	list01.add(125);
	list01.add(124);
	System.out.println(list01);
	list01.remove(1);//indexi 1 olan� siler siler
	System.out.println(list01);//[123, 125, 124]
	list01.remove(0);//indexi 0 olan� siler siler
	System.out.println(list01);//[125, 124]
	list01.remove(list01.size()-1);//son eleman� ��karr
	System.out.println(list01);//[125]
	
	
	}

}

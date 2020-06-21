package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		//list oluþturun isim list01 olsun elemanlarýnteger olsun
		//listler  data typeolarak primitivleri kabul etmez
		//primitivlerde data typini non primitiv yapmakiçin wrapper class larý kullanýr
		List<Integer> list01 =new ArrayList<>();
        // bu listin içinde eleman olupolmadýðýný kontrol edin. isEmpty() methodu kullanýlýr boþise true dolu ise false return eder
	System.out.println(	list01.isEmpty());//true
	
	// bu liste bir eleman ekleyin
	list01.add(123);
	System.out.println(	list01.isEmpty());//false
	// listten eleman silmek. remave() methodu
	list01.add(124);
	list01.add(125);
	list01.add(124);
	System.out.println(list01);
	list01.remove(1);//indexi 1 olaný siler siler
	System.out.println(list01);//[123, 125, 124]
	list01.remove(0);//indexi 0 olaný siler siler
	System.out.println(list01);//[125, 124]
	list01.remove(list01.size()-1);//son elemaný çýkarr
	System.out.println(list01);//[125]
	
	
	}

}

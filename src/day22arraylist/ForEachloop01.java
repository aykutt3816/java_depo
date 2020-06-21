package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachloop01 {

	public static void main(String[] args) {
		// ForEachloop for loop'un ust versiyonudur
		//diger adi "enhanced(zenginlestirilmis) for loop
		int arr[]= {12,21,13,43};
		//for loop kullanarak
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===");
		//for each kullanarak
		for(int w :arr) {
			System.out.println(w);
		}
		
		// string iceren bir array oluþturun elemanlarýný yanyana aralarýna boþlukkoyarak foreachloopla yazdýrýnýz
		String arr1[]= {"ali","Ayse","kemal"};
		for(String w:arr1) {
			System.out.print(w+" ");
		}
		//integer elemanlar içeren  bir list oluþturunforeachloopla  ekrana yazdýrýn
		
		List<Integer> list= new ArrayList<>();	
		list.add(11);
		list.add(21);
		list.add(33);
		list.add(23);
		System.out.println(list);
		int sum=0;
		for(int w:list) {
			sum=sum+w;
			
		}
		
		System.out.println(sum);
		
		//{ {1, 2}, {5}, {6, 7, 8} } array'indeki tum elemanlarin toplamini bulunuz
		
				int arr2[][] = { {1, 2}, {4}, {6, 7, 18} };
				int sum1 = 0;
				
				for(int[] w : arr2) {
					
					for(int z : w){
						sum1 = sum1 + z;
					}
					
				}
				System.out.println(sum1);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

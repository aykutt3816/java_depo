package day22arraylist;

public class Odevsorusu01 {

	public static void main(String[] args) {
		//3) A�a��daki multi dimensional array�lerin i� array�lerinde ayn� index�e sahip elemanlar�n toplam�n�
		// ekrana yazd�ran bir program yaz�n�z
		// arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }
		int arr1[][] = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		int arr2[][] = { { 7, 8, 9 }, { 10, 11 }, { 12 } };
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for (int i1 = 0; i1 < arr2.length; i1++) {
					for (int j1 = 0; j1 < arr2[i1].length; j1++) {
						if ((i == i1) && (j == j1)) {
							sum1 = sum1 + arr1[i][j] + arr2[i1][j1];
						}
					}
				}
			}
		}
		System.out.println(sum1);
	
	
	
	
	
	
	
	
	
	}

}

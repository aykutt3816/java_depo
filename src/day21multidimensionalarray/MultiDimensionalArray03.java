package day21multidimensionalarray;

public class MultiDimensionalArray03 {

	public static void main(String[] args) {
		//  arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} } veriliyor.
		// Bu iki array’in tum elemanlarinin toplamini bulan programi yaziniz.
		int arr1[][]=  { {1,2}, {3,4,5}, {6} };
		int arr2[][]=  { {7,8,9}, {10,11}, {12} };
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				sum1=sum1+arr1[i][j];
			}
		}
		System.out.println("1.nin elemanlarýn toplamý="+sum1);
		
  for(int i2=0;i2<arr2.length;i2++) {
	  for(int j2=0;j2<arr2[i2].length;j2++) {
			sum2=sum2+arr2[i2][j2];
			}
		}
		System.out.println("2.nin elemanlarýn toplamý="+sum2);
		System.out.println("tüm elemanlarýn toplamý="+(sum1+sum2));
		
  }
	
		
		
		
	}



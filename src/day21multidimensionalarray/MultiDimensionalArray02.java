package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		//Multi Dmensional Array olu�turma (2 boyutlu)de�er atama 2.yol
		int arr[][]= { {1,2},{3},{4,5,6}};
		System.out.println(Arrays.deepToString(arr));//[[1, 2], [3], [4, 5, 6]]
		//2,3 ve 6 n�n toplam�n� ekrana yazd�r�n�z
System.out.println(arr[0][1] + arr[1][0] + arr[2][2]);//11
//arr arrayindeki t�m elemanlar�n toplam�n� veren program� yaz�n�z
System.out.println(arr[0][0] + arr[0][1] + arr[1][0] + arr[2][0]+ arr[2][1] +arr[2][2]);//21

int sum=0;
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		sum=sum+arr[i][j];
	}
}
System.out.println("t�m elemanlar�n toplam�="+sum);

	}

}

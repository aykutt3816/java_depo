package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
	String str="Ali Can okula baslad�";
	//bu methodu split methodu kullan�rken mutlaka birarray olu�yurmal�s�n�z
	String kelime[]= str.split(" ");
System.out.println(Arrays.toString(kelime));
System.out.println("kelime say�s�="+kelime.length);

String str2="kahramanmarasl�lar";

String harf[]=str2.split("");
	System.out.println(Arrays.toString(harf));
	System.out.println("harf say�s�="+harf.length);

}
}

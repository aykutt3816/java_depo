package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
	String str="Ali Can okula basladý";
	//bu methodu split methodu kullanýrken mutlaka birarray oluþyurmalýsýnýz
	String kelime[]= str.split(" ");
System.out.println(Arrays.toString(kelime));
System.out.println("kelime sayýsý="+kelime.length);

String str2="kahramanmaraslýlar";

String harf[]=str2.split("");
	System.out.println(Arrays.toString(harf));
	System.out.println("harf sayýsý="+harf.length);

}
}

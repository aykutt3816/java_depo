package day11Strinngmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den küçük 3 ün katýolan sayma sayýlarýný for loopoluþturunuz
	for (int i=3;i<100;i+=3) {
		System.out.print(i+" ");
	}
	System.out.println();
	// ilk 5 sayma sayýsýnýn toplamýný veren prog for loop ile yazýnýz
	//1,2,3,4,5
	//int sum=0  0+1 =1  1+2 =3  3+3 =6    6+ 4=10    10+5 =15
	
	int sum=0;
	for(int i=1;i<6;i++) {
		sum=sum+i;
	}
	System.out.println("toplam:"+sum);
	System.out.println();
	// 10  dan büyük ilk üç sayma sayýsýnýn toplamýný veren for loop yazýnýz
	
	
	int sun=0;
	for(int i=11;i<14;i++) {
		sun=sun+i;
	}
	System.out.println(sun);
	System.out.println();
	// 20den büyük ilk 5 sayma sayýsýný veren for loop olþturunuz
	int sum3=0;
	for(int i=21;i<26;i++) {
		sum3=sum3+i;
	}
	System.out.println("toplam:"+sum3);
	
	//ilk 50 sayma sayýsýnýn toplamýný veren for loop oluþturunuz
	int sum4=0;                                              //1.adým
	for(int i=1;i<51;i++) {
		sum4=sum4+i;//                                      2.adým
	}
	System.out.println("toplam:"+sum4);//1275               //3.adým
	System.out.println();
	// 5ile bölünebilen 100 den küçük sayma sayýlarýnýn toplamýný for loopile yazýnýz
	System.out.println();
	int sum5=0;                                              //1.adým
	for(int i=5;i<100;i=i+5) {
		sum5=sum5+i;//                                      2.adým
	}
	System.out.println("toplam:"+sum4);//1275  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

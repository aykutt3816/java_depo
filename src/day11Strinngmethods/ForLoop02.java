package day11Strinngmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100 den k���k 3 �n kat�olan sayma say�lar�n� for loopolu�turunuz
	for (int i=3;i<100;i+=3) {
		System.out.print(i+" ");
	}
	System.out.println();
	// ilk 5 sayma say�s�n�n toplam�n� veren prog for loop ile yaz�n�z
	//1,2,3,4,5
	//int sum=0  0+1 =1  1+2 =3  3+3 =6    6+ 4=10    10+5 =15
	
	int sum=0;
	for(int i=1;i<6;i++) {
		sum=sum+i;
	}
	System.out.println("toplam:"+sum);
	System.out.println();
	// 10  dan b�y�k ilk �� sayma say�s�n�n toplam�n� veren for loop yaz�n�z
	
	
	int sun=0;
	for(int i=11;i<14;i++) {
		sun=sun+i;
	}
	System.out.println(sun);
	System.out.println();
	// 20den b�y�k ilk 5 sayma say�s�n� veren for loop ol�turunuz
	int sum3=0;
	for(int i=21;i<26;i++) {
		sum3=sum3+i;
	}
	System.out.println("toplam:"+sum3);
	
	//ilk 50 sayma say�s�n�n toplam�n� veren for loop olu�turunuz
	int sum4=0;                                              //1.ad�m
	for(int i=1;i<51;i++) {
		sum4=sum4+i;//                                      2.ad�m
	}
	System.out.println("toplam:"+sum4);//1275               //3.ad�m
	System.out.println();
	// 5ile b�l�nebilen 100 den k���k sayma say�lar�n�n toplam�n� for loopile yaz�n�z
	System.out.println();
	int sum5=0;                                              //1.ad�m
	for(int i=5;i<100;i=i+5) {
		sum5=sum5+i;//                                      2.ad�m
	}
	System.out.println("toplam:"+sum4);//1275  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

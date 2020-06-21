package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Date Manipulation tarih �zerine de�i�iklik yapmak
		System.out.println(LocalDate.now());//2020-05-20
		LocalDate date=LocalDate.now();
		System.out.println(date.plusDays(1));//2020-05-21;//plus ARTIRMA
		System.out.println(date.plusDays(13));//2020-05-23  g�n fazla olunca ay ve y�lda de�i�ir
		System.out.println(date.plusDays(-1));//2020-05-19 bu kullan�lmaz ba�ka method var
		date.plusMonths(2);
		System.out.println(date.plusMonths(2));//2020-07-20
		System.out.println(date.plusYears(2));//2022-05-20
		
		date.minusDays(3);//azaltma minus
	System.out.println(date.minusDays(3));//2020-05-17
		
		
		
		
	}

}

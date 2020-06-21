package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// DATE FORMATINI DE���T�RMEK
		LocalDate date=LocalDate.now();
DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MMM-yyyy");//20-may-2020
System.out.println(dtf.format(date));//20-May-2020
DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MM-yyyy");//20-may-2020
System.out.println(dtf1.format(date));//20-05-2020 m 2tane oldu�u i�in
DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyyy-M-dd");
System.out.println(dtf2.format(date));//2020-5-20


//T�MEFORMATINI DE���T�RMEK
LocalTime time=LocalTime.now();
DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh:mm");//HH kullan�rsan�z 24 saatlik dilimi g�sterr
System.out.println(dtf3.format(time));//06:03

//BA�KA ULKENIN LOCAL ZAMANINI ALMAK
//System.out.println(time.now(GMT-3));
System.out.println(LocalTime.now(ZoneId.of("America/Sao_Paulo")));












	}

}

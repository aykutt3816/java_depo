package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// bugünün yerel saati ekrana yazdýralým
		System.out.println(LocalTime.now());//yerel saat
		// bugünün tarihini ekrana yazdýralým
		System.out.println(LocalDate.now());//yerel tarih
		// bugünün tarihini ve yerel saatini ekrana yazdýralým
	System.out.println(LocalDateTime.now());//tarih ve saat2020-05-20T17:02:32.969 "T"  harfi tarih ve zamaný ayýrmak için kullanýlýr
	}

}

package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// bug�n�n yerel saati ekrana yazd�ral�m
		System.out.println(LocalTime.now());//yerel saat
		// bug�n�n tarihini ekrana yazd�ral�m
		System.out.println(LocalDate.now());//yerel tarih
		// bug�n�n tarihini ve yerel saatini ekrana yazd�ral�m
	System.out.println(LocalDateTime.now());//tarih ve saat2020-05-20T17:02:32.969 "T"  harfi tarih ve zaman� ay�rmak i�in kullan�l�r
	}

}

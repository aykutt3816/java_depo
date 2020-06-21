package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// time manupulation zamanýn deðiþimi
		LocalTime time=LocalTime.now();
		System.out.println(time);//17:32:44.417
time.plusHours(1);//artýrma
System.out.println(time.plusHours(1));//18:32:44.417
System.out.println(time.plusMinutes(10));//17:42:44.417
System.out.println(time.plusSeconds(55));//
time.minusHours(1);//AZALTMA
System.out.println(time.minusHours(11));//06:32:44.417
System.out.println(time.minusMinutes(19));//17:13:44.417
System.out.println(time.minusSeconds(55));//
LocalTime time1=LocalTime.now();
System.out.println(time1);

	}

}

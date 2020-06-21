package day30exception;

public class TryCatch01 {

	public static void main(String[] args) {
		int num1=12;
		int num2=0;
		//finally block exception olsada olmasada calýþýr herzaman caliþir
		//finally block try -catch bloktan sonra kullanýlýr
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
			System.out.println("sýfýr ile bölme yapýlamaz");
		}finally {
			System.out.println("iþleminiz bitmiþtir");
		}
	}

}
//Interview: final, finally, finalize keyword'lerinin farki nedir?
/*
1)finally{}(block) ==> try-catch block'dan sonra kullanilir. 
               Exception olsa da olmasa da calisir.
2)final(keyword) ==>  Variable'larda final kullanilirsa, o variable'in
            degeri degistirilemez.Mesela pi sayisi final yapildigi
            zaman degeri degistirilemez final String code = "POS";
            
            Method'larda final kullanilirsa, method body'leri degistirilemez
            dolayisiyla overriding yapilamaz 
            
            Class'larda final kullanilirsa, o class extend edilemez.
            Inheritance mumkun degildir.
            public final class Animal{  } ==> public class Dog extends Animal{ } OLMAZ  
3)finalize()(method) ==> finalize() methodu, Garbage Collector'in imha edecegi
                         datalari imha edilecek hale getirir.                       
*/

 
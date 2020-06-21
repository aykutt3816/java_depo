package day29polymorphismexception;

public class Exception03 {

	public static void main(String[] args) {
		//b�lme i�lemi yapan bir prog yazal�m
		int num1=0;
		int num2=0;
		try {
		System.out.println(num1/num2);
	}catch(ArithmeticException e) {
		System.out.println("s�f�r b�l�nmez");
	}catch(Exception e) {
		System.out.println("Her exception'i yakala");
	}
	//ArithmeticException Run Time Exception'dir. Matematik kurallarina uygun olmayan bir 
	//islem yapildiginda bu exception alinir.
	
	//try'dan sonra 1'den fazla catch kullanilabilir.Ama ustteki catch alttaki 
	//catch'in child'i olmalidir. catch'leri Specific'den Genel'e dogru dizmelisiniz

	}
}
//ArithmeticException matematik kurallar�na uymay�nca ortaya c�kar runtime exception dur
//try dan sonra birden fazla catch kullan�labilirama �stteki catch alttaki catchin  childi olmal�d�r
//spesifikden genele do�ru dizilmelidir
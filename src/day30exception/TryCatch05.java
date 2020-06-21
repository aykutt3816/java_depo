package day30exception;

public class TryCatch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			hop();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}

}

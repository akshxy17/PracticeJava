package ExceptionalHandling;

public class error {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
//		 int result = 0;
		 
//		 int result1 = a/b;

		 System.out.println("start");
		try {
			 int result1 = a/b;
		}
		catch(ArithmeticException e){
			System.out.println("error in math");
			e.printStackTrace();
		}
		
		System.out.println("END : All is well");
	}

}

package project;

public class Bank {
	
	int currentBalance = 1000;
	String customerName = "Varun";
	
	public  void Greetings() {
		System.out.println("Hello");
	}
	
	public int deposit (int amount) {
		currentBalance = currentBalance + amount;
		return currentBalance;
	}
	
	/*public String name( ) {
		
	}*/

	public static void main(String[] args) {
		//Greetings();
		Bank obj = new Bank();
		obj.deposit(100);
		
		obj.Greetings();
		//System.out.println (obj.name("akshay"));
		
	}

}

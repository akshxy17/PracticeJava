package interfaces;

public class Yamaha extends Hero{

	public void power() {
		System.out.println("40 bhp");
	}

	public void stablility() {
		System.out.println("MRF tyres");
	}

	public static void main(String[] args) {

		Yamaha y = new Yamaha();
		
		RE r = new RE ();

		y.power();
		y.speed();
		
		r.looks();
	}


}

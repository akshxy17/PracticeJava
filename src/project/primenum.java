package project;

public class primenum {

	public static void main(String[] args) {
		int i = 50;
		int count = 0;
		while(i<=150) {
			if(count%2==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}

}

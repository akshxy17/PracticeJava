package project;

public class sumOfEven {

	public static void main(String[] args) {
		int sum=0;
		int i=40;
		while(i<=80) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		
	}

}

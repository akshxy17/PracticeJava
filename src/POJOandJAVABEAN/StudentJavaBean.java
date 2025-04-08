package POJOandJAVABEAN;

import java.io.Serializable;

public class StudentJavaBean implements Serializable {
	
	private int marks;
	
	StudentJavaBean(){
		System.out.println("constructor is mandatory");
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
}

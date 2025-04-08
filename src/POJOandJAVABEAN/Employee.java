package POJOandJAVABEAN;

public class Employee {
	private int age;
	private String name;
	
	Employee(){
		System.out.println("This is pojo class and constructor is not mandatory");
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

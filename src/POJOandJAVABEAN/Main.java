package POJOandJAVABEAN;

public class Main {

	public static void main(String[] args) {
		
//		StudentJavaBean s = new StudentJavaBean();
		//for student class
		
		Employee e = new Employee();// employee class
		
		e.setAge(26);
		System.out.println(e.getAge());
		e.setName("Akshay");
		System.out.println(e.getName());
		
		Employee e1 = new Employee();//for employee 1 class
		e.setAge(20);
		System.out.println(e.getAge());
		e.setName("Aryan");
		System.out.println(e.getName());
		
		//as we class is primitive so we have created it as an array
		Employee[] emp = new Employee[] {e, e1};
		
		
		// Printing names of all employees in the array
		for (Employee employee : emp) {
			System.out.println(employee.getName());
		}
		
	}

}

package GettersAndsetters;

public class Student {
  
	private int id;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void display() {
		
		System.out.println(this.id);
		System.out.println(this.name);
		
	}
}

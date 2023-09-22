package lab5;

public class baby {
	private String name;
	private int age;
	
	// constructor
	public baby() {
		this.name = "unknow";
		this.age = 0;
	}

	public baby(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter && setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

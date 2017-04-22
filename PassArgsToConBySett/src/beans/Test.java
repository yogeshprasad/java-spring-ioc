package beans;

public class Test {
	
	private String gender;
	private int age;
	private String name;

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printData(){
		System.out.println(age + " " + gender + " " + name);
	}
}

package beans;

public class Test {
	
	private String gender;
	private int age;
	private String name;

	public Test(String name, String gender, int age){
		this.age = age;
		this.gender = gender;
		this.name = name;
	}

	public void printData(){
		System.out.println(age + " " + gender + " " + name);
	}
}

package training;

public class Main {
	private String name;
	private int age;
	
	
	

	public Main() {
		super();
	}

	public Main(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		return "Main [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
//		int a = 50;
//		int b = 2;
//		int c = a*b;
//		int d = a-b;
//		
//		System.out.print(c);
//		System.out.print("\n");
//		System.out.print(d);
//		
	

}

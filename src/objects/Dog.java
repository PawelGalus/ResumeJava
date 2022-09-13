package objects;

public class Dog {
	
	protected static int count = 0;
	
	protected String name;
	protected int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		Dog.count += 1;
	}
	
	public void speak() {
		System.out.println("I am " + this.name + " and I am " + this.age + " years old.");
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge() {
		add();
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	private int add() {
		return this.age + 2;
	}
	
	public int getCount() {
		return Dog.count;
	}
}
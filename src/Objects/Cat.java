package Objects;

public class Cat extends Dog {
	
	private int food;

	public Cat(String name, int age, int food) {
		super(name, age);
		this.food = food;
	}
	
	public Cat(String name, int age) {
		super(name, age);
		this.food = 50;
	}
	
	public Cat(String name) {
		super(name, 0);
		this.food = 50;
	}
	
	public void speak() {
		System.out.println("Meow, my name is " + this.name + " and I get fed " + this.food + ".");
	}
	
	public void eat(int x) {
		this.food -= x;
	}
}

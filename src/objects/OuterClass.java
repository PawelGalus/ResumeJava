package objects;

public class OuterClass {
	
	private class InnerClassPrivate {
		
		public void display() {
			System.out.println("This is an private inner class.");
		}
	}
	
	public class InnerClassPublic {
		
		public void display() {
			System.out.println("This is an public inner class.");
		}
	}
	
	public void inner() {
		InnerClassPrivate in = new InnerClassPrivate();
		in.display();
	}
	
	public void innerNew() {
		
		class InnerClass {
			public void display() {
				System.out.println("Inner class.");
			}
		}
		
		InnerClass in = new InnerClass();
		in.display();
	}
}
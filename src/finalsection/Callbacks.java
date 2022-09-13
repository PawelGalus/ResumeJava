package finalsection;

import java.util.function.Consumer;

public class Callbacks {
	
	public void basic() {
		hello("John", "Montana", null);
		
		hello("John", "Montana", value -> {
			System.out.println("no lastName provided for " + value);
		});
		
		hello("John", null, value -> {
			System.out.println("no lastName provided for " + value);
		});
		
		hello2("John", null,
				() -> System.out.println("no lastName provided"));
	}
	
	void hello(String firstName, String lastName, Consumer<String> callback) {
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		}
		else {
			callback.accept(firstName);
		}
	}
	
	void hello2(String firstName, String lastName, Runnable callback) {
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		}
		else {
			callback.run();
		}
	}
}
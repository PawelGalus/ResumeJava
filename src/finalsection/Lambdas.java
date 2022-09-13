package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
	
	public void basic() {
		
		Function<String, String> upperCaseName = name -> name.toUpperCase();
		System.out.println(upperCaseName.apply("Pawel"));
		
		Function<String, String> upperCaseName2 = name -> {
			//logic
			if (name.isBlank()) throw new IllegalArgumentException("");
			return name.toUpperCase();
		};
		System.out.println(upperCaseName2.apply("Joanna"));
		
		BiFunction<String, Integer, String> upperCaseName3 = (name, age) -> {
			int counter = 0;
			//logic
			if (name.isBlank()) throw new IllegalArgumentException("");
			System.out.println(age);
			System.out.println(counter++);
			return name.toUpperCase();
		};
		System.out.println(upperCaseName3.apply("Jerzy", 20));
		
	}
}
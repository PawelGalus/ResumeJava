package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
	
	public void basic() {
		List<Person> people = List.of(
				new Person("John", MALE),
				new Person("Maria", FEMALE),
				new Person("Aisha", FEMALE),
				new Person("Alex", MALE),
				new Person("Alice", FEMALE),
				new Person("Bob", PREFER_NOT_TO_SAY)
				);
		
		people.stream()
			.map(person -> person.gender)
			.collect(Collectors.toSet())
			.forEach(System.out::println);
		
		System.out.println();
		
		//I version
		people.stream()
			.map(person -> person.name)
			.mapToInt(String::length)
			.forEach(System.out::println);
		
		System.out.println();
		
		//II version
		Function<Person, String> personStringFunction = person -> person.name;
		ToIntFunction<String> length = String::length;
		IntConsumer println = x -> System.out.println(x);
		
		people.stream()
			.map(personStringFunction)
			.mapToInt(length)
			.forEach(println);
		
		System.out.println();
		
		Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
		
		boolean containsOnlyFemales1 = people.stream()
			.allMatch(personPredicate);
		
		boolean containsOnlyFemales2 = people.stream()
				.anyMatch(personPredicate);
		
		boolean containsOnlyFemales3 = people.stream()
				.noneMatch(personPredicate);
		
		System.out.println(containsOnlyFemales1);
		System.out.println(containsOnlyFemales2);
		System.out.println(containsOnlyFemales3);
	}
	
	class Person {
		
		private final String name;
		private final Gender gender;
		
		Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
			
		}
		
		public String toString() {
			return "Person (name = " + name + ", gender = " + gender + ")";
		}
	}
	
	enum Gender {
		MALE,
		FEMALE,
		PREFER_NOT_TO_SAY
	}
}
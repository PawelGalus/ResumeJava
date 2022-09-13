package imperativedeclarative;

import static imperativedeclarative.ImperativeDeclarativeApproach.Gender.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ImperativeDeclarativeApproach {
	
	public void basic() {
		List<Person> people = List.of(
				new Person("John", MALE),
				new Person("Maria", FEMALE),
				new Person("Aisha", FEMALE),
				new Person("Alex", MALE),
				new Person("Alice", FEMALE)
				);
		
		//Imperative approach
		System.out.println("--IMPERATIVE APPROACH--");
		
		List<Person> females = new ArrayList<Person>();
		
		for (Person person : people) {
			if (FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		
		for (Person female : females) {
			System.out.println(female);
		}
		
		//Declarative approach
		System.out.println("\n--DECLARATIVE APPROACH--");
		
		//I version
		System.out.println("--I VERSION--");
		
		people.stream()
			.filter(person -> FEMALE.equals(person.gender))
			.forEach(System.out::println);
		
		//II version
		System.out.println("\n--II VERSION--");
		
		Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
		
		List<Person> females_new = people.stream()
			.filter(personPredicate)
			.collect(Collectors.toList());
		
		females_new.forEach(System.out::println);
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
		FEMALE
	}
}
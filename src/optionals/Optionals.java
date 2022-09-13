package optionals;

import java.util.Optional;

public class Optionals {
	
	public void basic() {
		Object value = Optional.ofNullable(null)
				.orElseGet(() -> "default value");
		
		Object value2 = Optional.ofNullable("Hello")
				.orElseGet(() -> "default value");
		
		Object value3 = Optional.ofNullable("Hello")
				.orElseThrow(() -> new IllegalStateException("exception"));

		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		
		Optional.ofNullable("example@gmail.com")
				.ifPresent(email -> System.out.println("Sending email to " + email));
		
		Optional.ofNullable(null)
		.ifPresentOrElse(
				email -> System.out.println("Sending email to " + email),
				() -> System.out.println("Cannot send email"));
	}
}
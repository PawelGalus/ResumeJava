package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Test {
	
	public void basic() {
		Customer customer = new Customer(
				"Alice",
				"alice@gmail.com",
				"+0123456789",
				LocalDate.of(2000, 1, 1)
		);
		
		System.out.println(new CustomerValidatorService().isValid(customer));
		
		//if valid we can store customer in database
		
		//Using combinator pattern
		ValidationResult result = isEmailValid()
			.and(isPhoneNumberValid())
			.and(isAnAdult())
			.apply(customer);
		
		System.out.println(result);
		
		if (result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
	}
}
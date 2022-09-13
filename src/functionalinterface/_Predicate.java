package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
	
	public void basic() {
		System.out.println("--WITHOUT PREDICATE--");
		
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValid("0700000000"));
		System.out.println(isPhoneNumberValid("09009877300"));
		
		System.out.println("\n--WITH PREDICATE--");
		
		System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
		System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
		System.out.println(isPhoneNumberValidPredicate.test("09009877300"));
		
		System.out.println(
				"Is phone number valid and contains number 3 = " +
				isPhoneNumberValidPredicate.and(containsNumber3).test("09009877300")
				);
		
		System.out.println(
				"Is phone number valid and contains number 3 = " +
				isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003")
				);
		
		System.out.println(
				"Is phone number valid and contains number 3 = " +
				isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000")
				);

	}
	
	boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;	
	}
	
	Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
		phoneNumber.startsWith("07") && phoneNumber.length() == 11;
		
	Predicate<String> containsNumber3 = phoneNumber ->
		phoneNumber.contains("3");
}
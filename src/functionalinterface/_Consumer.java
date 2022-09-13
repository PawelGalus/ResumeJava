 package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	
	public void basic() {
		//Normal java function
		Customer maria = new Customer("Maria", "99999");
		
		greatCustomer(maria);
		greatCustomerV2(maria, true);
		greatCustomerV2(maria, false);
		
		//Consumer Functional interface
		greatCustomerConsumer.accept(maria);
		
		greatCustomerConsumerV2.accept(maria, true);
		greatCustomerConsumerV2.accept(maria, false);
	}
	
	BiConsumer<Customer, Boolean> greatCustomerConsumerV2 = (customer, showPhoneNumber) ->
		System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "*********") + ".");
	
	Consumer<Customer> greatCustomerConsumer = customer ->
		System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber + ".");	
	
	void greatCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber + ".");
	}
	
	void greatCustomerV2(Customer customer, boolean showPhoneNumber) {
		System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "*********") + ".");
	}
	
	class Customer {
		private final String customerName;
		private final String customerPhoneNumber;
		
		Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
	}	
}

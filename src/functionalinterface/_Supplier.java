package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
	
	public void basic() {
		System.out.println(getDBConnectionUrl());
		System.out.println(getDBConnectionUrlSupplier.get());
		System.out.println(getDBConnectionUrlSupplierV2.get());
	}
	
	String getDBConnectionUrl() {
		return "jdbc://localhost:5432/users";
	}
	
	Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
	
	Supplier<List<String>> getDBConnectionUrlSupplierV2 = () -> List.of(
			"jdbc://localhost:5432/users",
			"jdbc://localhost:5432/customer");
}
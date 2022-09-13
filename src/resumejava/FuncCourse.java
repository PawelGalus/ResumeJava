package resumejava;

import combinatorpattern.Test;
import finalsection.Callbacks;
import finalsection.Lambdas;
import functionalinterface._Consumer;
import functionalinterface._Function;
import functionalinterface._Predicate;
import functionalinterface._Supplier;
import imperativedeclarative.ImperativeDeclarativeApproach;
import optionals.Optionals;
import streams._Stream;

/**
 * Course: Functional Programming in Java - Full Course.
 */

public class FuncCourse {

	public static void main(String[] args) {
		ImperativeDeclarativeApproach im = new ImperativeDeclarativeApproach();
		_Function func = new _Function();
		_Consumer cons = new _Consumer();
		_Predicate pred = new _Predicate();
		_Supplier sup = new _Supplier();
		_Stream stream = new _Stream();
		Optionals opt = new Optionals();
		Test combinator = new Test();
		Callbacks callback = new Callbacks();
		Lambdas lambda = new Lambdas();
				
		im.basic();
		func.basic();
		cons.basic();
		pred.basic();
		sup.basic();
		stream.basic();
		opt.basic();
		combinator.basic();
		callback.basic();
		lambda.basic();
	}

}
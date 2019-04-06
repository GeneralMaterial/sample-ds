package java8;

import java.util.function.Function;

public class LambdaTest {

	public static void main(String[] args) {

		IFunctional fun = parameter -> parameter + " from lambda";
		String result = new LambdaTest().add("Message ", fun);
		System.out.println(result);

		Function<String, String> fn = pa -> pa + "from lambda 2";
		result = new LambdaTest().add2("Message2 ", fn);
		System.out.println(result);

	}

	public String add(String string, IFunctional fun) {
		return fun.method3(string);
	}

	public String add2(String string, Function<String, String> fn) {
		return fn.apply(string);
	}

}

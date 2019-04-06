package java8;

@FunctionalInterface
public interface IFunctional {

	String method3(String string);
	
	default public void method2(){
		System.out.println("default method in interface");
	}
	
}

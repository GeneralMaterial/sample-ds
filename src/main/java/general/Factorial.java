package general;

import java.util.Random;

public class Factorial {

	public static void main(String[] args) {

		Random ran=new Random();
		
		int number =ran.nextInt(15);
		
		System.out.println(number);
		
		Factorial f= new Factorial();
		int factorial = f.factor(number);
		
		System.out.println(factorial);
		
	}
	
	
	
	private int factor(int i){
		
		
		if(i==1){
			
			return i;
		}else{
			return i * factor(i-1);
		}
		 
		
	}
	
	

}

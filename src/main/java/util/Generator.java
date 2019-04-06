package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

	public static void main(String[] args) {
		Generator.numbers();
		
	}
	
	
	public static List<Integer> numbers(){
		List<Integer> al=new ArrayList<Integer>();
		Random randm=new Random();
		for(int i=0;i<30;i++){
			
			al.add(randm.nextInt(500)+1);
			System.out.println(al.get(i));
		}
		
		return al;
	}
}

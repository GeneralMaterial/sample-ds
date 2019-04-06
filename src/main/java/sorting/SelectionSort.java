package sorting;

import java.util.ArrayList;
import java.util.List;

import util.Generator;

public class SelectionSort {

	
	
	public static void main(String[] args) {

			List<Integer> numbers=Generator.numbers();
			
			List<Integer> sortedNumbers=new ArrayList<Integer>();
			
			for(int i=0; i<numbers.size(); i++){
				int idx=smallestNumberIndex(numbers);
				sortedNumbers.add(numbers.get(idx));
				numbers.remove(idx);
			}
		
			for (Integer integer : sortedNumbers) {
				System.out.println("------->"+integer);
			}
	}
	
	
	
	private static int smallestNumberIndex(List<Integer> numbers){
	
		int smallNumber=numbers.get(0);
		int smallIndex=0;
		
		for(int i=0; i<numbers.size(); i++){
			if(smallNumber>numbers.get(i)){
				smallNumber=numbers.get(i);
				smallIndex=i;				
			}
		}
		
		return smallIndex;
	}
	

}

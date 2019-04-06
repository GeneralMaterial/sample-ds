package general;

import java.util.List;

import util.Generator;

public class SumCallBack {

	public static void main(String[] args) {

		List<Integer> numbers = Generator.numbers();
		System.out.println("numbers.size()" + numbers.size());
		Integer[] nums = new Integer[numbers.size()];

		numbers.toArray(nums);
		totalCount(nums, 0);
		
		int max=findMax(nums, 0);
		System.out.println("max="+max);
		int sum = recursive(nums, 0);
		System.out.println("sum->" + sum);
		
	}

	private static int recursive(Integer[] nums, int count) {

		if (nums.length == count) {
			System.out.println(" count->" + count);
			return 0;
		} else {
			count++;
			return nums[count - 1] + recursive(nums, count);
		}

	}

	private static int totalCount(Integer[] nums, int count) {

		if(count==nums.length){
			System.out.println(" count value::::::::::::->" + count);
			return count;
		}

		count++;
		totalCount(nums, count);
		

		return 0;

	}
	
	
	private static int findMax(Integer[] nums, int count){
		int max=0;
		for (Integer integer : nums) {
			
			if( max < integer ){
				max=integer;
			}
		}
		
		return max;
	}

}

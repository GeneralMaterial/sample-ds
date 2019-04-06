package sorting;

import java.util.List;

import util.Generator;

public class QuickSort {

	public static void main(String[] args) {

		List<Integer> numbers = Generator.numbers();
		System.out.println("numbers.size()" + numbers.size());
		Integer[] nums = new Integer[numbers.size()];

		numbers.toArray(nums);

		for (Integer integer : nums) {
			System.out.println(integer);
		}

	}

	/**
	 * 
	 * @param nums
	 */
	private static Integer[] qsort(Integer[] nums) {

		int pivot = Math.round(nums.length / 2);

		// if(nums.length<2) return nums;
		//
		int[] smaller = new int[pivot];
		int[] greater = new int[pivot];
		//
		// if(nums[0]<=pivot)
		// smaller=nums.
		//
		//
		//
		//
		// if(nums[0]>=pivot)
		//

		// qsort1(nums, pivot)

		for (int i = 0; i < nums.length; i++) {
			if (nums[0] > pivot) {
				greater[0] = nums[0];
			} else {

			}
		}

		return null;

	}

	private static Integer[] qsort1(Integer[] nums) {

		return null;
	}

}

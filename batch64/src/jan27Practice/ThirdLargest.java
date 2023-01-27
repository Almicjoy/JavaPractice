package jan27Practice;

import java.util.Arrays;

public class ThirdLargest {
	
	public int thirdLargest(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-3];
	}

	public static void main(String[] args) {
		ThirdLargest t = new ThirdLargest();
		int[] numbers = {34, 23, 78, 98, 1, 56, 20};
		int third = t.thirdLargest(numbers);
		System.out.println(third);
	}

}

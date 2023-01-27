package jan27Practice;

import java.util.Arrays;

public class EqualArrays <T> {
	
	public boolean isEqual(T[] arr1, T[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4,5};
		Integer[] arr2 = {2,3,4,5,1};
		EqualArrays<Integer> e = new EqualArrays<>();
		boolean result = e.isEqual(arr1, arr2);
		System.out.println(result);

	}

}

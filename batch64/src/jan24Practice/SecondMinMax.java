package jan24Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondMinMax {
	
	public List<Integer> secondMinMax(int[] arr){
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		List<Integer> sortedList = list.stream().sorted().toList();
		int x = list.size();
		List<Integer> secondMinMax = new ArrayList<>();
		secondMinMax.add(sortedList.get(1));
		secondMinMax.add(sortedList.get(x-2));

		return secondMinMax;
		
	}

	public static void main(String[] args) {
		int[] numbers = {2, 3, 1, 6, 3, 8, 3};
		SecondMinMax s = new SecondMinMax();
		List<Integer> secondMinMax = s.secondMinMax(numbers);
		
		System.out.println("Second Min: " + secondMinMax.get(0) + 
				" Second Max: " + secondMinMax.get(1));

	}

}

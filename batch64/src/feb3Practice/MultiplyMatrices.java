package feb3Practice;

import java.util.ArrayList;
import java.util.List;

public class MultiplyMatrices {
	
	public List<List<Integer>> multiply(List<List<Integer>> matrix1, List<List<Integer>> matrix2) {
		if(matrix1.size() != matrix2.get(0).size()) {
			System.out.println("Must have same number of Columns of Matrix 1 and Rows of Matrix 2");
			return null;
		}
		List<List<Integer>> result = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i < matrix1.size(); i++) {
			result.add(new ArrayList<>());
			for(int j = 0; j < matrix1.get(i).size(); j++) {
				sum = 0;
				for(int k = 0; k < matrix2.size(); k++) {
					sum += matrix1.get(i).get(k) * matrix2.get(k).get(j);
				}
				result.get(i).add(sum);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		List<List<Integer>> matrix1 = new ArrayList<>();
		matrix1.add(new ArrayList<>());
		matrix1.add(new ArrayList<>());
		matrix1.get(0).add(1);
		matrix1.get(0).add(2);
		matrix1.get(1).add(3);
		matrix1.get(1).add(4);
		
		List<List<Integer>> matrix2 = new ArrayList<>();
		matrix2.add(new ArrayList<>());
		matrix2.add(new ArrayList<>());
		matrix2.get(0).add(1);
		matrix2.get(0).add(2);
		matrix2.get(1).add(3);
		matrix2.get(1).add(4);
		
		MultiplyMatrices m = new MultiplyMatrices();
		System.out.println(m.multiply(matrix1, matrix2));
	}
	
	

}

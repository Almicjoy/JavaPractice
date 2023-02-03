package feb3Practice;

import java.util.ArrayList;
import java.util.List;

public class AddMatrices {
	
	public List<List<Integer>> add(List<List<Integer>> matrix1, List<List<Integer>> matrix2){
		List<List<Integer>> result = new ArrayList<>();
		if(matrix1.size() != matrix2.size()) {
			System.out.println("Matrices must be of same size");
			return null;
		}
		for(int i = 0; i < matrix1.size(); i++) {
			result.add(new ArrayList<>());
			for(int j = 0; j < matrix1.get(i).size(); j++) {
				int sum = matrix1.get(i).get(j) + matrix2.get(i).get(j);
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
		
		AddMatrices m = new AddMatrices();
		System.out.println(m.add(matrix1, matrix2));
		

	}

}

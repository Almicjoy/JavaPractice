package feb3Practice;

import java.util.LinkedList;
import java.util.List;

public class Substrings {
	
	public List<String> findAllSubstrings(String str) {
		List<String> substrings = new LinkedList<>();
		for(int i = 0; i < str.length(); i++) {
			for(int j = i; j < str.length(); j++) {
				substrings.add(str.substring(i, j + 1));
			}
		}
		return substrings;
	}

	public static void main(String[] args) {
		Substrings s = new Substrings();
		List<String> substrings = s.findAllSubstrings("abcd");
		System.out.println(substrings);
	}

}

package jan24Practice;

import java.util.Arrays;

public class Anagrams {
	
	public boolean anagrams(String x, String y) {
		char[] stringX = x.toCharArray();
		char[] stringY = y.toCharArray();
		Arrays.sort(stringX);
		Arrays.sort(stringY);

		if(Arrays.equals(stringX, stringY)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		Anagrams a = new Anagrams();
		boolean result = a.anagrams("banana", "aaannb");
		boolean result2 = a.anagrams("dog", "odd");
		System.out.println("Anagrams: " + result);
		System.out.println("Anagrams: " + result2);
	}

}

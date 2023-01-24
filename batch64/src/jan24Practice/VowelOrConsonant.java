package jan24Practice;

import java.util.Arrays;
import java.util.List;

public class VowelOrConsonant {
	
	String c;
	
	List<String> vowels =  Arrays.asList("a", "e", "i", "o", "u"); 
	
	public VowelOrConsonant(String c) {
		super();
		this.c = c;
	}
	
	public String isVowelOrConsonant() {
		
		
		if(vowels.contains(c.toLowerCase())) {
			return "Vowel";
		} else {
			return "Consonant";
		}
		
	}

	public static void main(String[] args) {
		VowelOrConsonant vc = new VowelOrConsonant("j");
		System.out.println(vc.isVowelOrConsonant());
		

	}

	

}

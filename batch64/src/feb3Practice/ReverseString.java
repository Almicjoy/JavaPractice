package feb3Practice;

public class ReverseString {
	
	public void printReversedString(String str) {
		char[] charArray = str.toCharArray();
		char[] revCharArray = new char[charArray.length];
		int index = 0;
		for (int i = charArray.length-1; i >= 0; i--) {
			revCharArray[index] = charArray[i];
			index++;
		}
		String revStr = String.valueOf(revCharArray);
		System.out.println(revStr);
	}

	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		r.printReversedString("abcde");
	}

}

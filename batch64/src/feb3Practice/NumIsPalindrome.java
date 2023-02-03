package feb3Practice;

public class NumIsPalindrome {
	
	public String reversedString(String str) {
		char[] charArray = str.toCharArray();
		char[] revCharArray = new char[charArray.length];
		int index = 0;
		for (int i = charArray.length-1; i >= 0; i--) {
			revCharArray[index] = charArray[i];
			index++;
		}
		String revStr = String.valueOf(revCharArray);
		return revStr;
	}

	public boolean checkIfPalindrome(int num) {
		String numStr = String.valueOf(num);
		String str1, str2;
		if(numStr.length()%2 == 0) {
			str1 = numStr.substring(0, numStr.length()/2);
			str2 = numStr.substring(numStr.length()/2, numStr.length());
		} else {
			str1 = numStr.substring(0, numStr.length()/2);
			str2 = numStr.substring(numStr.length()/2 + 1, numStr.length());
		}
		
		String revStr2 = reversedString(str2);
		
		if(str1.equals(revStr2)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		NumIsPalindrome n = new NumIsPalindrome();
		boolean result = n.checkIfPalindrome(1234421);
		System.out.println(result);
	}

}

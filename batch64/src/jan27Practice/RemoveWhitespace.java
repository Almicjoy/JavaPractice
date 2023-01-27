package jan27Practice;

public class RemoveWhitespace {
	
	public String removeWhitespace(String str) {
		String newStr = str.replaceAll(" ", "");
		return newStr;
	}

	public static void main(String[] args) {
		RemoveWhitespace r = new RemoveWhitespace();
		String str = r.removeWhitespace(" a b c d e");
		System.out.println(str);

	}

}

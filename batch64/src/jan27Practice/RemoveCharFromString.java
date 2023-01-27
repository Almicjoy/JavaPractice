package jan27Practice;

public class RemoveCharFromString {

	public String removeChar(String str, char c) {
		String newStr = str.replace(String.format("%s", c), "");
		return newStr;
	}
	
	public static void main(String[] args) {
		RemoveCharFromString r = new RemoveCharFromString();
		System.out.println(r.removeChar("abhnkjade", 'a'));
	}

}

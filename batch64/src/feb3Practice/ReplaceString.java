package feb3Practice;

public class ReplaceString {
	
	public String replaceString(String fullString, String toChange, String replacement) {
		return fullString.replace(toChange, replacement);
	}

	public static void main(String[] args) {
		ReplaceString r = new ReplaceString();
		String str = "Hello how is London";
		System.out.println(str);
		String newStr = r.replaceString(str, "London", "Wales");
		System.out.println(newStr);
	}

}

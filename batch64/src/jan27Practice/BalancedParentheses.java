package jan27Practice;


import java.util.LinkedList;
import java.util.List;

public class BalancedParentheses {
	
	public boolean checkBalance(String str) {
		List<String> parenthesesStack = new LinkedList<>();
		
		char[] symbolArr = str.toCharArray();
		
		for(char c: symbolArr) {
			String s = String.format("%s", c);
			if((s.equals(")") || s.equals("}") || s.equals("]")) && parenthesesStack.isEmpty()) {
				return false;
			} else if(s.equals("(") || s.equals("{") || s.equals("[")) { 
				parenthesesStack.add(0, s); 
			} else if(s.equals(")") && parenthesesStack.get(0).equals("(")) {
				parenthesesStack.remove(0);
			} else if (s.equals("}") && parenthesesStack.get(0).equals("{")) {
				parenthesesStack.remove(0);
			} else if(s.equals("]") && parenthesesStack.get(0).equals("[")) {
				parenthesesStack.remove(0);
			} else {
				return false;
			}
			
		}
		
		if (parenthesesStack.isEmpty()) {
			return true;
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		BalancedParentheses bp = new BalancedParentheses();
		System.out.println(bp.checkBalance("{{[[{{}}]]}}")); //should be true
		System.out.println(bp.checkBalance("(()")); //should be false
		System.out.println(bp.checkBalance("{[]})")); //should be false
		System.out.println(bp.checkBalance("{()}[]")); //should be true
	}

}

package jan24Practice;

public class FindBiggerNumber {

	public int findBiggerNumber(int a, int b) {
		if (a > b) {
			return a;
		}else {
			return b;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		FindBiggerNumber p = new FindBiggerNumber();
		int x = p.findBiggerNumber(2, 4);
		System.out.println(x);
		
		
	}

}

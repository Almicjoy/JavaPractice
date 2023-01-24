package jan24Practice;

public class EvenOrOdd {
	
	int x;
	
	public String evenOrOdd() {
		String result = (x%2 == 0)?"Even":"Odd";
		return result;
	}

	public EvenOrOdd(int x) {
		super();
		this.x = x;
	}

	public static void main(String[] args) {
		EvenOrOdd e = new EvenOrOdd(2);
		String str = e.evenOrOdd();
		System.out.println(str);
	}

}

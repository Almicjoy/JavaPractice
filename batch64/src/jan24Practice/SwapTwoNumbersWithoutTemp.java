package jan24Practice;

public class SwapTwoNumbersWithoutTemp {
	
	int x;
	int y;
	
	public SwapTwoNumbersWithoutTemp(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void swap() {
		x = x + y;
		y = x - y;
		x = x - y;
	}

	public static void main(String[] args) {
		SwapTwoNumbersWithoutTemp p = new SwapTwoNumbersWithoutTemp(3, 4);
		System.out.println(p.x + " " + p.y);
		p.swap();
		System.out.println(p.x + " " + p.y);
		
	}

}

package jan27Practice;

public class SwapWithoutThird {
	
	public SwapWithoutThird(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int x;
	int y;
	
	public void swapWithoutThird() {
		x = x + y;
		y = x - y;
		x = x - y;
	}

	public static void main(String[] args) {
		SwapWithoutThird s = new SwapWithoutThird(2, 3);
		System.out.println(s.x + " " + s.y);
		s.swapWithoutThird();
		System.out.println(s.x + " " + s.y);

	}

}

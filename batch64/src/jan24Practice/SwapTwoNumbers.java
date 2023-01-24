package jan24Practice;

public class SwapTwoNumbers {
	
	int y;
	int z;
	
	public void swapTwoNumbers(SwapTwoNumbers p) {
		int temp = p.y;
		p.y = p.z;
		p.z = temp;
	}

	public static void main(String[] args) {
		SwapTwoNumbers p = new SwapTwoNumbers();
		p.y = 3;
		p.z = 4;
		System.out.println(p.y + " " + p.z);
		p.swapTwoNumbers(p);
		System.out.println(p.y + " " + p.z);
	}

}

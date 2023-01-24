package jan24Practice;

public class BiggerAmongThree {

	public int biggerAmongThree(int x, int y, int z) {
		int biggest = x;
		if(y > biggest) {
			biggest = y;
		}
		if(z > biggest) {
			biggest = z;
		}
		return biggest;
	}
	
	public static void main(String[] args) {
		BiggerAmongThree b = new BiggerAmongThree();
		int biggest = b.biggerAmongThree(5, 3, 75);
		System.out.println(biggest);
	}

}

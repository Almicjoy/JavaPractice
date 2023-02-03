package feb3Practice;

public class GenerateRandomInt {
	
	public static int generateRandom(int min, int max) {
		return (int)(Math.random() * (max - min + 1) + min);
	}

	public static void main(String[] args) {
		
		int randomNum = generateRandom(10, 20);
		System.out.println(randomNum);
	}

}

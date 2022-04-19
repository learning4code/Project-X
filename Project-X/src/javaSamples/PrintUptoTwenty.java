package javaSamples;

public class PrintUptoTwenty {

	public static void main(String[] args) {

		//twentyIncreasing()
		//printNumbersDescreasing(30);
		printNumbersIncreasing(30);

	}

	public static void twentyIncreasing() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
		}

	}
	
	public static void printNumbersIncreasing(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}

	}
	
	
	static void printNumbersDescreasing(int n) {
		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
		
	}

}

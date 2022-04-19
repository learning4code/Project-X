package dsaA;

public class RecursionDemo {

	public static void main(String[] args) {
		
		printDSA(5);
		
		//System.out.println(numFactorial(5));
		
		//System.out.println(numAddition(6));
		
	}
	
	public static void printDSA(int n) {
			
			if(n!=0) {
			System.out.println("DSA");
			printDSA(n-1);
			}
		
	}
	
	
	
	
	public static int numFactorial(int num) {
		
		if(num==0) {
			return 1;
		}else {
			return num*numFactorial(num-1);
		}
	}
	
	public static int numAddition(int num) {
		if(num==0) {
			return 0;
		}else {
			return num+numAddition(num-1);
		}
	}

}

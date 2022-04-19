package dsaA;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int[] arr = { 13, 15, 9, 0, 100, 122, 2938, 21881 };
		System.out.println(lenearSearch2(arr, 1001));
		// addNum(100, 200);
	}

	static boolean lenearSearch2(int[] rollNo, int target) {
		int len = rollNo.length;
		
		boolean b=false;
		for (int i = 0; i < len; i++) {

			if (rollNo[i] == target) {
				b = true;
				break;
			} 
		}
		return b;
	}

	static boolean lenearSearch(int[] rollNo, int target) {
		int len = rollNo.length;
		boolean ans=false;

		if (len == 0) {
			return ans ;
		}

		for (int i = 0; i < len; i++) {
			if (rollNo[i] == target) {
				ans=true;
				return ans;
			}
		}
		return ans;
	}

	static void addNum(int num1, int num2) {

		int ans = num1 + num2;
		System.out.println(ans);
	}
}

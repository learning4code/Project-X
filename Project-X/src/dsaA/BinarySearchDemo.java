package dsaA;

public class BinarySearchDemo {

	public static void main(String args[]) {

		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int Num = 10;
		int result = binarySearch(arr, 0, n - 1, Num);
		if (result == -1)
			System.out.println("Sorry! No such element in the array!");
		else
			System.out.println("Element found!Index is: " + result);
	}


	static int binarySearch(int arr[], int s, int e, int findx) {
		if (e >= s) {
			int mid = s + (e - s) / 2;

			if (arr[mid] == findx)
				return findx;

			if (arr[mid] > findx)
				return binarySearch(arr, s, mid - 1, findx);

			return binarySearch(arr, mid + 1, e, findx);
		}

		return -1;
	}

}

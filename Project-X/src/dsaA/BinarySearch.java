package dsaA;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { -200,-101,-20,0, 5, 7, 8, 10, 13, 34, 120 };

		System.out.println(useBinarySearch(arr, 34));

	}

	public static int useBinarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (target > arr[mid]) {
				start = mid + 1;

			} else if (target < arr[mid]) {
				end = mid - 1;

			} else {
				return mid;
			}

		}
		return -1;
	}

}

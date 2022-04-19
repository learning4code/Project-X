package dsaA;

import java.util.Arrays;

public class MaximumValue {
	public int a = 10;

	public static void main(String[] args) {
		int[] arr = { 13, 45, 100, 1, 66 };

		selectionShort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static int getMaxRange(int[] arr, int start, int end) {

		if (start > end) {
			return -1;
		}

		if (arr == null) {
			return -1;
		}

		int maxVal = arr[start];
		for (int i = start; i <= end; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}

	static int getMaxValue(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		int maxVal = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}

	public static int getMaxIndex(int[] arr, int startIndex, int endIndex) {
		int maxIndex = startIndex;

		for (int i = startIndex; i <= endIndex; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}

		return maxIndex;
	}

	static void swapInt(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

	public static void selectionShort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length - i - 1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swapInt(arr, maxIndex, last);
		}
	}

}

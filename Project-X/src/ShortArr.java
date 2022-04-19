import java.util.Arrays;
import dsaA.MaximumValue;
public class ShortArr {

	public static void main(String[] args) {
		int[] arr= {52,46,172,435,3};
		MaximumValue mx=new MaximumValue(); 
		mx.selectionShort(arr);
		System.out.println(Arrays.toString(arr));
		//bubbleShortArr(arr);
		
	}

	static void bubbleShortArr(int[] intArr) {
		// declaring array type and initializing
		int temp = 0;
//printing original arr
		System.out.println("Arr before shorting: ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}

		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				// swapping elements in arr
				if (intArr[i] > intArr[j]) { 
					temp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = temp;
				}
			}
		}
			// printing shorted arr
		System.out.println("\nArr sorted(ascending order): ");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
	}

	static void shortArrMethod() {

		int[] arr = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };

		
		System.out.println("Elements of array before sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		System.out.println("Elements of array sorted in ascending order: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

package dsaA;

import java.util.*;

public class ArraysDemo{

	public static void main(String[] args) {

		//stackDemo();
		linkedListVsArrListDemo();

	}

	static void array1d() {
       int[] RollNoA=new int[3];
       RollNoA[0]=212;
       RollNoA[1]=312;
       RollNoA[2]=412;
	}

	static void array2d() {
		// int[][] a=new int[3][];
		int[][] a = { { 3, 2, 4 }, { 4, 5, 6 }, { 7, 8, 0 } };

		System.out.println(a[1][2]);
	}

	static void arrayVsArrayList() {
		/*
		 * String[] StudentArr=new String[3]; StudentArr= {"Kapil","Krishna","Om"};
		 * StudentArr[0]="Kapil"; StudentArr[1]="Krishna"; StudentArr[2]="Om";
		 */

		String[] StudentArr = { "Kapil", "Krishna", "Om" };

		int[] StudentRoll = { 2, 3, 4 };

		ArrayList<Integer> StudentRollAL = new ArrayList<>();

		StudentRollAL.add(2);
		StudentRollAL.add(3);
		StudentRollAL.add(4);

		// System.out.println(StudentRoll[2]);

		System.out.println(StudentRollAL.get(2));

		StudentArr[0] = "Jay";
		// System.out.println(StudentArr[0]);

		// System.out.println(StudentArr[1]);

		ArrayList<String> StudentArrL = new ArrayList<>();
		StudentArrL.add("Kapil");
		StudentArrL.add("Krishna");
		StudentArrL.add("Om");
		// System.out.println(StudentArrL.get(1));

		StudentArrL.remove(0);

		// System.out.println(StudentArrL.get(0));
			

	}
	
	static void linkedListVsArrListDemo() {
		LinkedList<String> StudentLL=new LinkedList<String>();
		StudentLL.add("Anil");
		StudentLL.add("Akash");
		StudentLL.add("Dibya");
		
		System.out.println(StudentLL.get(2));
		
		StudentLL.add(1, "Subekshya");
		
		System.out.println(StudentLL.get(2));
		
		ArrayList<String> StudentAL=new ArrayList<String>();
		StudentAL.add("Anil");
		StudentAL.add("Akash");
		StudentAL.add("Dibya");
		
		System.out.println(StudentAL.get(2));
		StudentAL.add(1, "Subekshya");
		System.out.println(StudentAL.get(2));
	}
	
	
	
	
	
}

package javaSamples;

import java.util.Scanner;

public class NestedIfElseDemo {
	
/*	it is used to execute multiple conditions checking, 
	while executing this statement one by one the conditions will be 
	checked and the condition inside will execute. */

	public static void main(String[] args) {
		System.out.println("Enter salary :");
		Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
		int gsal=0;
		int comm=0;
		
		if(sal<20000)   //10% comm for salary less than 20000
			comm=10;
		else if(sal>=20000&&sal<=40000) //20% comm for salary 20000 to 40000
			comm=20;
		else 
			comm=30;
		gsal=sal-(comm*sal)/100;
		System.out.println("Gross salary: "+gsal);

	}

}

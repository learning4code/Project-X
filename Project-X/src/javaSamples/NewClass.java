package javaSamples;

import java.util.Scanner;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanInt();

	}
	
	public static void scanInt() {
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter First Number: ");
	int f=sc.nextInt();
	
	System.out.println("Enter Second Number: ");
	int s=sc.nextInt();
	
	System.out.println("addition of two numbers entered: "+(f+s));
	}

}

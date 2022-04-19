package javaSamples;

import java.util.Scanner;

public class DoWhileDemo {
	
	/* it is similar to while except that conditions are 
	 checked at the end of the statements.*/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String uid,pwd;
		do
		{
			System.out.println("Enter Username: ");
			uid=sc.next();
			System.out.println("Enter Password: ");
			pwd=sc.next();
		}
		while(!uid.equals("java") || !pwd.equals("programs")); //i!=9, i==9
		System.out.println("Login Success!!");
	}

}

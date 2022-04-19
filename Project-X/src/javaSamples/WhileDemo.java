package javaSamples;

public class WhileDemo {
	
	/* it is used to execute a set of statements repeatedly based on the condition
	 until the condition is failed. */

	public static void main(String[] args) {
		int j=1, s=0;
		while(j<=10)
		{
			s=s+j;
			j=j+1;
		}
	System.out.println("The sum of first 10 number is : "+s);

	}

}

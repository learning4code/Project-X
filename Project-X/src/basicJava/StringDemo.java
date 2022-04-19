package basicJava;

public class StringDemo {

	public static void main(String[] args) {

		int i=99;    //primitive datatype
		char c='a';
		double d=1.2;
		
		String s="Hello!"; //non-primitive
		
		String st=new String(s);
		
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
	}

}

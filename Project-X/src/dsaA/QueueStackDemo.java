package dsaA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStackDemo {
	public static void main(String[] args) {
		//getQueue();
		getStack();
	}

	static void getQueue() {
		Queue<String> studentQ = new LinkedList<String>();
		studentQ.add("Anish");
		studentQ.add("Santosh");
		studentQ.add("Binay");
		
		studentQ.poll();
		studentQ.poll();
		studentQ.poll();
		
		
		System.out.println(studentQ);
		System.out.println(studentQ.peek());
		
	}
	
	static void getStack() {
		Stack<String> BookStk=new Stack<String>();
		BookStk.add("Programming");
		BookStk.add("Networking");
		BookStk.add("Database");
		System.out.println(BookStk.peek());
		/*
		BookStk.pop();
		BookStk.pop();
		BookStk.pop();
		
		System.out.println(BookStk.peek());
		*/
	}
}

package com.sample.training.collections.programmes;

import java.util.ListIterator;
import java.util.Stack;
import java.util.function.Consumer;

public class StackToQueue {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(9);
		s.push(8);
		s.push(5);
		s.push(6);
		s.push(2);
		System.out.println(s);
		Stack<Integer> queue = new Stack<>();		
		int l = s.size();
		for (int i = 0;i<l;i++) {		
			//int n = li.next();
			queue.push(s.pop());
			//System.out.println(s.pop());
			//System.out.println(n);
		}
		//queue.pop();
		System.out.println(queue);
		
		
 
	}

}

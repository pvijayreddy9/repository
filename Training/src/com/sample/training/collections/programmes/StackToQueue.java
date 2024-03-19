package com.sample.training.collections.programmes;

import java.util.ListIterator;
import java.util.Stack;

public class StackToQueue {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(9);
		s.add(8);
		s.add(5);
		s.add(6);
		s.add(2);
		System.out.println(s);
		Stack<Integer> queue = new Stack<>();
		ListIterator<Integer> li = s.listIterator();
		while(li.hasNext()) {
			int n = li.next();
			queue.add(n);
			System.out.println(n);
		}
		System.out.println(queue);
		
 
	}

}

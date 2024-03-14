package com.sample.training.day2;

import java.util.Stack;

public class ReverseStringWithStack {

	public static void main(String[] args) {
		String s1 = "Hello";
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s1.length(); i++) {
			stack.push(s1.charAt(i)+"");
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
			
		}
		System.out.println(s1);
		System.out.println(sb);
	}

}

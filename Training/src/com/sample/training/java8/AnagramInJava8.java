package com.sample.training.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramInJava8 {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silents";
		if(s1.length()==s2.length()) {
			s1=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
			s2=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
			if(s1.equals(s2)) {
				System.out.println("Strings are anagram");
			}else {
				System.out.println("Strings are not anagram");
			}
		}else {
			System.out.println("Strings are not anagram");
		}

	}

}

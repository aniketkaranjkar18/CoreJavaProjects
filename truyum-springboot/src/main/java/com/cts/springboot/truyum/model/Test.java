package com.cts.springboot.truyum.model;

import java.util.function.Predicate;

public class Test {
	
	public static void main(String[] args) {
		Predicate<String> p = (String str) -> str.length()>=5;
		System.out.println(p.test("abcd"));
	}
}

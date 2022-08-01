package com.cts.springboot.truyum.model;

public class Lamda {
	
	public static void main(String[] args) {
		Runnable r = () -> {
			int c =1;
			for(int i=0;i<10;i++) {
				System.out.println(c+ " In child class");
				c++;
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
	
}

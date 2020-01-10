package com.aine.day_03;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fib(4));
	}
    public static int fib(int N) {
        int a = 0;int b = 1;
    	for(int i = 0;i < N;i++) {
    		
    		a = a+b;
    		b = a-b;
    	}
    	
    	return a;
    }

}

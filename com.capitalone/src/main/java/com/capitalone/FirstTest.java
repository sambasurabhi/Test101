package com.capitalone;

public class FirstTest {

	public static void main(String args[]){
		System.out.println("Hello World");
		System.out.println("Hello World1");
		System.out.println("Hello World2");
		
		method1();
		
		
		System.out.println("Change 404");
		

		int [] data = {1,2,3};
		for(int val : data){
			System.out.println(val);
		}

		int[] data1 = {7,8,9};
		int sum = 0;
		for(int val : data1){
			sum = + val;
		}
		System.out.println("Sum of Values =>" + sum);
		
	}
	
	public static void method1(){
		System.out.println("Method 1000 >>>");
	}
}

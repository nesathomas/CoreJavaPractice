package com.nesa.corejava.basics;

public class OperatorsDemo {

	public static void main(String[] args) {

		int a = 15;
		int b = 4;
		
		//ARITHMETIC OPERATORS
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//RELATIONAL OR COMPARISON OPERATORS
		if(a==b) {
			System.out.println("a==b");
		}else if (a>=b){
			System.out.println("a>=b");
		}else if (a<=b) {
			System.out.println("a<=b");
		}else if (a<b) {
			System.out.println("a<b");
		}else if(a!=b) {
			System.out.println("a!=b");
		}else {
			System.out.println("none");
		}
		
		
		
	}

}

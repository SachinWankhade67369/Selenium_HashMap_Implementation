package com.UsecollectionInSelenium;

public class demo {
	
	public static void main(String[] args) {
		B b= new B(1, 2, 3);
		
	}

}

class A
{
	int a;
	int b;
	public A() {
		// TODO Auto-generated constructor stub
	}
	
	public A(int a,int b) {
		this.a= a;
		this.b=b;
	
	}
	
}

class B extends A
{
	float c;
	public B() {
		// TODO Auto-generated constructor stub
	}
	public B(int a,int b,float c) {
		super(a,b);
		//super(this());//not possible.
		this.c=c;
		System.out.println(" "+a+" "+b+" "+c);
	}
}

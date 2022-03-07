package com.harsha;

class A1{
	void run()
	{
		System.out.println("Hello");
	}
}
class B1 extends A1{
	@Deprecated
	void run()
	{
	
		System.out.println("Hi");
	}

	}



public class Demo{
	public static void main(String[] args) {
		A1 obj1=new A1();
		obj1.run();
		

	}

}

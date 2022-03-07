package com.harsha;
class A{
	void run()
	{
		System.out.println("Hello");
	}
}
class B extends A{
	@Override
	void run()
	{
		System.out.println("Hi");
	}
}
public class AnnotationDemo {

	public static void main(String[] args) {
		B obj = new B();
		obj.run();

	}

}

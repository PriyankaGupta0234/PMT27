package statie;

abstract class A{
	void m1() {
		System.out.println("Concrete");
	}
	abstract void m2();
	
}

public class scopee extends A{
	void m2() {
		System.out.println("Abstact");
	}
	public static void main(String[]args) {
		scopee a = new scopee();
		a.m1();
		a.m2();
	}
	
}
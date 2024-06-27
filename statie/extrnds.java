package statie;

abstract class B{
	void m1() {
		System.out.println("Concrete");
	}
	abstract void m2();
	public B() {
		System.out.println("Constructor");
	}
	
}

public class extrnds extends A{
	void m2() {
		System.out.println("Abstact");
	}
	public static void main(String[]args) {
		extrnds a = new extrnds();
		a.m1();
		a.m2();
	}
	
}
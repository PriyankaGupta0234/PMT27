package statie;
interface Practical{
	void m1();
	abstract void m2();
}
interface Practical1{
	void m2();
	
	interface Practical2{
		void m3();

public class twonumber implements Practical, Practical1, Practical2 {
	public void m1() {
		System.out.println("Priyanka");
	}
	
	public void m2() {
		System.out.println("24");
	}
	
	public void m3() {
		System.out.println("23");
	}
}
	public static void main(String[] args) {
		twonumber i = new twonumber();
		i.m1();
		i.m2();
	}
	}
	}


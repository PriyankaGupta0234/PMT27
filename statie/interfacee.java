package statie;
interface Practice{
	int a=23;
	void m1();
	abstract void m2();
}

public class interfacee implements Practice {
	public void m1() {
		System.out.println("Priyanka");
	}
	public void m2() {
		System.out.println("Gupta");
	}

	public static void main(String[] args) {
		interfacee i = new interfacee();
		i.m1();
		i.m2();
		System.out.println(Practice.a);

	}

}

package statie;

interface inter{
	void m1();
	void m2();

	abstract class interr implements inter {
		public void m1() {
			System.out.println("Interface in Abstract class M1");
		}
	}

	public class prac extends interr {
		public void m2() {
			System.out.println("Interface is normal class M2");
		}
	}

	public static void main(String[] args) {
		prac i1 = new prac();
		i1.m1();
		i1.m2();
	}
}

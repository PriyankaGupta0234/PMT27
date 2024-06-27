package statie;

abstract class chutiya{
	abstract void Aditya ();
	abstract void Sagar ();
	abstract void Maaz ();
	abstract void Neha ();
	abstract void Nikhil();
	
}

public class Cheff extends chutiya{
	void Aditya () {
		System.out.println("Aditya - Paneer");
	}
	
	void Sagar () {
		System.out.println("Sagar - Panipuri");
	}
	
	void Maaz () {
		System.out.println("Maaz - zalebi");
	}
	
	void Neha () {
		System.out.println("Neha - Dhokla");
	}
	
	void Nikhil () {
		System.out.println("Nikhil - Itli");
	}
	public static void main(String[] args) {
		Cheff c = new Cheff();
		c.Aditya();
		c.Sagar();
		c.Maaz();
		c.Neha();
		c.Nikhil();
	}
	
	
}
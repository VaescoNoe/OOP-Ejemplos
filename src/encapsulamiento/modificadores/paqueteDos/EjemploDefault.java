package encapsulamiento.modificadores.paqueteDos;

public class EjemploDefault {
	public static void main(String[] args) {
		Foo foo = new Foo();
		foo.bar = 10;
	}
}

class Bar extends Foo {
	void dos() {
		System.out.println(beer);
	}
}

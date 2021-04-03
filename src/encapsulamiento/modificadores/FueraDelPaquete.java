package encapsulamiento.modificadores;


import encapsulamiento.Encapsulamiento;
import encapsulamiento.modificadores.paqueteDos.Foo;

public class FueraDelPaquete {

	public static void main(String[] args) {
		Encapsulamiento e = new Encapsulamiento();
	}
}

class Dos extends Foo {
	void dos() {
		System.out.println(beer);
		//System.out.println(bar); no se permite ver defaults
	}
}
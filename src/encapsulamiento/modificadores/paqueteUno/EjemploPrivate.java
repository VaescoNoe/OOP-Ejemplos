package encapsulamiento.modificadores.paqueteUno;

public class EjemploPrivate {

	public static void main(String[] args) {
		Tocino t = new Tocino();
		
	}

}

class Tocino {
	private String marca;

	private void echarseAPerder() {
		System.out.println("El tocino " + marca + " se está echando a perder");
	}
}
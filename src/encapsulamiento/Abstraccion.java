package encapsulamiento;

public class Abstraccion {
	Auto a = new Auto();
	Chofer c = new Chofer();
	public static void main(String[] args) {
		Auto a = new Auto();
		Chofer c = new Chofer();
		c.conducir(a);
		
	}
	
}

class Chofer {
	void conducir(Auto a) {
		System.out.println("Estoy conduciendo");
		a.encender();
		a.acelerar();
		a.cambiarVelocidad();
		a.frenar();
	}
}

class Auto {
	public void encender() {
		System.out.println("Encendido");
		pasarCorriente();
		verificarNiveles();
		iniciarMarcha();
	}

	public void acelerar() {
		System.out.println("Acelerando");
	}

	public void frenar() {
		System.out.println("Frenando");
	}

	public void cambiarVelocidad() {
		System.out.println("Cambiando de velocidad");
	}

	private void pasarCorriente() {
		System.out.println("Pasando corriente");
	}

	private void iniciarMarcha() {
		System.out.println("Iniciando marcha");
	}

	private void verificarNiveles() {
		System.out.println("Verificando niveles");
	}
}
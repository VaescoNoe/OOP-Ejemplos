package interfaces;

interface Volador {
	default void volar() {
		System.out.println("Estoy volando");
	}

	void despegar();

	void aterrizar();
}

class Animal {
	void nacer() {
	}

	void morir() {
	}
}

class Aguila extends Animal implements Volador {

	@Override
	public void despegar() {
	}

	@Override
	public void aterrizar() {
	}

}

class Avion implements Volador {

	@Override
	public void despegar() {
	}

	@Override
	public void aterrizar() {
	}
}

class SuperHeroe implements Volador{

	@Override
	public void despegar() {
	}

	@Override
	public void aterrizar() {
	}
	
}

public class Interfaces {
	
	void hacerVolar(Volador[] voladores) {
		for(Volador volador: voladores) {
			volador.despegar();
			volador.volar();
			volador.aterrizar();
		}
		
	}
	
	public static void main(String[] args) {
		Aguila a = new Aguila();
		Avion av = new Avion();
		Volador v = new Aguila();
		Volador v1 = new Avion();
		SuperHeroe sh = new SuperHeroe();
		
		Volador[] voladores = {a,av,v,v1,sh};
		
		Interfaces iteradorInter = new Interfaces();
		iteradorInter.hacerVolar(voladores);
		
		
	}
}

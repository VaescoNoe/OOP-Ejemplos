package herencia;

public class Herencia2 {

	public static void main(String[] args) {
		Estudiante e = new Estudiante("Jose",8456);
		e.dormir();

		Trabajador t = new Trabajador("Pedro",5000.0f);
		t.dormir();
	}

}

class Estudiante extends Persona {
	Integer numCuenta;

	public Estudiante(String nombre, Integer numCuenta) {
		super(nombre);
		this.numCuenta = numCuenta;
	}
	
	public Estudiante() {
	}

	void aprobar() {
		System.out.println("Soy ".concat(nombre).concat(" mi número de cuenta es: ").concat(numCuenta.toString())
				.concat(" y aprobe mi examen"));
	}
	
	void aprobar(Float calificacion) {
		System.out.println("Soy ".concat(nombre).concat(" mi número de cuenta es: ").concat(numCuenta.toString())
				.concat(" y aprobe mi examen con ").concat(calificacion.toString()));
	}

	void reprobar() {
		System.out.println("Soy ".concat(nombre).concat(" mi número de cuenta es: ").concat(numCuenta.toString())
				.concat(" y reprobe mi examen"));
	}
	
	@Override
	void dormir() {
		System.out.println("Soy ".concat(nombre).concat(", soy un estudiante y yo no duermo"));
	}
}

class Trabajador extends Persona {
	Float sueldo;

	public Trabajador(String nombre, Float sueldo) {
		super(nombre);
		this.sueldo = sueldo;
	}
	
	public Trabajador() {
	}

	void trabajar() {
		System.out.println("Soy ".concat(nombre).concat(" y estoy trabajando"));
	}

	void cobrar() {
		System.out.println("Soy ".concat(nombre).concat(" y estoy cobrando y me dieron ").concat(sueldo.toString()));
	}

}

class Persona {

	String nombre;
	String fechaDeNacimiento;

	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona() {
	}

	void dormir() {
		System.out.println("Soy ".concat(nombre).concat(" y estoy durmiendo"));
	}

	void respirar() {
		System.out.println("Soy ".concat(nombre).concat(" y estoy respirando"));
	}

	void comer() {
		System.out.println("Soy ".concat(nombre).concat(" y estoy comiendo"));
	}
}
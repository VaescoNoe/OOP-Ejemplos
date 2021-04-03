package enumeracion;

public class Enumeraciones {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.nombre = "Noe";
		p.genero = Genero.MASCULINO;

		System.out.println(p.genero.getDescripcion());
		System.out.println(p.genero.getValor());
	}
}


// Enum: conjunto de constantes simbolicas
enum Genero {
	MASCULINO("Masculino", 1), FEMENINO("Femenino", 0);

	private String descripcion;
	private Integer valor;

	private Genero(String descripcion, Integer valor) {
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Integer getValor() {
		return valor;
	}

}

enum DiasDeLaSemana {
	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
}

class Persona {
	String nombre;
	Genero genero;
}
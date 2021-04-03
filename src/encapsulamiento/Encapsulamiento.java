package encapsulamiento;

public class Encapsulamiento {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Pedro");
		p.setEdad(25);
		p.setSexo('M');
		p.imprimir();
	}
}

class Persona {
	private String nombre;
	private Integer edad;
	private char sexo;


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	void imprimir() {
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(sexo);
	}
}
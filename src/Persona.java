
//Nombre de la clase
public class Persona {

	// El método main define el punto de inicio de mi programa
	public static void main(String[] args) {

		System.out.println("Ejecución de Jose");
		// [Tipo de dato][nombre de la referencia] = [operador de JAVA que permite crear objetos][Constructor]
		Persona persona1 = new Persona("Jose", 70, 'M');
		persona1.respirar();
		persona1.nacer();

		System.out.println("Ejecución de Maria");
		Persona persona2 = new Persona("Maria", 80, 'F');
		persona2.respirar();
		persona2.nacer();
		
		System.out.println("Ejecución de Pedro");
		Persona persona3 = new Persona();

	}

	/*
	 * Atributos de la Clase 
	 * [Modificador] [tipo de dato] [nombre del atributo]
	 */

	String nombre;
	Integer edad;
	char sexo;

	// Se puede tener más de un constructor, siempre y cuando reciba diferentes parámetros
	// Cuando yo creo un constructor propio renuncio al constructor por defecto así que si lo necesito lo debo de crear
	public Persona(String nombre, Integer edad, char sexo) {
		System.out.println("Constructor con 3 parametros (String, Integer, char)");
		// this.[Atributo de la clase] = [parametro de entrada del constructor]
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	// Constructor por defecto
	// [Modificador][Nombre de la Clase](parametros)
	public Persona() {
		// Si Utilizo this() para ejecutar otro constructor, debe de ser en la primera línea de código de mi constructor, solo se permite un this() en la clase para los constructores
		this("Defaulr",10,'F');
		System.out.println("Constructor sin parametros");
	}

	/*
	 * Métodos de la Clase [modificador] [valor de retorno] [nombre del método](parametros)
	 */
	void respirar() {
		System.out.println("La persona ".concat(nombre).concat(" está respirando"));
	}

	void nacer() {
		System.out.println("La persona ".concat(nombre).concat(" lleva ").concat(edad.toString()).concat(" años viv@"));
	}

	void morir() {
		System.out.println("La persona ".concat(nombre).concat(" murio a los ").concat(edad.toString()).concat(" años"));
	}

}

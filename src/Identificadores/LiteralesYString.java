package Identificadores;

public class LiteralesYString {
	
	public static void main(String[] args) {
		// tipo de dato identificador = literal
		
		int edad = 20;
		float f = 2.0f;
		
		/*
		 * Inmutables
		 * */
		//Implicita
		String s = "Hello World";
		String s2 = "Hello World";
		
		System.out.println(s == s2);
		
		//Explicita
		String x = new String("Hello World");
		String x2 = new String("Hello World");
		
		// == : compara si dos referencias apuntan al mismo objeto
		System.out.println(x == x2);
		
		// equals : compara si dos String tienen el mismo valor
		System.out.println(x.equals(x2));
		
		
	}

}

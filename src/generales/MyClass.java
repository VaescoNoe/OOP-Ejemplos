package generales;

//Importaciones estaticas
import static java.lang.Math.*;

public class MyClass {

	//Una variable o otributos constante se utiliza para CONSTANTES
	final Integer  numero = 0;
	public static void main(String[] args) {
		//Importaciones staticas
		System.out.println(PI);
	}
	
	
	
}

//No se puede hererdar de una clase final
final class ClaseFinal{}


class MyClassDos{
	
	//No se puede sobre escribir un metoedo final
	final void metodo() {
		
	}
}
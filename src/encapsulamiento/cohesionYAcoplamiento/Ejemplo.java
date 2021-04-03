package encapsulamiento.cohesionYAcoplamiento;

/*
 * ALTA cohesion y BAJO acoplamiento
 * 
 * */
public class Ejemplo {
	
	
	
	public static void main(String[] args) {
		EjemploInterface ei = new IEjemploInterface2();
		ei.valor(3);
		Integer e = ei.getDigito();
		
		System.out.println(e);
	}
}

interface EjemploInterface {
	public void valor(Integer dato);
	public Integer getDigito();
}

class IEjemploInterface implements EjemploInterface {

	Integer dato;
	@Override
	public void valor(Integer dato) {
		this.dato= dato+1;
	}
	@Override
	public Integer getDigito() {
		return this.dato;
	}
	
}

class IEjemploInterface2 implements EjemploInterface {

	Integer numero;
	@Override
	public void valor(Integer dato) {
		this.numero = dato+2;
	}

	@Override
	public Integer getDigito() {
		return this.numero;
	}
	
}
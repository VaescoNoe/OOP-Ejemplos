package polimorfismo;

public class EjemploFiguras {
	
	public double sumarAreas(Figura[] figuras) {
		Double sumaTotal = 0.0;
		for (Figura figura : figuras) {
			Double areaDeFigura = figura.CalcularArea();
			if(figura instanceof Circulo) {
				System.out.println("Procesando un Circulo con el radio: ".concat(((Circulo)figura).getRadio().toString()));				
			}
			System.out.println("Área de figura ".concat(figura.getClass().getName()).concat(" es: ").concat(areaDeFigura.toString()).concat(" de color: ").concat(figura.getColor()));
			sumaTotal += areaDeFigura;
		}
		 
		return sumaTotal;
	}

	public static void main(String[] args) {
		Figura [] arr = {
				new Cuadrado("Verde", 10.5),
				new Circulo("Rojo",11.1),
				new Rectangulo("Azul", 10.2, 11.6)
		};
		
		EjemploFiguras ef = new EjemploFiguras();
		Double sumaFiguras = ef.sumarAreas(arr);
		System.out.println("Resultado: ".concat(sumaFiguras.toString()));
	}

}

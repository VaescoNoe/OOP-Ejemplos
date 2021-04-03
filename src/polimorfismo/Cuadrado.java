package polimorfismo;

public class Cuadrado extends Figura {
	
	private Double lado;

	public Cuadrado(String _color, Double _lado) {
		super(_color);
		lado = _lado;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	@Override
	public double CalcularArea() {
		return lado * lado;
	}

}

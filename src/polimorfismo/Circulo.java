package polimorfismo;

public class Circulo extends Figura {

	private Double radio;

	public Circulo(String _color, Double _radio) {
		super(_color);
		radio = _radio;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	@Override
	public double CalcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

}

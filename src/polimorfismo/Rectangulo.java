package polimorfismo;

public class Rectangulo extends Figura {

	private Double base;
	private Double altura;

	public Rectangulo(String _color, Double _base, Double _altura) {
		super(_color);
		base = _base;
		altura = _altura;

	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double CalcularArea() {
		return base * altura;
	}

}

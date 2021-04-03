package polimorfismo;

public abstract class Figura {

	private String color;
	
	
	public Figura(String _color) {
		color = _color;
	}

	public abstract double CalcularArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}

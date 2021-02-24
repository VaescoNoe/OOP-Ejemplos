package herencia;

import javax.swing.JFrame;

public class Herencia3 {
	public static void main(String[] args) {
		new Ventanita();
	}
}


class Ventanita extends JFrame{
	
	public Ventanita() {
		super("Ventanita");
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
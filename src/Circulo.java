public class Circulo {
	private int raio;
	
	double calcularArea() {
		return raio*raio*Math.PI;
	}
	
	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

	double calcularPerimetro() {
		return 2*raio*Math.PI;
	}
}
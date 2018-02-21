public class Retangulo {
	private int altura;
	private int base;


	public Retangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int Area() {
		return base * altura;
	}

	public int Perimetro() {
		return 2 * base * altura;
	}

	public void Quadrado() {
		if (base==altura) {
			System.out.println("sim � um quadrado");
		} else {
			System.out.println("nao � um quadrado");
		}
	}
}
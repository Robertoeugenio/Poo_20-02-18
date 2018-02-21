public class Teste {
	public static void main(String[] args) {
		Calculo calculos = new Calculo();

		calculos.credito(15);
		calculos.debito(12);
		System.out.println("Saldo: " + calculos.getSaldo());

	}
}
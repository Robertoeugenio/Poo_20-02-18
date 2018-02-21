public class ProgramaUsaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		f1.nome = "João";
		f1.horasTrabalhadas = 20.0;
		f1.valorDaHora = 3.5;
		
		f2.nome = "Mateus";
		f2.horasTrabalhadas = 40.0;
		f2.valorDaHora = 5.5;
		
		f3.nome = "Lucas";
		f3.horasTrabalhadas = 40.0;
		f3.valorDaHora = 13.5;
		
		System.out.println(f1.nome + " - " + f1.calcularSalario());
		System.out.println(f2.nome + " - " + f2.calcularSalario());
		System.out.println(f3.nome + " - " + f3.calcularSalario());
	}
}

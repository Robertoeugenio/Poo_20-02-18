public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;

	public Aluno(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public double mediaAritimetica() {
		return 2/(nota1 + nota2) ;
	}

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 10, 9);
		Aluno a2 = new Aluno("Beto", 9, 10);
	}
}
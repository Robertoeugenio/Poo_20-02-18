public class ContaCorrente {
	private String nome;
	private String senha;
	private double saldo;

	public ContaCorrente(String nome) {
		super();
		this.nome = nome;
	}

	public void cadastroSenha(String senha) {
		this.senha = senha;
		System.out.println("você acertou !");
	}

	public void alterarSenha(String senhaAntiga, String novaSenha) {
		if (senha.equals(senhaAntiga)) {
			this.senha = novaSenha;
			System.out.println("você alterou a senha!");
		} else {
			System.out.println("cuidado! senha antiga incorreta!");
		}
	}

	public void creditar(int valor, String senha) {
		if (this.senha.equals(senha)) {
			saldo += valor;
			System.out.println("depósito feito com exito Saldo Atual: " + saldo);
		} else {
			System.out.println("cuidado senha errada!");
		}
	}

	public void debitar(int valor, String senha) {
		if (this.senha.equals(senha)) {
			saldo -= valor;
			System.out.println("deposito feito com exito seu Saldo Atual: " + saldo);
		} else {
			System.out.println("cuidado senha errada !");
		}
	}

	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente("Joaquim");
		c.cadastroSenha("TESTE");
		c.alterarSenha("teste", "teste erro");
		c.alterarSenha("TESTE", "teste sucesso");
		c.creditar(15, "teste");
		c.creditar(15, "teste sucesso");
		c.debitar(10, "teste");
		c.debitar(10, "teste sucesso");
	}
}
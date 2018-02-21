import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		System.out.println(nome.toUpperCase());
		String nome2 = sc.next();
		if(nome.equals(nome2))
			System.out.println("igual");
		else
			System.out.println("diferente");
	}
}
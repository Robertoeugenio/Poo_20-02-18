import java.util.Locale;
import java.util.Scanner;


public class Circuloex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		Circulo circ1 = new Circulo(32);
		Circulo circ2 = new Circulo(44);
		Circulo circ3 = new Circulo(17);
		
			
					
		System.out.printf("O circulo 1 possui\n area = %.2f\n Perimetro : %.2f\n"  ,circ1.calcularArea() , circ1.calcularPerimetro());
		System.out.printf("\nO circulo 2 possui\n area = %.2f\n Perimetro : %.2f\n" , circ2.calcularArea() ,circ2.calcularPerimetro());
		System.out.printf("\nO circulo 3 possui\n area = %.2f\n Perimetro : %.2f\n" , circ3.calcularArea() ,circ3.calcularPerimetro());

	}

}


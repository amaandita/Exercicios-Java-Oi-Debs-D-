import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double saldo;
		
		System.out.println("Digite o seu saldo: ");
		saldo = sc.nextDouble();
		
		double ajuste = saldo * 1.5;
		
		System.out.printf("Seu saldo ajustado é: %.2f%n", ajuste); 

		sc.close();
	}

}
package atividade java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sue nome: ");
		String nome = sc.next();
		
		System.out.print("Digite seu salário fixo: ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite o total de vendas no mês em reais: ");
		double vendas = sc.nextDouble();
		
		double comissao = vendas * 0.15;
		
		double salarioFinal = salario + comissao;
		
		System.out.println("\nNome do vendedor: " + nome);
		System.out.printf("Salário fixo:  %.2f" , salario);
		System.out.printf("\nSalário final: %.2f" , salarioFinal);
		
		sc.close();

	}

}
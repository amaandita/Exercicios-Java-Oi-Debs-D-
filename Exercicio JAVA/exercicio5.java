package atividade java;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
		
		if(idade>=18 && idade<=65) {
			System.out.println("O voto obrigatório");
		}
		else if(idade>=16 || idade>65) {
			System.out.println("O voto é facultativo");
		}
		else {
			System.out.println("Não eleitor");
		}
		
		
		sc.close();
	}

}
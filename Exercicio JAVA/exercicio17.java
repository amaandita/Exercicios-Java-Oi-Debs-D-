package atividade java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int qtdMaior = 0;
		int qtdMenor = 0;
		
		for(int i=1; i<=20; i++) {
			System.out.print("Informe o " + i + "º número: ");
			int idade = sc.nextInt();
			
			if(idade >= 18) {
				qtdMaior += 1;
			}else {
				qtdMenor += 1;
			}
		}
		
		System.out.println("\nQuantas pessoas são maior de idade: " + qtdMaior);
		System.out.println("Quantas pessoas são menores de idade: " + qtdMenor);
		
		sc.close();

	}

}
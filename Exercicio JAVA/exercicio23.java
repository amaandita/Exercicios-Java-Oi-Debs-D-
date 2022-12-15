package atividade java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qtdNum = 0;
		int qtdNum2 = 0;
		int qtdNum3 = 0;
		int qtdNumNegativos = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.print("Informe o " + i + "º número: ");
			int num = sc.nextInt();

			if (num >= 0 && num <= 100) {
				qtdNum += 1;
			}else if(num >= 101 && num <= 200) {
				qtdNum2 += 1;
			}else if(num > 200) {
				qtdNum3 += 1;
			}else {
				qtdNumNegativos += 1;
			}
		}

		System.out.println("\nNúmeros digitados entre 0 e 100: " + qtdNum);
		System.out.println("Números digitados entre 101 e 200: " + qtdNum2);
		System.out.println("Números digitados maiores que 200: " + qtdNum3);
		System.out.println("Números digitados negativos: " + qtdNumNegativos);

		sc.close();
	}

}
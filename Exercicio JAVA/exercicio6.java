package atividade java;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		System.out.println("Informe um número: ");
		num = sc.nextInt();
		
		int numAdd = num + 1;
		int numSub = num - 1 ;
		
		System.out.println("Número: " + num);
		System.out.println("Número anterior: " + numSub);
		System.out.println("Número sucessor: " + numAdd);
		sc.close();
	}

}
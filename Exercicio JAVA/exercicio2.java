package atividade java;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int num;

	        System.out.println("Insira um número: ");
	        num = sc.nextInt();

	        if(num %10 ==0){
	            System.out.println(num + " dividivel por 10");

	        }
	        else if (num%5==0){
	            System.out.println(num + " dividivel por 5");

	        }
	        else if (num%2==0){
	            System.out.println(num + " dividivel por 2");

	        }
	        else {
	            System.out.println(num + " não é dividivel por 10, 5 ou 2");
	        }
	        
	        sc.close();
	}

}
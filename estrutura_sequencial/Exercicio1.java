package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a 
		//soma desses n�meros com umamensagem explicativa, conforme exemplos.
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;

		
		System.out.println("O resultado da soma � igual a: " + soma);
		
		
		

	}

}

package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
//		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//		casas decimais conforme exemplos
		
		Scanner sc = new Scanner(System.in); 
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		
		double area = pi * raio * raio;
		
		System.out.printf("A area é igual a: %.4f%n", area);
		

	}

}

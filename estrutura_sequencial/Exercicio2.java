package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
//		Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro
//		casas decimais conforme exemplos
		
		Scanner sc = new Scanner(System.in); 
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		
		double area = pi * raio * raio;
		
		System.out.printf("A area � igual a: %.4f%n", area);
		

	}

}

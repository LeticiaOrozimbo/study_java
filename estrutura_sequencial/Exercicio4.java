package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//		decimais.
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		double workedHours = sc.nextDouble();
		double hourValue = sc.nextDouble();
		
		double salary = workedHours*hourValue;
		
		System.out.println("Number: " + number);
		System.out.printf("Salary:$ %.2f%n", salary);	
		
		

	}

}

package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
//		Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//		hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
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

package vetor;

import java.text.ParseException;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Pessoa[] vect = new Pessoa[10];

		System.out.print("Quantas pessoas serão digitadas");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Pessoa" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("nome: ");
			int idade = sc.nextInt();
			System.out.print("idade: ");
			double altura = sc.nextDouble();
			System.out.print("idade: ");
			vect[i] = new Pessoa(name, idade, altura);

		}
		int alturaTotal = 0;
		int nmenores = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				nmenores++;
			}
			int altura = 0;
			alturaTotal = alturaTotal + altura;
		}
		sc.close();
	}
}

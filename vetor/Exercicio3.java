package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma = 0.0;
		double media;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}

		media = soma / n;

		System.out.print("VALORES = ");

		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}

		System.out.println();
		System.out.println("Soma:" + soma);
		System.out.println("Media: " + media);
		
		sc.close();
	}
}

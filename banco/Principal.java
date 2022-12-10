package banco;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Conta conta;

		System.out.println("Entre com o numero da conta: ");
		String numeroDaConta = sc.nextLine();
		System.out.println("Digite seu nome");
		String nomeDoTitular = sc.nextLine();
		System.out.println("Deseja colocar um valor inicial? Digite s para sim ou n para não");
		char value = sc.next().charAt(0);
		if (value == 's') {
			System.out.println("Digite o valor do depósito inicial");
			Double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroDaConta, nomeDoTitular, depositoInicial);
			}
		else {
			conta = new Conta(numeroDaConta,nomeDoTitular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite um valor para depósito: ");
		Double valorDoDeposito = sc.nextDouble();
		conta.deposito(valorDoDeposito);
		System.out.println("Valor do saldo atualizado: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite um valor para saque: ");
		Double valorDoSaque = sc.nextDouble();
		conta.saque(valorDoSaque);
		System.out.println("Valor do saldo atualizado: ");
		System.out.println(conta);
		
		
		sc.close();
	}
	
}

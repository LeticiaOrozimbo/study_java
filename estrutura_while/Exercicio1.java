package estrutura_while;

import java.util.Scanner;

//Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x != 2002) {
			System.out.println("Senha Inv�lda");
			
			x = sc.nextInt();
			
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}

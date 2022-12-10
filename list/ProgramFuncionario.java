package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class ProgramFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		List<Funcionario> list = new ArrayList<>();
 
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Digite o id: ");
			int id = sc.nextInt();
			while(hasId(list,id)) {
				System.out.println("Este id já existe! Tente novamente");
				id = sc.nextInt();
			}
			
			System.out.println("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite o salário: ");
			double salario = sc.nextDouble();
			System.out.println();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			list.add(funcionario);
		}
		
		System.out.println("Digite o id do funcionário que terá o salário aumentado: ");
		int idSalary = sc.nextInt();
		
		Funcionario func = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if(func == null) {
			System.out.println("Este id não existe");
		}else {
			System.out.println("Enter com  a porcentagem:");
			double porcentagem = sc.nextDouble();
			func.aumentoSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		for(Funcionario f : list) {
			System.out.println(f);
		}
		
		
		sc.close();
	}
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}

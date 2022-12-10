package vetor;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String name, int idade, double altura) {
		this.nome = name;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
		
	}
	public String toString() {
		return nome + "," + idade + "," + altura;
	}
	}
	
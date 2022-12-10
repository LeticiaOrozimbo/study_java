package banco;

public class Conta {
	
	private String numeroDaConta;
	private String nomeDoTitular;
	private Double saldo;
	
	public Conta() {
		
	}
	public Conta(String numeroDaConta, String nomeDoTitular, Double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		deposito(depositoInicial);
	}
	
	public Conta(String numeroDaConta, String nomeDoTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public Double saque(Double saque) {
		return saldo -= saque + 5;
		
	}
	public Double deposito(Double deposito) {
		return saldo += deposito;
		
	}
	public String toString() {
		return "Dados da conta"
				+ numeroDaConta
				+", Titular: "
				+ nomeDoTitular
				+", Saldo: $ "
				+String.format("%.2f", saldo);
	}
	
	

}

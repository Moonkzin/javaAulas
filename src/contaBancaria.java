
public class contaBancaria {
	String nome;
	double saldo;
	int numerAccount;
	
	public String getTipo() {
		return "Conta";
	}
	
	public void deposit (int value) {
		this.saldo = saldo + value;
	}
	
	public void withdraw (int value) {
		this.saldo = (saldo - value) ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumerAccount() {
		return numerAccount;
	}

	public void setNumerAccount(int numerAccount) {
		this.numerAccount = numerAccount;
	}

	public double getSaldo() {
		System.out.println(saldo);
		return saldo;
	}
	
	
}

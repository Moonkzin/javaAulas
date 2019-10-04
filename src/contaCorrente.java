
public class contaCorrente extends contaBancaria {
	public void withdraw (int value) {
		this.saldo = (saldo + (- value) + (-0.1)) ;
	}
	
	public String getTipo() {
		return super.getTipo() + " Corrente";
	}
}

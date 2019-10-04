
public class teste {
	public static void main(String[] args) {
		contaBancaria cb1 = new contaCorrente();
		contaBancaria cb2 = new contaPoupanca();
		
		System.out.println("Deposito 1000 conta 1 (corrente)");
		cb1.deposit(1000);
		System.out.println("Deposito 1000 conta 2 (Poupanca)");
		cb2.deposit(1000);
		
		cb1.getSaldo();
		cb2.getSaldo();
		
		System.out.println("Saldo conta 1 (corrente)");
		cb1.withdraw(100);
		cb1.getSaldo();
		System.out.println("Saldo conta 2 (Poupanca)");
		cb2.withdraw(100);
		cb2.getSaldo();
		
		System.out.println("Tipo das contas");
		System.out.println(cb1.getTipo());
		System.out.println(cb2.getTipo());
	}
}

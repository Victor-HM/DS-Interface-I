
public class ContaPoupanca extends Conta {
	
	public void rendimentoPoupanca() {
		double saldo = super.getSaldo() * 1.005;
		super.setSaldo(saldo);
	}
	
}
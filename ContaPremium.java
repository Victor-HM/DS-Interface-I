
public class ContaPremium  extends Conta implements Tributacao{

	private double credito;
	
	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public double calcularimposto() {
		double Imposto = super.getSaldo() * 0.01;
		return Imposto;
	}

	public void infoConta() {
		System.out.println("Crédito: " + this.getCredito());
		System.out.println("Valor do imposto: " + this.calcularimposto());
		super.InfoConta();
	}
	
}
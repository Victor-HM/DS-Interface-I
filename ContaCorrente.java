
public class ContaCorrente extends Conta implements Tributacao{
	
	@Override
	public void sacar (double valor){
		valor = valor + 5;
		super.sacar(valor);
	}
	
	public void InfoConta(){
		super.InfoConta();
		System.out.println("Valor do imposto: " + this.calcularimposto());
	}
	
	public double calcularimposto() {
		double Imposto = super.getSaldo() * 0.02;
		return Imposto;
	}

}
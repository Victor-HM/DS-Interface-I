
public abstract class Conta {
	private int Numero;
	private int Agencia;
	private double Saldo;
	private String TitularConta;
	
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public int getAgencia() {
		return Agencia;
	}
	public void setAgencia(int agencia) {
		Agencia = agencia;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public String getTitularConta() {
		return TitularConta;
	}
	public void setTitularConta(String titularConta) {
		TitularConta = titularConta;
	}
	
	public void sacar(double valor){
		this.Saldo=Saldo-valor;
	}
	
	public void depositar (double valor){
		this.Saldo=Saldo+valor;
	}
	
	public void InfoConta (){
		System.out.println("Titular da conta: " + this.getTitularConta());
		System.out.println("Numero da agencia: " + this.getAgencia());
		System.out.println("valor do saldo: " + this.getSaldo());
		System.out.println("Numero da conta: " + this.getNumero());
		System.out.println("---------------------------------------");
		
	}
	

}
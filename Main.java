public class Main {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();

		cc.setSaldo(450);
		cc.setAgencia(234);
		cc.setNumero(27);
		cc.setTitularConta("galo cego");
		
		cc.sacar(25);
		
		cc.InfoConta();
		
		ContaPremium cp = new ContaPremium();
		
		cp.setCredito(345);
		cp.setSaldo(666);
		cp.setAgencia(668);
		cp.setNumero(668);
		cp.setTitularConta("Serjão berranteiro matador de onça");
		
		
		cp.infoConta();
	}

}
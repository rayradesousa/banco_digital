
public class Main {

	public static void main(String[] args) {
		Cliente Carlos = new Cliente();
		Carlos.setNome("Carlos Andrade da Costa");
		
		Conta cc = new ContaCorrente(Carlos );
		Conta poupanca = new ContaPoupanca(Carlos);

		cc.depositar(850);
		cc.transferir(800, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

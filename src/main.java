
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(venilton);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

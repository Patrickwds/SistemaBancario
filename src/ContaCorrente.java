
public class ContaCorrente {
	
	String nomeDoCliente;
	String numeroDaConta;
	String numeroDaAgencia;
	double saldo;
	
	public void sacar(double valor){
		System.out.println("Sacado "+ valor + " do Cliente: " + nomeDoCliente);
		saldo = saldo - valor;
	}
}
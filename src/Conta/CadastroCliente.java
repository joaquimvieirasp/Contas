package Conta;

public class CadastroCliente {
	
	String titular;
	int agencia;
	int numero;
	double saldo;
	
	public void saque (double valor) {
		this.saldo = this.saldo - valor;
	}

	public void deposita (double valor){
		this.saldo = this.saldo + valor;
		
	}
}
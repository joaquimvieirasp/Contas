package Conta;

public class TestaMetodo {

	public static void main(String[] args) {
		
		CadastroCliente contaDoPaulo = new CadastroCliente();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(150);
		
		
		System.out.println(contaDoPaulo.saldo);
	
	}

}

package Conta;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CadastroCliente conta = new CadastroCliente();
		
		conta.titular = "José da Silva";
		conta.numero = 4230;
		conta.agencia = 17209;
		conta.saldo = 15.000;
		
		
		System.out.printf("O saldo de %s é %s", conta.titular, conta.saldo);

	}

}

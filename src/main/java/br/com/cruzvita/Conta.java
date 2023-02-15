package br.com.cruzvita;

public class Conta implements InterfaceBanco {

	private int numConta;
	private int agencia;
	private float saldo;

	public Conta(int numConta, int agencia, float saldo) {

	}

	public void sacar(float valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			System.out.println(saldo);
		} else {
			System.out.println("Saldo faltando.");
		}
	}

	public void depositar(float valor) {
		saldo = saldo + valor;
		System.out.println("Novo saldo: " + saldo);

	}

	public void transferir(Conta destino, float valor) {
		this.sacar(valor);
		destino.depositar(valor);

	}

}

package br.com.cruzvita;

public class Conta implements InterfaceBanco {

	private int numConta;
	private int agencia;
	private float saldo;

	public Conta(int numConta, int agencia, float saldo) {

		this.numConta = numConta;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public void sacar(float valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Novo saldo: " + saldo);
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

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}

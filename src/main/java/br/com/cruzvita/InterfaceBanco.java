package br.com.cruzvita;

public interface InterfaceBanco {
	
	public void sacar(float valor);
	public void depositar(float valor);
	public void transferir(Conta destino, float valor);

}

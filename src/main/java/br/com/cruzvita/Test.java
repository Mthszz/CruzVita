package br.com.cruzvita;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(1, 7, 2000);
		Conta conta2 = new Conta(2, 7, 1500);
		Scanner texto = new Scanner(System.in);
		
		System.out.println("Digite quanto você quer sacar: ");
		float valor = texto.nextFloat();
		
		conta1.sacar(valor);
		
		
		
		
	}
	
    }
	
		
	



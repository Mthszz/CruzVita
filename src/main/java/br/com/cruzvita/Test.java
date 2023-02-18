package br.com.cruzvita;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente cliente1 = new Cliente();
		Conta conta1 = new Conta(1, 7, 2000F);
		Conta conta2 = new Conta(2, 7, 1500F);
		Scanner sc = new Scanner(System.in);
		float valor;

		System.out.println("Olá você esta no " + banco.bancoVita() + "vamos criar uma conta!!");
		System.out.println("\nDigite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite seu cpf: ");
		String cpf = sc.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		cliente1.criarConta(nome, idade, cpf);

		System.out.println("\n" + nome + " o que você gostaria de fazer agora?");
		int menu = 0;
		while (menu != 5) {
			System.out.println("\n\t" + banco.bancoVita());
			System.out.println("\n1- Verificar saldo");
			System.out.println("2- Sacar");
			System.out.println("3- Depositar");
			System.out.println("4- Transferir");
			System.out.println("5- Sair");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println(conta1.getSaldo());
				break;
			case 2:
				System.out.println("Digite quanto você quer sacar: ");
				valor = sc.nextFloat();
				conta1.sacar(valor);
				break;
			case 3:
				System.out.println("Digite quanto você quer depositar: ");
				valor = sc.nextFloat();
				conta1.depositar(valor);
				break;
			case 4:
				System.out.println("Digite quanto você quer transferir: ");
				valor = sc.nextFloat();
				conta1.transferir(conta2, valor);
				break;
			case 5:
				System.out.println("Volte sempre");
				break;
			default:
				System.out.println("Opção invalida.");
			}

		}

	}

}

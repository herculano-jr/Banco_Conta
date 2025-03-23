package com.HardSoft;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		System.out.println("Digite o numero do cliente");
        conta.setNumero(sc.nextInt());
		System.out.println("Digite o numero da agencia");
        conta.setAgencia(sc.next());
        System.out.println("Digite o nome do cliente");
        conta.setNomeCliente(sc.next());
        System.out.println("Digite o saldo da conta");
        conta.setSaldo(sc.nextDouble());
        conta.Mostrar();
        

	}

}

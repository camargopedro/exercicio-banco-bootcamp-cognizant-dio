package com.dio.cognizant.exercicio;

public class MainApp {

	public static void main(String[] args) {

		Cliente pedro = new Cliente();
		pedro.setNome("Pedro Camargo");
		
		Conta cc = new ContaCorrente(pedro);
		Conta cp = new ContaPoupanca(pedro);
		
		cc.imprimirExtrato();
		System.out.println("==");

		cp.imprimirExtrato();
		System.out.println("==");
		
		cc.depositar(2500);
		System.out.println("==");
		
		cc.sacar(300);
		System.out.println("==");
		
		cc.sacar(8000);
		System.out.println("==");

		cc.verSaldo();
		System.out.println("==");

		cc.imprimirExtrato();
		System.out.println("==");
		cc.transferir(1000, cp);
		System.out.println("==");

		cc.imprimirExtrato();
		System.out.println("==");

		cp.imprimirExtrato();
		System.out.println("==");
		
		
		
	}

}

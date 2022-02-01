package com.dio.cognizant.exercicio;

public class Conta {

	private static int SEQUENCIAL = 1;
	private static final int AGENCIA_PADRAO = 1;

	protected int agencia;
	protected int numConta;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numConta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		if (valor < saldo) {
			saldo -= valor;
			System.out.println("Retirada de: " + valor + " da conta " + this.numConta + " realizada com sucesso");
		} else {
			System.out.println("Operação nao realizada - Saldo Insuficiente");
		}
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Deposito de: " + valor + " na conta " + this.numConta + " realizado com sucesso");
	}

	@Override
	public String toString() {
		return "Conta: " + getAgencia() + ", Numero: " + getNumConta();
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Resumo da operacao: ");
		System.out.println("Transferencia de: " + valor + " para " + contaDestino + " realizada com sucesso");
	}

	void imprimirExtrato() {
	}

	protected void extratoComum() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));

	}
	
	public void verSaldo() {
		System.out.println("O Saldo da conta " + this.numConta + " é de: R$" + this.saldo);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

}

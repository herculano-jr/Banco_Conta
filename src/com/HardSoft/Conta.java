package com.HardSoft;

public class Conta {
	
	private int numero;
	private String agencia;
	private String nomeCliente;
	private double saldo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void Mostrar() {
		System.out.printf("Numero: %d, Agencia: %s, Conta: %s, Saldo: %.2f",this.numero,this.agencia, this.nomeCliente, this.saldo);
	}
	
	
	

}

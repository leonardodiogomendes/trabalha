package br.com.contacorrente;

import javax.swing.JOptionPane;

public class Banco {
	
	private int cadastro;
	private int deposito;
	private int saque;
	private int saldo;
	private String nome;
	public int getCadastro() {
		return cadastro;
	}
	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	public int getDeposito() {
		return deposito;
	}
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	public int getSaque() {
		return saque;
	}
	public void setSaque(int saque) {
		this.saque = saque;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void entraCadastro() {
		nome = JOptionPane.showInputDialog("Digite seu Nome: ", "Exemplo: Pablo Trindade");
		cadastro = (Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da Conta: ",
				"Exemplo: 321654")));
		JOptionPane.showMessageDialog(null, "\nObrigado pela preferencia Sr.(a)" + nome
				+"\nCadastro efetuado com sucesso.");
	}
	
	public void entraDeposito() {
		
	}
	
	//metodo entraSaque
	//metodo entrasaldo

}

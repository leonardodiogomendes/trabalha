package br.com.contacorrente;

import javax.swing.JOptionPane;

public class Banco {

	private int cadastro;
	private float deposito;
	private float saque;
	private float saldo;
	private String nome;

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public float getDeposito() {
		return deposito;
	}

	public void setDeposito(float deposito) {
		this.deposito = deposito;
	}

	public float getSaque() {
		return saque;
	}

	public void setSaque(float saque) {
		this.saque = saque;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void entraCadastro() {
		nome = JOptionPane.showInputDialog(" Digite seu Nome: ", "Exemplo: Pablo Trindade");
		cadastro = (Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da Conta: ", "Exemplo: 321654")));
		JOptionPane.showMessageDialog(null,
				" \nObrigado pela preferencia Sr(a) " + nome + " \nCadastro efetuado com sucesso.");
	}

	public void entraDeposito() {
		deposito = (Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado: ")));
		JOptionPane.showMessageDialog(null,
				"Ola sr(a) " + nome + " seu deposito no valor de R$: " + deposito + " foi realizado com sucesso.");
		saldo = deposito + saldo;
	}

	public void entraSaque() {
		saque = (Float.parseFloat(JOptionPane.showInputDialog("Informe o valor que desejado para o saque: ")));
		if (saque > saldo) {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente para esse saque.");
		} else {
			JOptionPane.showMessageDialog(null, "Saque no valor de R$: " + saldo + " realizado com succeso.");
			saldo = saldo - saque;
		}
	}

	public void entraSaldo() {
		JOptionPane.showMessageDialog(null, "Seu saldo � de R$: " + saldo);

	}
}

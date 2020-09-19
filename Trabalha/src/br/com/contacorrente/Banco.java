package br.com.contacorrente;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Banco {

	private float cadastro;
	private float deposito;
	private float saque;
	private float saldo;
	private String nome;

	public float getCadastro() {
		return cadastro;
	}

	public void setCadastro(float cadastro) {
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

	DecimalFormat formatado = new DecimalFormat("#,##0.00");

	public void entraCadastro() {

		nome = JOptionPane.showInputDialog(" Digite seu Nome: ");

		if (nome.equals("")) {
			JOptionPane.showMessageDialog(null, " Por favor cadastre o seu nome ");
		} else {
			cadastro = (Integer.parseInt(JOptionPane.showInputDialog("Digite o número da Conta: ")));
			JOptionPane.showMessageDialog(null,
					" \nObrigado pela preferencia Sr(a) " + nome + " \nCadastro efetuado com sucesso.");
		}
	}

	public void entraDeposito() {
		deposito = (Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado: ")));
		JOptionPane.showMessageDialog(null, "Ola sr(a) " + nome + " seu deposito no valor de R$: "
				+ formatado.format(deposito) + " foi realizado com sucesso.");
		saldo = deposito + saldo;
	}

	public void entraSaque() {
		saque = (Float.parseFloat(JOptionPane.showInputDialog("Informe o valor que desejado para o saque: ")));
		if (saque > saldo) {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente para esse saque.");
		} else {
			JOptionPane.showMessageDialog(null, "Saque no valor de R$: " + formatado.format(saldo) + " realizado com succeso.");
			saldo = saldo - saque;
		}
	}

	public void entraSaldo() {
		JOptionPane.showMessageDialog(null, "Seu saldo é de R$: " + formatado.format(saldo));

	}
}

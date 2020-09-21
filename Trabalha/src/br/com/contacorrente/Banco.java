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

	DecimalFormat resultadoValor = new DecimalFormat("#,##0.00");

	public void entraCadastro() {
		nome = JOptionPane.showInputDialog("Digite seu Nome: ");
		cadastro = (Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da Conta: ")));
		JOptionPane.showMessageDialog(null,
				"\nObrigado pela preferencia Sr(a)" + nome + "\nCadastro efetuado com sucesso.");
	}

	// metodo entraDeposito
	public void entraDeposito() {

		deposito = (Float.parseFloat((JOptionPane.showInputDialog("Digite o valor a ser depositado: "))));
		JOptionPane.showMessageDialog(null, "O depoisto de valor R$: " + resultadoValor.format(deposito)
				+ " foi depositado na conta do sr.(a) " + nome);

		saldo = saldo + deposito;
	}

	// metodo entraSaque
	public void entraSaque() {
		saque = (Float.parseFloat(JOptionPane.showInputDialog(" Informe o valor a ser sacado ")));
		if (saque > saldo) {
			JOptionPane.showMessageDialog(null, "O saldo � insuficiente");

		} else {
			JOptionPane.showMessageDialog(null,	"O saque no valor de " + resultadoValor.format(saque) + " foi realizado com sucesso");
			saldo = saldo - saque;
		}

	}

	// metodo entraSaldo
	public void entraSaldo() {

		JOptionPane.showMessageDialog(null, "O valor total em sua conta �: " + resultadoValor.format(saldo));

	}
	
}	
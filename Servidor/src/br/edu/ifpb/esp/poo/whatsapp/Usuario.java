package br.edu.ifpb.esp.poo.whatsapp;

public class Usuario {

	private String nome;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean validaSenha(String senha2) {
		return senha2.equals(senha);
	}

}

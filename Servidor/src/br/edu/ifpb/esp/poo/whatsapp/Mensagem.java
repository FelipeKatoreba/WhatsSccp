package br.edu.ifpb.esp.poo.whatsapp;

public class Mensagem {

	String destinario;
	String senha;
	String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDestinario() {
		return destinario;
	}

	public void setDestinario(String destinario) {
		this.destinario = destinario;
	}

}

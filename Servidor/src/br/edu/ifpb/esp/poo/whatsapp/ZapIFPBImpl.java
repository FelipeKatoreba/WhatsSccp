package br.edu.ifpb.esp.poo.whatsapp;

import java.util.ArrayList;
import java.util.Set;

public class ZapIFPBImpl implements ZapIFPBFacade {

	private String nome;
	private String mensagem;
	private String destinario;
	private Set<Usuario> contatos;
	private Usuario autenticado;

	@Override
	public boolean cadastrarUsuario(String nomeUsuario, String senha) {
		Usuario u = new Usuario();
		u.setSenha(senha);
		u.setNome(nomeUsuario);
		return true;
	}

	@Override
	public boolean autenticar(String nomeUsuario, String senha) {

		
		Mensagem m1 = new Mensagem();
		m1.setDestinario(destinario);
		m1.setSenha(senha);
		for (Usuario usuario : contatos) {
			if (usuario.getNome().equals(nomeUsuario) && usuario.validaSenha(senha)) {
				autenticado = usuario;

				return false;
			}
		}
	}

	@Override
	public boolean enviarMensagem(String destinatario, String mensagem) {

		return false;
	}

	@Override
	public ArrayList<String> contatosComMensagensNaoLidas() {

		return null;
	}

	@Override
	public ArrayList<String> mensagensNaoLidas(String contato) {

		return null;
	}

	@Override
	public ArrayList<String> mensagens(String contato) {

		return null;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}

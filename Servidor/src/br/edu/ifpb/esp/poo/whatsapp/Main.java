package br.edu.ifpb.esp.poo.whatsapp;

public class Main {
	public static void main(String[] args) {

		ZapIFPBFacade zap = new ZapIFPBImpl();
		zap.cadastrarUsuario("Hugo", "123");
		zap.cadastrarUsuario("Dinaldo", "123");
		zap.cadastrarUsuario("Bruno", "123");
		if(zap.autenticar("Hugo", "1234")) {
			System.err.println("Aceitou senha inválida.");
			System.exit(1);
		}
		if(zap.autenticar("Hugoo", "123")) {
			System.err.println("Aceitou login inválido.");
			System.exit(1);
		}
		if(zap.autenticar("Hugo", "123")) {
			System.out.println("Usuário autenticado.");
		} else {
			System.err.println("Falha inesperada na autenticação");
			System.exit(1);
		}
		if(zap.enviarMensagem("naoexiste", "Oi")) {
			System.err.println("Mensagem enviada para usuário inexistente");
			System.exit(1);
		}
		if(!zap.enviarMensagem("Hugostosão", "Oi")) {
			System.err.println("Falha inesperada no envio de mensagem");
			System.exit(1);
		}
		
	}
	
	}


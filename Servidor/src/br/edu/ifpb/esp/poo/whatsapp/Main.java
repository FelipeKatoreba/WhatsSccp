package br.edu.ifpb.esp.poo.whatsapp;

public class Main {
	public static void main(String[] args) {

		ZapIFPBFacade zap = new ZapIFPBImpl();
		zap.cadastrarUsuario("Hugo", "123");
		zap.cadastrarUsuario("Dinaldo", "123");
		zap.cadastrarUsuario("Bruno", "123");
		if(zap.autenticar("Hugo", "1234")) {
			System.err.println("Aceitou senha inv�lida.");
			System.exit(1);
		}
		if(zap.autenticar("Hugoo", "123")) {
			System.err.println("Aceitou login inv�lido.");
			System.exit(1);
		}
		if(zap.autenticar("Hugo", "123")) {
			System.out.println("Usu�rio autenticado.");
		} else {
			System.err.println("Falha inesperada na autentica��o");
			System.exit(1);
		}
		if(zap.enviarMensagem("naoexiste", "Oi")) {
			System.err.println("Mensagem enviada para usu�rio inexistente");
			System.exit(1);
		}
		if(!zap.enviarMensagem("Hugostos�o", "Oi")) {
			System.err.println("Falha inesperada no envio de mensagem");
			System.exit(1);
		}
		
	}
	
	}


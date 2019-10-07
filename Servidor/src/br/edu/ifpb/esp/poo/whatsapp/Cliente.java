package br.edu.ifpb.esp.poo.whatsapp;

import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			WhatsServerInterface stub = (WhatsServerInterface) Naming.lookup("//192.168.3.156/whatsapp");
			
//		System.out.println("Nome do usuario");
//		String contato = sc.nextLine();
//		Boolean response = stub.cadastrarUsuario(contato);
//			System.out.println("response: " + response);
			String[] contatos = stub.contatos();
			for (String string : contatos) {
				System.out.println(string);
			}
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}


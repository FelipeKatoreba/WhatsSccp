import java.rmi.RemoteException;

import br.edu.ifpb.esp.poo.whatsapp.WhatsServerInterface;

public class WhatsAcademico<E> implements WhatsServerInterface {

	public boolean cadastrarUsuario(String nomeUsuario) {
		E e = (E) new Usuario();
		Usuario u = new Usuario();
		u.setNome(nomeUsuario);
		return false
				;
	}

//	
	
	
	
	
	
	
	
	
	
	
	
	

	public String status(long idMsg) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] contatos() {
		// TODO Auto-generated method stub
		return null;
	}

	public long enviar(String msg, String remetente, String destinatario) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Mensagem Mensagems(String msg, String remetente, String destinario) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public long Mensagem(String msg, String remetente, String destinario) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}

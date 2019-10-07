import java.util.Date;

public class Mensagem {

	String remetente;
	String destinario;
	Date data;
	int numero;

	private String getDestinario() {
		return destinario;
	}

	private void setDestinario(String destinario) {
		this.destinario = destinario;
	}

	private String getRemetente() {
		return remetente;
	}

	void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	private Date getData() {
		return data;
	}

	private void setData(Date data) {
		this.data = data;
	}

	private int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}
}

import java.util.Date;

public class Usuario {
	private int idade;
	private Date nascimento;
	private String nome;

	private String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private Date getNascimento() {
		return nascimento;
	}

	private void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

}

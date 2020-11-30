package generico;

import java.util.List;

public class Pessoa {

	private String nome;
	private Integer idade;
	private Endereco endereco;
	private List<Carro> carros;

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		if (idade == null || idade < 0 || idade > 120) {
			throw new IllegalArgumentException("Idade deve estar entre 0 e 120 ");
		}
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}

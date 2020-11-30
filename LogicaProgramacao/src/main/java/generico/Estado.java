package generico;

import java.util.List;

public class Estado {

	private String nome;
	private String sigla;
	private List<Municipio> municipios;

	// ...
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}

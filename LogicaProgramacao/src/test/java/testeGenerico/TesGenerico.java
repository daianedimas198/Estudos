package testeGenerico;

import generico.Endereco;
import generico.Estado;
import generico.Pessoa;

public class TesGenerico {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setIdade(300);
		
		Endereco endereco = new Endereco();
		
		Estado estado = new Estado();
		estado.setNome("Rio de Janeiro");
		estado.setSigla("RJ");
		
		endereco.setEstado(estado);
		pessoa1.setEndereco(endereco);
		
		
	}

}

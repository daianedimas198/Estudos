package hello;

public class HelloWorld {
	//quando n�o coloca o tipo acaba sendo default como privado
	 String texto ;
	
	//construtor pode ser utilizado para atribuir valores aos objetos comuns
	public HelloWorld (String _texto) {
		texto = _texto;
	}
	
	
	public String getHelloWorld() {
		return texto;

	}
	
	private String getHelloWorld2() {
		return texto;

	}
	
	//static garante que sempre vir� a mesma coisa
	public static String getTexto() {
		return "Teste";
	}
	
}

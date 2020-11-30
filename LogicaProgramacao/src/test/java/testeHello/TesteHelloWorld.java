package testeHello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hello.HelloWorld;

public class TesteHelloWorld {

	@Test
	public void realizaTesteHelloWorld() throws Exception {
		HelloWorld helloWorld = new HelloWorld("Hello World");
		String texto = "Texto";

		texto = helloWorld.getHelloWorld();

		if (texto.equals("HelloWorld")) {
			System.out.println("Teste com sucesso!!!");
		} else {
			System.out.println("Esperado: 'HelloWorld', Encontrado: '" + texto + "'");
			throw new Exception("Esperado: 'HelloWorld', Encontrado: '" + texto + "'");
		}

	}

	@Test
	public void realizaTesteHelloWorld2() {
		HelloWorld helloWorld = new HelloWorld("Hello World");
		String texto = "teste";
		texto = helloWorld.getHelloWorld();
		// usar sempre essa forma o assertEquals garante que dessa forma não irá quebrar
		// como if.
		assertEquals("Hello World", texto);

	}

	@Test
	public void testeComparacao() {
		String texto = HelloWorld.getTexto();
		assertEquals("TexteAA", texto);

	}

}

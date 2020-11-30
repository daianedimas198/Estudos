package testDesafios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import desafios.Desafios;

public class TestDesafios {

	Desafios desafios = new Desafios();

	@Test
	public void testarAreaTriangulo() {
		double area = desafios.calcularAreaTriangulo(33, 55);
		assertEquals(907.5, area, 1);
	}

	@Test
	public void testarMaiorValor() {
		int maiorValor = desafios.calcularMaiorValor(100, 6, 8);
		System.out.println("O maior valor retornado foi: " + maiorValor);
		assertEquals(100, maiorValor);
	}
	
	@Test
	public void testarSoma1a100() {
		int somaValor = desafios.calcularSoma1a100();
		System.out.println("A soma de 1 a 100 é: " + somaValor);
		assertEquals(5050, somaValor);
	}
}

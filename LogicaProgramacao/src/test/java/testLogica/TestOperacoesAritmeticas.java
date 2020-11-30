package testLogica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logica.OperacoesAritmeticas;

public class TestOperacoesAritmeticas {
	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();;

	//1. Entrar via teclado com a base e a altura de um retangulo,
		//calcular e exibir sua area.
	@Test
	public void testAreaRetangulo() {
		//OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();
		int area = opAritmeticas.calculoAreaRetangulo(5, 10);
		
		assertEquals(50, area);
	}
	
	
	// 2. Calcular e exibir a area de um quadrado, a partir do valor de sua aresta que será digitado.
	//TDDD nosso teste antes do desenvolvimento
	@Test
	public void testAreaQuadrado() {
		//opAritmeticas = new OperacoesAritmeticas();
		int area = opAritmeticas.calculoAreaQuadrado(10);
		
		assertEquals(100, area);
	}
	
	//15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dolares. Calcular e exibir o valor correspondente em reais.
	//TDDD  feito primeiro o metodo de teste antes do dev. 
	@Test
	public void testCotacaoDolar () {
		double reais = opAritmeticas.calculoDolarReais(5.50, 10);
		assertEquals(55.00, reais, 1);
	}
	
}

package logica;

public class OperacoesAritmeticas {

	// 1. Entrar via teclado com a base e a altura de um retangulo,
	// calcular e exibir sua area. Abaixo é um exemplo de teste unitario - deve
	// passar por cada linha e cada condição,
	// teste para esse metodo, que a menor parte do nosso codigo.

	public int calculoAreaRetangulo(int base, int altura) {

		// 1 ele vale zero e 2 vale null, essa seria diferença.
		int area;
		// Integer area2;

		area = (base * altura);
		return area;
	}

	// TDDD nosso teste antes do desenvolvimento
	public int calculoAreaQuadrado(int aresta) {
		int area;
		area = aresta * aresta;
		return area;
	}

	public double calculoDolarReais(double cotacao, int qtDolar) {
		double reais = cotacao * qtDolar;
		return reais;
	}
}

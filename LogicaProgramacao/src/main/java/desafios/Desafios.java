package desafios;

public class Desafios {

	/*
	 * desafio 1 criar um metodo para calcular e retornar a area de um triangulo,
	 * esse metodo deve receber dois valores inteiros referente a base e altura do
	 * triangulo
	 */
	public double calcularAreaTriangulo(int base, int altura) {
		double area = (base * altura) / 2;
		return area;
	}

	/*
	 * desafio 2 - criar um metodo que recebera 3 valores inteiros e deverá retornar
	 * o maior deles
	 */

	public int calcularMaiorValor(int v1, int v2, int v3) {
		int maior;
		if (v1 > v2 && v1 > v3) {
			// return "O maior valor é:"+v1;
			maior = v1;
		} else if (v2 > v1 && v2 > v3) {
			// return "O maior valor é:"+v2;
			maior = v2;
		} else {
			// return "O maior valor é:"+v3;
			maior = v3;
		}
		return maior;
	}

	/* desafio 3 - Criar um método que deverá retornar a soma dos números
	 inteiros positivos do intervalo de um a cem. */

	public int calcularSoma1a100() {
		int valor = 0;
		for (int i = 1; i <= 100; i++) {
			valor = valor + i;
		}
		return valor;
	}
	
}

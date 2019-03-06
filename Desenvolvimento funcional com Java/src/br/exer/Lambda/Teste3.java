package br.exer.Lambda;

import org.junit.Test;

/**
 * 
 * @author JOSEMAR JUNIOR
 *
 */

public class Teste3 {

	public void calcular(Matematica m) {
		System.out.println(m.operar(10, 10));
	}

	@Test
	public void exer12() {
		calcular((Integer v1, Integer v2) -> {
			return v1 / v2;
		});

		calcular((Integer v1, Integer v2) -> {
			System.out.println("Corpo do lambda");
			return v1 / v2;
		});

		calcular((Integer v1, Integer v2) -> v1 * v2);

	}

}

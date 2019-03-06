package br.exer.Lambda;

import org.junit.Test;

/**
 * 
 * @author JOSEMAR JUNIOR
 *
 */

public class Teste2 {

	public void calcular(Matematica m) {
		System.out.println(m.operar(10, 10));
	}

	@Test
	public void exer2() {
		calcular((v1, v2) -> {
			return v1 + v2;
		});

		calcular((v1, v2) -> {
			System.out.println("Corpo do lambda");
			return v1 + v2;
		});

	}
}

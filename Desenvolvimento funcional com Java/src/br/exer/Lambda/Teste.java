package br.exer.Lambda;

import org.junit.Test;

/**
 * 
 * @author JOSEMAR JUNIOR
 *
 */

public class Teste {

	public void calcular(Matematica m) {
		System.out.println(m.operar(10, 10));
	}

	@Test
	public void exer() {
		calcular((v1, v2) -> v1 + v2);
		calcular((b, a) -> a - b);
		calcular((s, a) -> a * s);
		calcular((v1, v2) -> v1 / v2);
	}

}

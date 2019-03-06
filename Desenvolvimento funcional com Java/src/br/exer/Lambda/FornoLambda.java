package br.exer.Lambda;

import org.junit.Test;

import br.exer.PadraoStrategy.Forno;

public class FornoLambda {
	/**
	 * 
	 * 
	 * @author JOSEMAR JUNIOR
	 *
	 */

	@Test
	public void assarLambda() {
		Forno forno = new Forno();
		forno.assar(() -> System.out.println("Pizza lambda"));
		forno.assar(() -> {
			System.out.println("molho");
			System.out.println("queijo");
			System.out.println("azeitona lambda");
		});
	}

}

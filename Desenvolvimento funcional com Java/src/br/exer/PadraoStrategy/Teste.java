package br.exer.PadraoStrategy;

import org.junit.Test;

public class Teste {

	@Test
	public void exerc() {
		Calabresa calabresa = new Calabresa();
		Napolitana napolitana = new Napolitana();
		Forno forno = new Forno();
		forno.assar(calabresa);
		forno.assar(napolitana);
	}

}

package br.exer.Lambda;

import org.junit.Test;

/**
 * 
 * @author JOSEMAR JUNIOR
 *
 */

public class LambdaThread {
	@Test
	public void test5() {
		Runnable r1 = () -> System.out.println("Rodando em outra Thread");
		Runnable r2 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("i");
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		new Thread(() -> System.out.println("Outra thread")).start();

	}

}

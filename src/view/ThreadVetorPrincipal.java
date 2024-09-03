package view;

import controller.ThreadVetorController;

public class ThreadVetorPrincipal {

	public static void main(String[] args) {
		int[] vetor = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			vetor[i] = (int) (Math.random() * 100) +1;
		}
		
		ThreadVetorController t1 = new ThreadVetorController(vetor, 1);
		t1.start();
		ThreadVetorController t2 = new ThreadVetorController(vetor, 2);
		t2.start();

	}

}

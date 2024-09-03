package controller;

public class ThreadVetorController extends Thread {
	
	int[] vetor = new int [1000];
	int num;
	
	double tempoini;
	double tempofim;
	double tempodiff;
	
	public ThreadVetorController(int[] vetor, int num) {
		this.vetor = vetor;
		this.num = num;
	}
	
	@Override
	public void run() {
		
		chamada();
		
	}

	private void chamada() {
		
		if (num % 2 != 0) {
			tempoini = System.nanoTime();
			for (int a : vetor) {
				
			}
			tempofim = System.nanoTime();
			tempodiff = (tempofim - tempoini)/Math.pow(10, 9);
			System.out.println("Tempo com foreach: " + tempodiff);
		} else {
			tempoini = System.nanoTime();
			for (int i = 0; i < vetor.length; i++) {
				
			}
			tempofim = System.nanoTime();
			tempodiff = (tempofim - tempoini)/Math.pow(10, 9);
			System.out.println("Tempo com for(){}: " + tempodiff);
		}
		
	}
}

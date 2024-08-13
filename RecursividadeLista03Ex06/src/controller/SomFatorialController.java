package controller;

public class SomFatorialController {
	public SomFatorialController() {
		super();
	}
	
	public double somatoria(int n) {
		//Se n chegar a 1, a recursiva é encerrada.
		if(n == 1) {
			return 1;
		}else {
			//Chamada dos Passos: Retorna-se 1 dividido pelo valor do fatorial de n e soma com função recursiva enviando n-1.
			return (1/fatorial(n)) + somatoria(n-1);
		}
	}
	
	public double fatorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}else {
			return n * fatorial(n-1);
		}
	}
}

package view;

import controller.SomFatorialController;

public class Principal {
	public static void main(String[] args) {
		SomFatorialController sfc = new SomFatorialController();
		
		int n = 8;
		
		System.out.println("A serie somatoria de '" +n+ "' é: " +sfc.somatoria(n));
	}
}

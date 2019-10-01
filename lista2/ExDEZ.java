package lista2;

import javax.swing.JOptionPane;

public class ExDEZ {
	public static void main (String[] args) {
		
		String texto = JOptionPane.showInputDialog("Digite o primeiro numero");
		int base = Integer.parseInt(texto);
		
		String texto2 = JOptionPane.showInputDialog("Digite o segundo numero");
		int expoente = Integer.parseInt(texto2);
				
		float exponencial = 1;
		
		for (int i = 0; i < expoente; i++) {
			
			exponencial *= base;

		}
		
		System.out.println(exponencial);
		
	}
}

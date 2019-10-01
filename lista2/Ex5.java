package lista2;

import javax.swing.JOptionPane;

public class Ex5 {
	public static void main (String [] args) {
		
		String texto = JOptionPane.showInputDialog("Digite um numero");
		double num = Double.parseDouble(texto);
		
		double resto = num % 2;
		
		if (resto == 0 ) {
			
			JOptionPane.showMessageDialog(null, "Seu numero eh par");
			
		} else if (resto > 0) {
			
			JOptionPane.showMessageDialog(null, "Seu numero eh impar");
			
		}
		
	}
}

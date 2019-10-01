package lista2;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {

		
		String texto = JOptionPane.showInputDialog("Digite 3 numeros");
		int num1 = Integer.parseInt(texto);
		String texto2 = JOptionPane.showInputDialog("Digite 3 numeros");
		int num2 = Integer.parseInt(texto2);
		String texto3 = JOptionPane.showInputDialog("Digite 3 numeros");
		int num3 = Integer.parseInt(texto3);
		
		if (num1 > num2 && num2 > num3 ) {
			
			JOptionPane.showMessageDialog(null, +num1 +", " +num2 +", " +num3);
			
		} else if (num1 > num3 && num3 > num2 ) {
			
			JOptionPane.showMessageDialog(null, +num1 +", " +num3 +", " +num2);
			
		} else if (num2 > num3 && num3 > num1 ) {
			
			JOptionPane.showMessageDialog(null, +num2 +", " +num3 +", " +num1);
			
		}else if (num2 > num1 && num1 > num3 ) {
			
			JOptionPane.showMessageDialog(null, +num2 +", " +num1 +", " +num3);
			
		} else if (num3 > num2 && num2 > num1 ) {
			
			JOptionPane.showMessageDialog(null, +num3 +", " +num2 +", " +num1);
			
		} else if (num3 > num1 && num1 > num2 ) {
			
			JOptionPane.showMessageDialog(null, +num3 +", " +num1 +", " +num2);
			
		}
		
	}

}

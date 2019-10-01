package lista2;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Escolha uma opcao do programa \n1 - Soma \n2 - Subtracao \n3 - Multiplicacao \n4 - Divisao");
		int menu = Integer.parseInt(texto);
		
		String texto2 = JOptionPane.showInputDialog("Digite o seu primeiro numero");
		double num1 = Double.parseDouble(texto2);
		
		String texto3 = JOptionPane.showInputDialog("Digite o seu segundo numero");
		double num2 = Double.parseDouble(texto3);

		
		if ( menu == 1) {
			
			double soma = num1 + num2;
			JOptionPane.showMessageDialog(null, "A soma dos seus numeros foi: "+soma);
			
		} else if (menu == 2) {
			
			double subtracao = num1 - num2;
			JOptionPane.showMessageDialog(null, "A subtracao desses numeros foi: "+subtracao);
			
		} else if (menu == 3) {
			
			double multi = num1 * num2;
			JOptionPane.showMessageDialog(null, "A multiplicacao dos seus numeros foi: "+multi);
			
		} else if (menu == 4) {
			
			double divisao = num1 / num2;
			JOptionPane.showMessageDialog(null, "A divisao dos seus numeros foi: "+divisao);
			
		}

	}

}

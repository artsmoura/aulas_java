package lista2;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {

		int [] num = new int [10];
		
		for (int i = 0; i < num.length; i++) {
		
			String texto = JOptionPane.showInputDialog("Digite seus numeros");
			num [i] = Integer.parseInt(texto);
			

		}
		
		for (int i = num.length - 10; i >= 10; i--) {
			
			System.out.println(num[i]);
			
		}
		
	}

}

package lista3;

import javax.swing.JOptionPane;

public class Ex9 {

	public static void main(String[] args) {
		
		int fatorial = 1;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja fatorar"));
			
		for (int i = 1; i <= num; i ++) {
			
			fatorial *= i;
			
			System.out.println(fatorial);
		}		
		
	}

}

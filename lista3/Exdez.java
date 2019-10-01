package lista3;

import javax.swing.JOptionPane;

public class Exdez {
	public static void main (String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero"));
		
		for (int i = 1; i < num; i++) {
			
			for (int j = 2; j < i; j++) {
				
					if (num % j == 0) {
						System.out.println("O numero "+num+" nao eh primo");
					} else {
						System.out.println("O numero "+num+ " eh primo");
					}
				
			}	
		}
	}
}

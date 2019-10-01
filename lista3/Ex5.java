package lista3;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			
			String texto = JOptionPane.showInputDialog("Digite dez numeros");
			num [i] = Integer.parseInt(texto);
			
		}
		
		int contPares = 0;
		int contImpar = 0;
		
		for (int i =0; i < num.length; i++) {
			
			if (num[i]%2 == 0) {
				
				contPares ++;
				
			} else {
				
				contImpar ++;
			}
			
		}
		
		System.out.println("quantidade de numeros Pares: " +contPares);
		System.out.println("quantidade de numeros Impares: " +contImpar);


	}

}

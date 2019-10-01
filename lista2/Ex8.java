package lista2;

import javax.swing.JOptionPane;

public class Ex8 {

	public static void main(String[] args) {
		
		int [] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			
			String texto = JOptionPane.showInputDialog("Digite seus numeros");
			num [i] = Integer.parseInt(texto);
			
		}
		
		int soma = 0;
		
		for (int i =0; i < num.length; i++) {
			
			soma += num[i];
			
		}
		
		int media = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			media += num[i];
			
		}
		
		media /= num.length;
		
		JOptionPane.showMessageDialog(null, "A soma dos numeros foi: " +soma +"\n E a media foi: "+media);
		
	}

}

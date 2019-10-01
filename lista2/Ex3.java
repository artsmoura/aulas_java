package lista2;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
				
		Float [] dolar = new Float[7];
		
		for (int i = 0; i < dolar.length; i++) {
			
			String texto = JOptionPane.showInputDialog("Digite a cotacao do dolar");
			dolar [i] = Float.parseFloat(texto);
			
		}
		
		float media = 0;
		
		for (int i =0; i < dolar.length; i++) {
			
			media += dolar[i];
			
		}
		
		media /= dolar.length;
		
		JOptionPane.showMessageDialog(null, "A media da cotacao do dolar nas ultimas sete semanas foi de " +media);
		

	}

}

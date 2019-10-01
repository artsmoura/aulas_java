package lista2;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		//Scanner x = new Scanner(System.in);
		
		//int num = 0;
		
		//System.out.println("digite seu numero, caso queria sair digite 0");				
		int soma = 0;
		
		while (true) {
			String texto = JOptionPane.showInputDialog("Digite o seus numero, caso queira sair digite 0");
			int num = Integer.parseInt(texto);
		
			if (num == 0) {
				break;
				
			}else {
				soma += num;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos numeros digitados foi: "+soma);
		
	}

}

package lista3;

import javax.swing.JOptionPane;

public class Ex6 {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("Digite a nota da lista de exercicios");
		double nota1 = Double.parseDouble(texto);
		
		String texto2 = JOptionPane.showInputDialog("Digite a nota da apresentacao do seminario");
		double nota2 = Double.parseDouble(texto2);
		
		String texto3 = JOptionPane.showInputDialog("Digite a nota da prova final");
		double nota3 = Double.parseDouble(texto3);
		
		double mediapond = (nota1 * 2 + nota2 * 3 + nota3 * 5)/ 10;
		
		if (mediapond >= 6 ) {
			JOptionPane.showMessageDialog(null, "Nota do aluno: "+mediapond+ " || APROVADO!");
		} else {
			JOptionPane.showMessageDialog(null, "Nota do aluno: "+mediapond+ " || Em construcao!");
		}
	}

}

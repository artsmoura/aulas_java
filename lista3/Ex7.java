package lista3;

import javax.swing.JOptionPane;

public class Ex7 {

	public static void main(String[] args) {
		
		int Po = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da popula��o inicial"));	
		double t = Double.parseDouble(JOptionPane.showInputDialog("Digite o ovalor da taxa de crescimento populacional"));
		int Px = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final da popula��o"));
		
		double x = (Math.log(Px/Po))/(Math.log(1 + t));
		
		JOptionPane.showMessageDialog(null, "Ele levar� " +x +" tempo para chegar a popula��o " +Px);

	}

}

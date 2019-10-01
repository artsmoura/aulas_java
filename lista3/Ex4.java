package lista3;

import javax.swing.JOptionPane;

public class Ex4 {

	public static void main(String[] args) {
		
		int tempo = 0;
		
		String texto = JOptionPane.showInputDialog("digite seu tempo");
		tempo = Integer.parseInt(texto);
		
		int horas = tempo/3600;
		
		int minutos = (tempo%3600)/60;
		
		int segundos = tempo%60;
		
		System.out.println( +horas+ " hora(s) " +minutos+" minuto(s) " + segundos+ " segundo(s)");
	}

}

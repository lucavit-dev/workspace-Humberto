package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		short  diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		float taxa=0;
		if (diarias>15) {
			taxa = (float) 5.5;
		}else if (diarias<15) {
			taxa = 8;
		}else {
			taxa = 6;
		}
		float valor = 80 + taxa;
		System.out.println("Total: " + (valor*diarias));
		
		// Segunda forma para o mesmo enunciado
		short  dias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		if (dias>15) {
			System.out.println("Total: " + ((80+5.5)*dias));
		}else if (dias<15) {
			System.out.println("Total: " + ((80+8)*dias));
		}else {
			System.out.println("Total: " + ((80+6)*dias));
		}
		
	}

}

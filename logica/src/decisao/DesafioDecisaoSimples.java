package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		if (idade<16) {
			System.out.println("Não pode votar");
		}
		
		if (idade>=18 && idade<=70) {
			System.out.println("É obrigado a votar");
		}
		
		if (idade==16 || idade==17 || idade>70) {
			System.out.println("Voto facultativo");
		}		

	}

}

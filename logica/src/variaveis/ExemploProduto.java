package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Produto");
		int qtde=Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
		double total = valor*qtde;
		System.out.println("Total: " + total + " - Produto: " + produto);
		System.out.println("Com desconto: " + (total*0.9));

	}

}

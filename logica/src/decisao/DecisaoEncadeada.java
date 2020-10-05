package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite as faltas: "));
		if (faltas>20) {
			System.out.println("Reprovado por falta");
		}else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));

			float media = (nota1 + nota2) / 2;
			System.out.println("Aluno: " + nome + " sua média foi: " + media);
			if (media>=6) {
				System.out.println("Parabens " + nome + " você está aprovado!!!");
			}else if (media<4) {
				System.out.println("Infelizmente " + nome + " você foi reprovado");
			}else  {
				System.out.println(nome + " você ainda tem chance no exame!");
			} // fechando o último else
		} // fechando o primeiro else
	} // fecha o método main()
} // fecha a classe









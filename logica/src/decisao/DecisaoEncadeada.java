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
			System.out.println("Aluno: " + nome + " sua m�dia foi: " + media);
			if (media>=6) {
				System.out.println("Parabens " + nome + " voc� est� aprovado!!!");
			}else if (media<4) {
				System.out.println("Infelizmente " + nome + " voc� foi reprovado");
			}else  {
				System.out.println(nome + " voc� ainda tem chance no exame!");
			} // fechando o �ltimo else
		} // fechando o primeiro else
	} // fecha o m�todo main()
} // fecha a classe









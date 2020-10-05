package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		// vão pedir o total de faltas
		// se o total de faltas for maior que 20, o aluno está reprovado
		// independentemente da media
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite as faltas: "));
		float media = (nota1 + nota2) / 2;
		System.out.println("Aluno: " + nome + " sua média foi: " + media);
		if (media>=6 && faltas<=20) {
			System.out.println("Parabens " + nome + " você está aprovado!!!");
		}else if (media<4 || faltas>20) {
			System.out.println("Infelizmente " + nome + " você foi reprovado");
		}else if (faltas<=20) {
			System.out.println(nome + " você ainda tem chance no exame!");
		}
		
		
	}

}









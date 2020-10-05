package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	/* 
	 * Identificadores = nomes (classe, variavel.. )
	 * Regras:
	 * 1� N�o come�ar�s com n�mero ... 1berto (errado) h1berto(certo)
	 * 2� N�o usar�s caracteres especiais (@, #, ~, ...) Exce��o: underline (_) 
	 * 3� N�o utilizar�s palavras reservadas da linguagem (class, int, main, public..)
	 *  
	 * Padroes (vari�veis):
	 * - nomes significativos
	 * - sempre comecam com letras minusculas
	 * - utilizar o padr�o Camel Case
	 */
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float media = (nota1 + nota2) / 2;
		System.out.println("Aluno: " + nome + " sua m�dia foi: " + media);
		if (media>=6) {
			System.out.println("Parabens " + nome + " voc� est� aprovado!!!");
		}
		
		if (media<4) {
			System.out.println("Infelizmente " + nome + " voc� foi reprovado");
		}
		
		if (media<6 && media>=4) {
			System.out.println(nome + " voc� ainda tem chance no exame!");
		}
		
		
	}

}









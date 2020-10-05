package variaveis;

import javax.swing.JOptionPane;

public class Variavel {
	// Variavel � um espa�o tempor�rio na mem�ria RAM onde
	// voc� armazena UM dado.
	public static void main(String[] args) {
		//Sintaxe para criar variaveis
		// <tipo do dado> <nome da variavel>;
		
		/*
		 * Tipos de Dados:
		 * A-) Numerico (int / double): o dado que ser� utilizado em uma opera��o matem�tica e/ou 
		 * for um dado critico para consulta
		 * CEP (contexto no site dos correios) 
		 * B-) Alfanum�rico (String): n�o � utilizado para opera��es matem�ticas.
		 * CEP (contexto aplicacao do RH do Itau-Unibanco)
		 */
		String nome = ""; // tipo de dado por Refer�ncia (pq ele � uma classe)
		int idade = 0; // tipo numerico inteiro primitivo
		double altura=0; // tipo numerico real primitivo
		double peso=0; // tipo numerico real primitivo	
		/*
		 * Para converter (parse), uma string para um tipo primitivo, utilizamos
		 * as classes "Wrapper�s", conforme o tipo primitivo:
		 * Integer para int
		 * Double para double
		 * Float para float
		 * Short para short (e assim sucessivamente.....)
		 */
		nome = JOptionPane.showInputDialog("Digite seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		
		double imc = peso / (altura * altura);
		
		System.out.println("Nome...: " + nome);
		System.out.println("Idade..: " + idade);
		System.out.println("Altura.: " + altura);
		System.out.println("Peso...: " + peso);
		System.out.println("IMC....: " + imc);
		
	}

}

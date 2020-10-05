package br.com.excecao.teste;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("7");
			System.out.println(numero);
	
			String palavra="";
			System.out.println(palavra.length());
			
			int valores[] = new int[2];
			valores[0] = 548;
			valores[1] = 112;
			valores[2] = 95;
	
		}catch(NumberFormatException e) {
			System.err.println("Número inválido");
		}catch(NullPointerException e) {
			System.err.println("Objeto nulo");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Vetor estourou");
		}catch(Exception e) {
			System.err.println("Excecao desconhecida");
		}finally {
			System.out.println("Até logo...");
		}
		
	} // fechando o método main()

} // fechando a classe

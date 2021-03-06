package br.com.lojauati.modelo;

public class Formula1 {
	// Sintaxe para cria��o de m�todos no Java
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do param>){...}
	
	private String escuderia;
	private float valor;
	private int rpm;
	
	public float exibirPromocao(float porc) {
		return valor - valor * (porc/100);
	}
	
	public float exibirPromocao() {
		return valor * (float) 0.9;
	}
	
	public String exibirTudo() {
		return escuderia + "\n" + valor + "\n" + rpm;
	}
	
	public void preencherTudo(String p1, float p2, int p3) {
		escuderia=p1;
		valor=p2;
		rpm=p3;
	}
	
	// Crie um m�todo para preencher todos os atributos - preencherTudo()
	// Crie um m�todo para exibir todos os atributos - exibirTudo()
	// Crie um m�todo para exibir o valor com um desconto de 10% - exibirPromocao()
	// Crie um m�todo para exibir o valor com um desconto que ser� 
	// recebido por par�metro - exibirPromocao()
	
	public int exibirRpm() {
		return rpm;
	}
	
	public float exibirValor() {
		return valor;
	}
	
	public void preencherValor(float valor) {
		if (valor>0) {
			this.valor=valor;
		}
	}
	
	public void preencherRpm(int x) {
		rpm=x;
	}
	
	public String exibirEscuderia() {
		return escuderia;
	}

	public void preencherEscuderia(String parametro) {
		escuderia = parametro.toUpperCase();
	}
	
	
	
	
	
	
}

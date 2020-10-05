package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao{

	private String tipo;

	
	public String getAll() {
		return
				super.getAll() + "\n"  + 
				"Tipo: " + tipo;
	}
	public void setAll(float valor, String descricao, int duracao, String tipo) {
		super.setAll(valor, descricao, duracao);
		this.tipo = tipo;
	}
	
	public Medio() {
		super();
	}

	public Medio(float valor, String descricao, int duracao, String tipo) {
		super(valor, descricao, duracao);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public double calcularMensalidade(float fator) {
		return getValor()/36 * fator;
	}
	@Override
	public void definirDuracao() {
		setDuracao(36);
	}
	
}

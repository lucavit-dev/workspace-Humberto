package br.com.lojauati.teste;

import br.com.lojauati.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		tv.mudarCanal(50);
		System.out.println(tv.exibirTudo());
		tv.ligar();
		tv.mudarCanal(50);
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		System.out.println(tv.exibirTudo());
		tv.desligar();
		tv.diminuirVolume();
		System.out.println(tv.exibirTudo());
		
	}

}

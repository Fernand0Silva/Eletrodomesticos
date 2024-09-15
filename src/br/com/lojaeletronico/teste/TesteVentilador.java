package br.com.lojaeletronico.teste;

import br.com.lojaeletronico.model.Ventilador;

public class TesteVentilador {

	public static void main(String[] args) {
		
		Ventilador ventilador = new Ventilador();
		
		  // Chamando o método retornoValoresAtributos e imprimindo o resultado
        String atributos = ventilador.retornoValoresAtributos();
        System.out.println(atributos);
		
		

	}

}

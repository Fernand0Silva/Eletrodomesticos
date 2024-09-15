package br.com.lojaeletronico.model;

import javax.swing.JOptionPane;

public class Ventilador extends Eletrodomesticos {

	private int QuantidadeHelices;

	public int getQuantidadeHelices() {
		return QuantidadeHelices;
	}

	public void setQuantidadeHelices(int quantidadeHelices) {
		QuantidadeHelices = quantidadeHelices;
	}

	public String retornoValoresAtributos() {
		
		//String marca = (JOptionPane.showInputDialog("Digite a marca"));
      //  System.out.println(ventilador.getMarca());
		
		String marca = "Mundial ";
		String modelo = "De Mesa";
		Double preco = 100.00;
		Double peso = 7.5;
		int quantidadePeca = 1200;
		int quantidadeHelices = 8;
		

	    // Concatenando os valores em uma String para retorno
	    return "Marca: "+ marca +"\n"+ 
	           "Modelo: "+ modelo +"\n"+ 
	            "Preço: "+ preco +"\n" +
	            "Peso: "+ peso +"\n"+
	    		"Quantidade de Peças: " + quantidadePeca + "\n"+
	    		"Quantidade de Hélices: " + quantidadeHelices;

	}
}

package br.com.lojaeletronico.model;

import javax.swing.JOptionPane;

public class Liquidificador extends Eletrodomesticos {

	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}

	private int Id;
	private String marca;
	private String modelo;
	private Double preco;
	private Double peso;
	private int QuantidadePecas;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public int getQuantidadePecas() {
		return QuantidadePecas;
	}
	public void setQuantidadePecas(int quantidadePecas) {
		QuantidadePecas = quantidadePecas;
	}
	
	public String calcularPesoTotal() {
		
		double precofinal =Double.parseDouble(JOptionPane.showInputDialog("Digite  um valor para somar com o peso"));
		String retornoFrase = "Soma com o peso  " + precofinal;
		double somaPreco = precofinal + getPeso();
		String retornoDiferencaPreco = " A soma do peso: " + getPeso() + " com o " + precofinal + " é: " + somaPreco;
		return retornoDiferencaPreco;
	}
	 
	
}

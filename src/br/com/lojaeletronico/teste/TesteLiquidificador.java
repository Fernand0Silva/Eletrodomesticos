package br.com.lojaeletronico.teste;

import javax.swing.JOptionPane;

import br.com.lojaeletronico.model.Liquidificador;

public class TesteLiquidificador {

	public static void main(String[] args) {
		
		Liquidificador liquidificador = new Liquidificador();
		
		liquidificador.setMarca(JOptionPane.showInputDialog("Digite a marca"));
        System.out.println(liquidificador.getMarca());
        
        liquidificador.setModelo(JOptionPane.showInputDialog("Digite o modelo"));
        System.out.println(liquidificador.getModelo());
        
        liquidificador.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso")));
        System.out.println(liquidificador.getPeso());
        
        liquidificador.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço")));
        System.out.println(liquidificador.getPreco());
        
        liquidificador.setQuantidadePecas(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de peças")));
        System.out.println(liquidificador.getQuantidadePecas());
        
        System.out.println(liquidificador.calcularPesoTotal());

	}

}

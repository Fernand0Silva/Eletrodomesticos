package br.com.lojaeletronico.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.lojaeletronico.conexao.Conexao;
import br.com.lojaeletronico.dao.LiquidificadorDAO;
import br.com.lojaeletronico.model.Liquidificador;


public class TesteSelecionarLiquidificador {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao(); 

		LiquidificadorDAO liquidificadorDao = new LiquidificadorDAO(con);

		ArrayList<Liquidificador> lista = liquidificadorDao.retornarDadosLiquidificador();

		if(lista != null) {
			for(Liquidificador p : lista) {
				System.out.println("Id: " + p.getId());
				System.out.println("Marca: " + p.getMarca());
				System.out.println("Modelo: " + p.getModelo());
				System.out.println("Peso: " + p.getPeso());
				System.out.println("Preco: " + p.getPreco());
				System.out.println("QtPecas: " + p.getQuantidadePecas());
				
				
				
			}
		}

		Conexao.fecharConexao(con);
	}

}



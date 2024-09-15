package br.com.lojaeletronico.teste;

import java.sql.Connection;

import br.com.lojaeletronico.conexao.Conexao;
import br.com.lojaeletronico.dao.LiquidificadorDAO;
import br.com.lojaeletronico.model.Liquidificador;


public class TesteInserir {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		
		Liquidificador liquidificador = new Liquidificador(); 
		
		LiquidificadorDAO liquidificadorDao = new LiquidificadorDAO(con);
		
		liquidificador.setMarca("Plilco");
		liquidificador.setModelo("Novo");
		liquidificador.setPeso(9.1);
		liquidificador.setPreco(309.99);
		liquidificador.setQuantidadePecas(20);
		
		System.out.println(liquidificadorDao.inserir(liquidificador));
		Conexao.fecharConexao(con);
		
	}

}

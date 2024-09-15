package br.com.lojaeletronico.teste;

import java.sql.Connection;

import br.com.lojaeletronico.conexao.Conexao;
import br.com.lojaeletronico.dao.LiquidificadorDAO;
import br.com.lojaeletronico.model.Liquidificador;

public class TesteDeletarComWhereLiquidificador {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		Liquidificador liquidificador = new Liquidificador(); 

		LiquidificadorDAO liquidificadorDao = new LiquidificadorDAO(con);
		
		liquidificador.setId(1);
		
		System.out.println(liquidificadorDao.deletarLiquidificadorComWhere(liquidificador));
		Conexao.fecharConexao(con);
	}

}



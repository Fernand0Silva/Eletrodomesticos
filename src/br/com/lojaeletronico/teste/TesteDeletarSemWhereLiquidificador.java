package br.com.lojaeletronico.teste;

import java.sql.Connection;

import br.com.lojaeletronico.conexao.Conexao;
import br.com.lojaeletronico.dao.LiquidificadorDAO;
import br.com.lojaeletronico.model.Liquidificador;

public class TesteDeletarSemWhereLiquidificador {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		//Liquidificador liquidificador = new Liquidificador(); 

		LiquidificadorDAO liquidificadorDao = new LiquidificadorDAO(con);

		
		System.out.println(liquidificadorDao.deletarLiquidificadorSemWhere());
		Conexao.fecharConexao(con);
	}

}



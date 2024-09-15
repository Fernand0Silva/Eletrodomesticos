package br.com.lojaeletronico.teste;

import java.sql.Connection;

import br.com.lojaeletronico.conexao.Conexao;
import br.com.lojaeletronico.dao.LiquidificadorDAO;
import br.com.lojaeletronico.model.Liquidificador;

public class TesteModificarLiquidificador {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		Liquidificador liquidificador = new Liquidificador(); 

		LiquidificadorDAO liquidificadorDao = new LiquidificadorDAO(con);

		liquidificador.setMarca("Electrolux");
		liquidificador.setModelo("Novo");
		liquidificador.setPeso(12.8);
		liquidificador.setPreco(99.99);
		liquidificador.setQuantidadePecas(17);
		liquidificador.setId(3);


		System.out.println(liquidificadorDao.modificarLiquidificadorComWhere(liquidificador));
		Conexao.fecharConexao(con);
	}

}



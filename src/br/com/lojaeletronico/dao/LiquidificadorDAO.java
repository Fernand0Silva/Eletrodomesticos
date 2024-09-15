package br.com.lojaeletronico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.lojaeletronico.model.Liquidificador;
import br.com.testedoisbd.model.Pessoa;

public class LiquidificadorDAO {

	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	public LiquidificadorDAO() {
	}
	public LiquidificadorDAO(Connection con) {
		setCon(con);
	}

	public String inserir(Liquidificador liquidificador) {
		String sql = "insert into Liquidificador(Marca,Modelo,Peso,Preco,QtPesas) values (?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			//ps.setInt(1,liquidificador.getId()); // Passa o ID como condição WHERE
			ps.setString(1, liquidificador.getMarca());
			ps.setString(2,liquidificador.getModelo());
			ps.setDouble(3,liquidificador.getPeso());
			ps.setDouble(4,liquidificador.getPreco());
			ps.setInt(5,liquidificador.getQuantidadePecas());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	//update pessoa set nome = (?) where endereço = (?)

	public String modificarLiquidificadorComWhere(Liquidificador liquidificador) {
		String sql = "UPDATE Liquidificador SET Marca = ?, Modelo = ?,"
				+ " Peso = ?, Preco = ?,QtPesas = ? WHERE id = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, liquidificador.getMarca());
			ps.setString(2,liquidificador.getModelo());
			ps.setDouble(3,liquidificador.getPeso());
			ps.setDouble(4,liquidificador.getPreco());
			ps.setInt(5,liquidificador.getQuantidadePecas());
			ps.setInt(6,liquidificador.getId()); // Passa o ID como condição WHERE
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro ao Alterar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public ArrayList<Liquidificador> retornarDadosLiquidificador(){
		String sql = "select * from Liquidificador";
		ArrayList<Liquidificador> retornarLiquidificador = new ArrayList<Liquidificador>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Liquidificador liquidificador = new Liquidificador();
					liquidificador.setId(rs.getInt(1));
					liquidificador.setMarca(rs.getString(2));       //(rs.getString(1));
					liquidificador.setModelo(rs.getString(3));
					liquidificador.setPeso(rs.getDouble(4));
					liquidificador.setPreco(rs.getDouble(5));
					liquidificador.setQuantidadePecas(rs.getInt(6));
					//liquidificador.setId(rs.getInt(6));
					retornarLiquidificador.add(liquidificador);
				}
				if (retornarLiquidificador.isEmpty()) {
					System.out.println("Nenhum dado encontrado na tabela Liquidificador.");
				}
				return retornarLiquidificador;
			} else {
				System.out.println("ResultSet é nulo.");
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace(); // Imprimir a stack trace para identificar o erro
			return null;
		}
	}
	public String deletarLiquidificadorSemWhere() {
		String sql = "delete from Liquidificador;";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	public String deletarLiquidificadorComWhere(Liquidificador liquidificador) {
		String sql = "delete from Liquidificador where Id  = (?);";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			//ps.setString(1, liquidificador.getMarca());
			//ps.setString(2,liquidificador.getModelo());
			//ps.setDouble(3,liquidificador.getPeso());
			//ps.setDouble(4,liquidificador.getPreco());
			//ps.setInt(5,liquidificador.getQuantidadePecas());
			ps.setInt(1,liquidificador.getId());
			int rowsAffected = ps.executeUpdate();
			if (rowsAffected > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

}

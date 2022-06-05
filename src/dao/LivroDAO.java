package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import factory.Conexao;
import model.Livro;
import singleton.ConexaoSingleton;

public class LivroDAO {
	private Connection conexao;
	
	public LivroDAO() {
		//conexao = new Conexao().getConexao();
		conexao = ConexaoSingleton.getInstancia().getConexao();		
	}
	
	
	public String salvar(Livro livro) {
		String sql = "INSERT INTO livro(titulo,autor,editora,ano)" +
				     "VALUES(?,?,?,?) ";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, livro.getTitulo());
			ps.setString(2, livro.getAutor());
			ps.setString(3, livro.getEditora());
			ps.setInt(4, livro.getAno());
			ps.execute();
			ps.close();
			return "Livro gravado com êxito!";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Houve um erro ao gravar. Tente novamente.";
		}				
	}
	public List<Livro> listartodos(){
		List<Livro> listalivros = new ArrayList<>();
		String sql = "SELECT  * FROM LIVRO ";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			//rs.first() ou rs.beforeFirst();
			
			while (rs.next()) {
				Livro livro = new Livro();
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutor(rs.getString("autor"));
				livro.setEditora(rs.getString("editora"));
				livro.setAno(rs.getInt("ano"));
				livro.setCodigo(rs.getInt("codigo"));
				listalivros.add(livro);
			}
			ps.close();
			return listalivros;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Livro> pesquisarlivro(String pesquisa) {
		List<Livro> listalivros = new ArrayList<>();
		String sql = "SELECT * FROM LIVRO" +
					" WHERE TITULO LIKE ?";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, "%" + pesquisa + "%");
			ResultSet rs = ps.executeQuery();
			
			//rs.first() ou rs.beforeFirst();
			
			while (rs.next()) {
				Livro livro = new Livro();
				livro.setTitulo(rs.getString("titulo"));
				livro.setAutor(rs.getString("autor"));
				livro.setEditora(rs.getString("editora"));
				livro.setAno(rs.getInt("ano"));
				livro.setCodigo(rs.getInt("codigo"));
				listalivros.add(livro);
			}
			ps.close();
			return listalivros;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public Livro getLivroPorCodigo(int codigo) {
		String sql = "SELECT * FROM LIVRO " +
					" WHERE CODIGO = ? ";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			rs.next();
			Livro livro = new Livro();
			livro.setCodigo(rs.getInt("codigo"));
			livro.setAno(rs.getInt("ano"));
			livro.setAutor(rs.getString("autor"));
			livro.setEditora(rs.getString("editora"));
			livro.setTitulo(rs.getString("titulo"));
			rs.close();
			return livro;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String alterar(Livro livro) {
		String sql = " UPDATE LIVRO SET TITULO = ?, "+
					 " AUTOR = ?, EDITORA = ?, ANO = ? "+
					 " WHERE CODIGO = ? ";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, livro.getTitulo());
			ps.setString(2, livro.getAutor());
			ps.setString(3, livro.getEditora());
			ps.setInt(4, livro.getAno());
			ps.setInt(5, livro.getCodigo());
			ps.execute();
			ps.close();
			return "Livro Alterado";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Houve um erro ao alterar, tente novamente.";
		}	
	}
	
	public String excluir(int codigo) {
		String sql = " DELETE FROM LIVRO "+
					 " WHERE CODIGO = ?  ";
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, codigo);
			ps.execute();
			ps.close();

			return "Livro Excluido";
			
		} catch (SQLException e) {
			e.printStackTrace();
			//e.getMessage para ver o erro que vai acontecer se acontecer.
			return "Houve um erro ao excluir! Tente novamente" + e.getMessage();
		}
	}
}

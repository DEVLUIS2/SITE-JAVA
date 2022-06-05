package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private Connection conexao;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/dblivro";
	private String usuario = "root";
	private String senha = "";
	
	public Connection getConexao() {
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url,usuario,senha);
			return conexao;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}

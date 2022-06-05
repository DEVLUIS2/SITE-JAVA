package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSingleton {
	private static ConexaoSingleton conexaoSingleton;
	private Connection conexao;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/filme";
	private String usuario = "root";
	private String senha = "";
	
	public ConexaoSingleton() {
		try {
			Class.forName(driver);
			 this.conexao = DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static synchronized ConexaoSingleton getInstancia() {
		if (conexaoSingleton == null) {
			conexaoSingleton = new ConexaoSingleton();
		}
		return conexaoSingleton;
	}
	
	public Connection getConexao() {
		return this.conexao;
	}
}

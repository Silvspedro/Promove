package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {
	
	// parâmetros de conexão

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/promove?useTimezone=true&sserverTimezone=UTC";
	private String user = "root";
	private String password = "Fist2737*";
	
	// Método de conexão
	protected Connection conectar() {
		Connection con = null; // Esse objeto será usado para estabelecer uma sessão com o banco de dados.
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password); // Para estabelecer a conexão com o banco de dados.
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}		
	
	public void inserirUsuario(JavaBeans usuario) {
			String create = "insert into cadastro_usuario(NOME_USUARIO, EMAIL_USUARIO, SENHA_USUARIO) values (?, ?, ?)";
			try {
				// abrir a conexão com o banco.
				Connection con = conectar();
				// Preparar a query para execução no banco de dados.
				PreparedStatement pst = con.prepareStatement(create);
				// Substituir os parâmetros (?) pelo conteúdo das variáveis JavaBeans
				pst.setString(1, usuario.getNome_usuario());
				pst.setString(2, usuario.getEmail_usuario());
				pst.setString(3, usuario.getSenha_usuario());
				// Executar a query
				pst.executeUpdate();
				// Encerrar a conexão com o banco.
				con.close();

			} catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
		}
}

package model;

public class JavaBeans {
	private String id_usuario;
	private String email_usuario;
	private String senha_usuario;
	private String nome_usuario;
	
	//private String id_endereco;
	
	public JavaBeans() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public JavaBeans(String ID_USUARIO, String NOME_USUARIO, String EMAIL_USUARIO, String SENHA_USUARIO) {
		super();
		this.id_usuario = ID_USUARIO;
		this.nome_usuario = NOME_USUARIO; 
		this.email_usuario = EMAIL_USUARIO;
		this.senha_usuario = SENHA_USUARIO;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	public String getSenha_usuario() {
		return senha_usuario;
	}

	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	
}
	

	
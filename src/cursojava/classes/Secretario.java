package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

/**
 * USANDO HERANÇA COM EXTENDS 
 * CLASSE FILHA DE PESSOA
 * SECRETARIO ESTÁ EXTENDENDO DA CLASSE PESSOA
 */
public class Secretario extends Pessoa implements PermitirAcesso {

	private int registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	public Secretario() {
		
	}
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.idade >= 18;
	}
	
	public String msgMaiorDeIdade() {
		return this.pessoaMaiorIdade() ? "É maior de Idade" : "É menor de Idade";
	}

	@Override
	public String toString() {
		return "Secretario "
				+ "\n[registro=" + registro 
				+ "\n, nivelCargo=" + nivelCargo 
				+ "\n, experiencia=" + experiencia
				+ "\n, nome=" + nome 
				+ "\n, idade=" + idade 
				+ "\n, dataNascimento=" + dataNascimento 
				+ "\n, registroGeral=" + registroGeral 
				+ "\n, numeroCpf=" + numeroCpf 
				+ "\n, nomeMae=" + nomeMae 
				+ "\n, nomePai=" + nomePai 
				+ "\n]";
	}

	@Override
	public double salario() {
		double aumento = 0.0;
		aumento = 2200 * 0.5;
		return 2200 + aumento;
	}

	/**
	 * MÉTODO DO CONTRATO DE AUTENTICAÇÃO
	 * RETORNA TRUE SE O LOGIN FOR ADMIN E SENHA SE FOR ADMIN, CASO CONTRÁRIO RETORNA FALSE
	 */
//	@Override
//	public boolean autenticar() {
//		if (this.login.equalsIgnoreCase("admin")
//				&& this.senha.equalsIgnoreCase("admin")) {
//			return true;
//		}
//		return false;
//	}
	
	/**
	 * MÉTODO AUTENTICAR COM PARÂMTEROS
	 */
	@Override
	public boolean autenticar(String login, String senha) {
		/*SE QUISER DECLARAR OS ATRIBUTOS ABAIXO, SE NÃO, FUNCIONA DO MESMO JEITO*/
		this.login = login;
		this.senha = senha;
		/*CHAMANDO O MÉTODO SEM PARÂMETROS, ISSO É REAPROVEITAMENTO DE CÓDIGO*/
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin");
	}

	

}

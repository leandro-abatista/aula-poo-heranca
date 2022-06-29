package cursojava.interfaces;

/**
 * CLASSE DE INTERFACE
 * ESSA INTERFACE É O CONTRATO DE AUTENTICAÇÃO
 * SOMENTE O SECRETÁRIO POR ENQUANTO IMPLEMENTA ESSA INTERFACE
 */
public interface PermitirAcesso {

	/*APENAS DECLARANDO O MÉTODO*/
	public boolean autenticar();
	public boolean autenticar(String login, String senha);
}

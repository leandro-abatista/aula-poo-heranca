package cursojava.classesAuxiliares;

import cursojava.interfaces.PermitirAcesso;

/**
 * TEM A FUNÇÃO DE RECEBER ALGUÉM QUE TEM O CONTRATO DA INTERFACEDE 'PERMITIRACESSO' E CHAMAR A AUTENTICACAO
 */
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	/**
	 * CONSTRUTOR
	 * @param acesso
	 */
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	public boolean autenticarCursoJava() {
		return permitirAcesso.autenticar();
	}

//	public boolean autenticarCursoJava(PermitirAcesso acesso) {
//		return acesso.autenticar();
//	}
}

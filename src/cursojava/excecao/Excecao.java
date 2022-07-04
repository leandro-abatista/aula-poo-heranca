package cursojava.excecao;

public class Excecao extends Exception {

	public Excecao(String mensagemErro) {
		//passa a mensagem de erro para classe pai
		super("Vixe, erro no processamento do arquivos de notas :: "+mensagemErro);
	}
}

package cursojava.classes;

import cursojava.constantes.StatusAlunoMaiorIdade;

/**
 * USANDO HERANÇA COM EXTENDS
 * CLASSE FILHA DE PESSOA
 * DIRETOR ESTÁ EXTENDENDO DA CLASSE PESSOA
 */
public class Diretor extends Pessoa {

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	@Override/*IDENTIFICA MÉTODO SOBREESCRITA, UM MÉTODO QUE JÁ EXISTE NA CLASSE PAI OU SUPERCLASSE PESSOA*/
	public boolean pessoaMaiorIdade() {
		/*REESCREVI O MÉTODO QUE JÁ EXISTIA NA CLASSE PAI OU SUPER CLASSE PESSOA*/
		if (super.idade >= 18) {
			System.out.println(StatusAlunoMaiorIdade.MAIORIDADE);
			return true;
		}
		System.out.println(StatusAlunoMaiorIdade.MENORIDADE);
		return false;
	}

	
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		double aumento = 0.0;
		aumento = 3900 * 0.1;
		return 3900 + aumento;
	}
	
	

}

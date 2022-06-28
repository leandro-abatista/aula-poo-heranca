package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;
import cursojava.constantes.StatusAlunoMaiorIdade;

/**
 * USANDO HERANÇA COM EXTENDS
 * ALUNO ESTÁ EXTENDENDO DA CLASSE PESSOA
 */
public class Aluno extends Pessoa {

	private String dataMatricula;
	private String nomeEscola;
	private int serieMatriculado;

	private List<Disciplina> disciplinas = new ArrayList<>();

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public int getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(int serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	/**
	 * M�todo para retornar a m�dia do aluno
	 */
	public double getMediaNota() {
		
		double somaNotas = 0.0;//inicia com 0
		//varrendo/percorrendo a lista de disciplinas
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		//return somaNotas / 4;//pode ser assim ou pode
		return somaNotas / disciplinas.size();//size retorna a quantidade de objetos na disciplina - assim fica din�mico
	} 
	
	/*M�TODO QUE RETORNA TRUE APROVADO E FALSE PARA REPROVADO*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * M�todo para verificar se o aluno est� aprovado, em recupera��o, reprovado
	 * @return
	 */
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				//return "Aluno est� aprovado";
				return StatusAluno.APROVADO;
			} else {
				//return "Aluno est� em recupera��o";
				return StatusAluno.RECUPERACAO;
			}
		} else {
			//return "Aluno est� reprovado";
			return StatusAluno.REPROVADO;
		}
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
		return "Aluno "
				+ "[nome = " + nome 
				+ "\n, idade = " + idade 
				+ "\n, data Nascimento = " + dataNascimento 
				+ "\n, registro Geral = " + registroGeral 
				+ "\n, cpf = " + numeroCpf 
				+ "\n, nome da Mae = " + nomeMae 
				+ "\n, nome do Pai = " + nomePai
				+ "\n, data Matricula = " + dataMatricula 
				+ "\n, nome da Escola = " + nomeEscola 
				+ "\n, serie Matriculado = " + serieMatriculado
				+ "\n, Disciplinas = " + disciplinas 
				+ "]";
	}

	@Override
	public double salario() {
		double aumento = 0.0;
		aumento = 1590.90 * 0.2;
		return 1500.90 + aumento;
	}

}

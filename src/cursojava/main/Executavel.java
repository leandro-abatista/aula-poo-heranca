package cursojava.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesAuxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.Excecao;
import cursojava.interfaces.PermitirAcesso;


public class Executavel {

	public static void main(String[] args) {
		
		
		try {
			
		lerArquivo();
		
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe o Senha");
		
		
		
//		Secretario secretario = new Secretario();/*DIRETAMENTE COM O OBJETO*/
//		secretario.setLogin(login);
//		secretario.setSenha(senha);
		
		
//		PermitirAcesso secretario = new Secretario();/*DIRETAMENTE COM O OBJETO*/
		
		//FuncaoAutenticacao funcaoAutenticacao = new FuncaoAutenticacao();
		
		/*ESSA INTERFACE ESTÁ RECEBENDO O OBJETO DO TIPO SECRETÁRIO*/
		//PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		
		/*PARA MELHORA E ENXUGAR AINDA MAIS O CÓDIGO*/
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticarCursoJava()) {/*Vou travar o contrato para autorizar somente quem tem o acesso*/

//			List<Aluno> alunos = null;//exemplo para gerar erro
			List<Aluno> alunos = new ArrayList<>();// lista para adicionar os alunos

			/* chave, valor */
			/*
			 * � UMA LISTA QUE DENTRO DELA TEMOS UMA CHAVE QUE IDENTIFICA UMA SEQU�NCIA DE
			 * VALORES
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<>();

//			List<Aluno> alunosAprovados = new ArrayList<>();
//			List<Aluno> alunosRecuperacao = new ArrayList<>();
//			List<Aluno> alunosreprovados = new ArrayList<>();

			for (int quantidade = 1; quantidade <= 1; quantidade++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " +quantidade+ "?");
				String idade = JOptionPane.showInputDialog("Qual a idade do Aluno? ");
				// String dataNasc = JOptionPane.showInputDialog("Qual a data nascimento do
				// Aluno? ");
				// String cpf = JOptionPane.showInputDialog("Qual o CPF do Aluno? ");
				// String rg = JOptionPane.showInputDialog("Qual o RG do Aluno? ");
				// String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e do Aluno?
				// ");
				// String nomePai = JOptionPane.showInputDialog("Qual o nome pai do Aluno? ");
				// String dataMatric = JOptionPane.showInputDialog("Qual a data matricula do
				// Aluno? ");
				// String serieMatric = JOptionPane.showInputDialog("Qual a s�rie do Aluno? ");
				// String nomeEsc = JOptionPane.showInputDialog("Qual o nome da escola do Aluno?
				// ");

				// setando os dados os dados no objeto aluno
				Aluno aluno = new Aluno();
				aluno.setNome(nome.toUpperCase());
				aluno.setIdade(Integer.valueOf(idade));
				// aluno.setDataNascimento(dataNasc);
				// aluno.setNumeroCpf(cpf);
				// aluno.setRegistroGeral(rg);
				// aluno.setNomeMae(nomeMae.toUpperCase());
				// aluno.setNomePai(nomePai.toUpperCase());
				// aluno.setDataMatricula(dataMatric);
				// aluno.setSerieMatriculado(serieMatric);
				// aluno.setNomeEscola(nomeEsc.toUpperCase());

				for (int i = 1; i <= 2; i++) {
					String disciplina = JOptionPane.showInputDialog("Disciplina " + i + " ? ");
					String nota = JOptionPane.showInputDialog("Nota ? ");
					Disciplina disc = new Disciplina();
					disc.setNomeDisciplina(disciplina);
					disc.setNota(Double.valueOf(nota));
					// ADICIONA AS DISCIPLINAS E NOTAS NA LISTA
					aluno.getDisciplinas().add(disc);
				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
				if (escolha == 0) {// OP��O SIM = 0

					// WHILE -> ENQUANTO FOR VERDADEIRO FA�A
					// L�GICA DO C�DIGO
					int continuarRemover = 0;
					int posicao = 1;

					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
						aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover disciplinas?");
					}
				}

				alunos.add(aluno);// Adiciona os dados do aluno na lista
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			// CRIANDO A LISTA DE APROVADO, REPROVADOS E EM RECUPERA��O
			for (Aluno aluno : alunos) {/* SEPAREI EM LISTAS */
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					// alunosAprovados.add(aluno);
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					// alunosRecuperacao.add(aluno);
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					// alunosreprovados.add(aluno);/*�ltima op��o de reprova��o*/
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}
			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("-------------------Lista dos aprovados-----------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome do aluno :: " + aluno.getNome());
				System.out.println("M�dia do aluno :: " + aluno.getMediaNota());
				System.out.println("Resultado :: " + aluno.getAlunoAprovado2());
				for (Disciplina disc : aluno.getDisciplinas()) {
					System.out.println("--------------Disciplinas----------------------");
					System.out.println("Disciplina :: " + disc.getNomeDisciplina());
					System.out.println("Nota :: " + disc.getNota());
					System.out.println("-----------------------------------------------");
				}
			}

			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("-------------------Lista em recupera��o----------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome do aluno :: " + aluno.getNome());
				System.out.println("M�dia do aluno :: " + aluno.getMediaNota());
				System.out.println("Resultado :: " + aluno.getAlunoAprovado2());
				for (Disciplina disc : aluno.getDisciplinas()) {
					System.out.println("--------------Disciplinas----------------------");
					System.out.println("Disciplina :: " + disc.getNomeDisciplina());
					System.out.println("Nota :: " + disc.getNota());
					System.out.println("-----------------------------------------------");
				}
			}

			System.out.println();
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("-------------------Lista dos reprovados-----------------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome do aluno :: " + aluno.getNome());
				System.out.println("M�dia do aluno :: " + aluno.getMediaNota());
				System.out.println("Resultado :: " + aluno.getAlunoAprovado2());
				for (Disciplina disc : aluno.getDisciplinas()) {
					System.out.println("--------------Disciplina----------------------");
					System.out.println("Disciplina :: " + disc.getNomeDisciplina());
					System.out.println("Nota :: " + disc.getNota());
					System.out.println("-----------------------------------------------");
				}
			}

//		/*Percorre a lista de alunos | Para cada aluno iimprime os dados do aluno*/
//		for(Aluno aluno : alunos) {
//			
//			/*Procurando um aluno e imprimindo a m�dia*/
//			if(aluno.getNome().equalsIgnoreCase("Jos�")) {
//				
//				alunos.remove(aluno);/*REMOVE UM ALUNO DA LISTA, NO CASO O ALUNO JOS�*/
//				break;//parar o c�digo assim que encontrar o aluno 'jos�'
//			} else {
//				System.out.println(aluno.toString());
//				System.out.println("M�dia :: " + String.format("%.2f", aluno.getMediaNota()));
//				System.out.println("Resultado :: " + aluno.getAlunoAprovado2());
//				System.out.println("----------------------------------------------------------------------------------");
//			}

			// PERCORRENDO A LISTA PELA POSI��O
			// PARA CADA POSI��O DO TAMANHO DA LISTA, RECUPERA O OBJETO ALUNO
//			for (int pos = 0; pos < alunos.size(); pos++) {
//				
//				Aluno aluno = alunos.get(pos);
//				
//				//SUBSTITUINDO UM OBJETO POR OUTRO NA LISTA
//				if(aluno.getNome().equalsIgnoreCase("alex")) {
//					
//					Aluno trocar = new Aluno();
//					trocar.setNome("Aluno trocado");
//					
//					Disciplina disciplina = new Disciplina();
//					disciplina.setNomeDisciplina("Mat�matica");
//					disciplina.setNota(96);
//					
//					trocar.getDisciplinas().add(disciplina);
//					
//					//subtitui atrav�s do c�digo abaixo
//					alunos.set(pos, trocar);
//					aluno = alunos.get(pos);
//				}
//				
//				System.out.println("Aluno = " + aluno.getNome());
//				System.out.println("M�dia do Aluno = " + aluno.getMediaNota());
//				System.out.println("Resultado = " + aluno.getAlunoAprovado2());

//				for (Disciplina disc : aluno.getDisciplinas()) {
//					System.out.println("Disciplina :: " + disc.getNomeDisciplina() + " - Nota :: " + disc.getNota());
//				}

//				for(int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
//					Disciplina disc = aluno.getDisciplinas().get(posd);
//					System.out.println("Disciplina :: " + disc.getNomeDisciplina() + " - Nota :: " + disc.getNota());
//				}
//			}
//		}

//		/*ESSE FOR PERCORRE OS ALUNO QUE SOBRARAM NA LISTA*/
//		System.out.println();
//		System.out.println("Alunos que sobraram na lista ::: ");
//		for (Aluno aluno : alunos) {
//			System.out.println("-----------------------------------------------------------------");
//			System.out.println("NOME DO ALUNO :: " + aluno.getNome());
//			System.out.println("-----------------------------------------------------------------");
//			System.out.println("Suas mat�rias s�o :::");
//			System.out.println();
//			
//			for(Disciplina disciplina : aluno.getDisciplinas()) {
//				System.out.println("--------------------------------------------------------------");
//				System.out.println("Nome :: " + disciplina.getNomeDisciplina() + " - Nota :: " + disciplina.getNota());
//				System.out.println("================================================================================");
//			}
//		}
//		
//	}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido!\nLogin e/ou senha incorreto!");
		}
		
		} catch (NullPointerException erro) {
			//CLASSE JAVA PARA TRABALHAR COM TEXTOS
			StringBuilder saidaDeTexto = new StringBuilder();
			
			/*O EXCEPTION É GENÉRICO*/
			erro.printStackTrace();/*Imprime a pilha de erro no console java*/
			
			/*MESSAGEEM DO ERRO OU CAUSA*/
			System.out.println("Mensagem de erro :: " + erro.getMessage());
			
			for(int i = 0; i < erro.getStackTrace().length; i++) {
//				System.out.println("Classe de erro :: " + erro.getStackTrace()[i].getClassName());
//				System.out.println("Método de erro :: " + erro.getStackTrace()[i].getMethodName());
//				System.out.println("Linha de erro :: " + erro.getStackTrace()[i].getLineNumber());
				
				//MELHORANDO O CÓDIGO DE IMPRESSÃO DE CONSOLE
				saidaDeTexto.append("\nClasse de erro :: " + erro.getStackTrace()[i].getClassName());
				saidaDeTexto.append("\nMétodo de erro :: " + erro.getStackTrace()[i].getMethodName());
				saidaDeTexto.append("\nLinha de erro :: " + erro.getStackTrace()[i].getLineNumber());
				saidaDeTexto.append("\nClasse da exceção de erro :: " + erro.getStackTrace()[i].getClass().getName());
				saidaDeTexto.append("\n");
				saidaDeTexto.append("\n============================================================================");
			
			}
			
			JOptionPane.showMessageDialog(null, "Erro ao processar notas!"+"\nMensagem de Erro do console: " + saidaDeTexto);
		} catch (NumberFormatException erro) {
			//CLASSE JAVA PARA TRABALHAR COM TEXTOS
			StringBuilder saidaDeTexto = new StringBuilder();
			
			/*O EXCEPTION É GENÉRICO*/
			erro.printStackTrace();/*Imprime a pilha de erro no console java*/
			
			/*MESSAGEEM DO ERRO OU CAUSA*/
			System.out.println("Mensagem de erro :: " + erro.getMessage());
			
			for(int i = 0; i < erro.getStackTrace().length; i++) {
//				System.out.println("Classe de erro :: " + erro.getStackTrace()[i].getClassName());
//				System.out.println("Método de erro :: " + erro.getStackTrace()[i].getMethodName());
//				System.out.println("Linha de erro :: " + erro.getStackTrace()[i].getLineNumber());
				
				//MELHORANDO O CÓDIGO DE IMPRESSÃO DE CONSOLE
				saidaDeTexto.append("\nClasse de erro :: " + erro.getStackTrace()[i].getClassName());
				saidaDeTexto.append("\nMétodo de erro :: " + erro.getStackTrace()[i].getMethodName());
				saidaDeTexto.append("\nLinha de erro :: " + erro.getStackTrace()[i].getLineNumber());
				saidaDeTexto.append("\nClasse da exceção de erro :: " + erro.getStackTrace()[i].getClass().getName());
				saidaDeTexto.append("\n");
				saidaDeTexto.append("\n============================================================================");
			}
			JOptionPane.showMessageDialog(null, "Erro ao informar string em um campo com entrada de número!"
			+"\nMensagem de Erro do console: " + saidaDeTexto);
		} catch (Exception erro) {
			//CLASSE JAVA PARA TRABALHAR COM TEXTOS
			StringBuilder saidaDeTexto = new StringBuilder();
			
			/*O EXCEPTION É GENÉRICO*/
			erro.printStackTrace();/*Imprime a pilha de erro no console java*/
			
			/*MESSAGEEM DO ERRO OU CAUSA*/
			System.out.println("Mensagem de erro :: " + erro.getMessage());
			
			for(int i = 0; i < erro.getStackTrace().length; i++) {
//				System.out.println("Classe de erro :: " + erro.getStackTrace()[i].getClassName());
//				System.out.println("Método de erro :: " + erro.getStackTrace()[i].getMethodName());
//				System.out.println("Linha de erro :: " + erro.getStackTrace()[i].getLineNumber());
				
				//MELHORANDO O CÓDIGO DE IMPRESSÃO DE CONSOLE
				saidaDeTexto.append("\nClasse de erro :: " + erro.getStackTrace()[i].getClassName());
				saidaDeTexto.append("\nMétodo de erro :: " + erro.getStackTrace()[i].getMethodName());
				saidaDeTexto.append("\nLinha de erro :: " + erro.getStackTrace()[i].getLineNumber());
				saidaDeTexto.append("\nClasse da exceção de erro :: " + erro.getStackTrace()[i].getClass().getName());
				saidaDeTexto.append("\n");
				saidaDeTexto.append("\n============================================================================");
			}
			JOptionPane.showMessageDialog(null, "Erro genérico inesperado!"
			+"\nMensagem de Erro do console: " + saidaDeTexto);
		} finally {/*SEMPRE É EXECUTADO OCORRENDO ERROS OU NÃO*/
			//sempre é usado quando precisa executar um processo acontecendo erro ou não.
			JOptionPane.showMessageDialog(null, "Obrigado por aprender java!");
		}
	}

	private static void lerArquivo() throws FileNotFoundException {
			
			File file = new File("arquivo.txt");
			Scanner scanner = new Scanner(file);
			
		
	}
}

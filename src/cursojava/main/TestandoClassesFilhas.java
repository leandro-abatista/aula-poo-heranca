package cursojava.main;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Leandro DevTreinamentos");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("12312312231311312");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");

	}

}

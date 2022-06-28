package cursojava.main;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Leandro DevTreinamentos");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("12312312231311312");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.msgMaiorDeIdade());
		
		System.out.println();
		
		System.out.println("Salário aluno :: " + aluno.salario());
		System.out.println("Salário secretário :: " + secretario.salario());
		System.out.println("Salário diretor :: " + diretor.salario());

	}

}

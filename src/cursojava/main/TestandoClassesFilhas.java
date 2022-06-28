package cursojava.main;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Leandro DevTreinamentos");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Hugo vasconcelos");
		diretor.setRegistroGeral("12312312231311312");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Anchieta");
		secretario.setExperiencia("Administração");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.msgMaiorDeIdade());
		
		System.out.println();
		
		System.out.println("Salário aluno :: " + String.format("%.2f", aluno.salario()));
		System.out.println("Salário secretário :: " + String.format("%.2f", secretario.salario()));
		System.out.println("Salário diretor :: " + String.format("%.2f", diretor.salario()));
		
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		

	}
	
	/*MÉTODO GENERICO DO POLIMORFISMO*/
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() 
		+ " e o salário = " + String.format("%.2f", pessoa.salario()));
	}

}

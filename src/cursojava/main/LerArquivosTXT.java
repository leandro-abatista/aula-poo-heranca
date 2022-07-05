package cursojava.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cursojava.classes.Aluno;

public class LerArquivosTXT {

	public static void main(String[] args) throws FileNotFoundException {
		
		List<Aluno> alunos = new ArrayList<>();
		
		FileInputStream entradaArquivo = 
				new FileInputStream(
						new File("C://ws-alex-dev-treinamento/aula-poo-heranca/src/cursojava/main/arquivoLer.txt"));
		
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		//enquanto tiver dados no arquivo faça
		while (lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			if (linha != null && !linha.isEmpty()) {
				String[] dados = linha.split("\\;");
				Aluno a = new Aluno();
				a.setNome(dados[0]);
				a.setIdade(Integer.parseInt(dados[1]));
				a.setEmail(dados[2]);
				
				alunos.add(a);
			}
			
		}
		
		System.out.println(alunos);
		
	}

}

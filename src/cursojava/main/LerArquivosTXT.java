package cursojava.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivosTXT {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		FileInputStream entradaArquivo = 
				new FileInputStream(
						new File("C://ws-alex-dev-treinamento/aula-poo-heranca/src/cursojava/main/arquivo.txt"));
		
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		//enquanto tiver dados no arquivo faça
		while (lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			if (linha != null && !linha.isEmpty()) {
				System.out.println(linha);
			}
			
		}
		
		
	}

}

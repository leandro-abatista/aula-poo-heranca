package cursojava.main;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import cursojava.classes.Diretor;

public class ApachePOIArquivoXLS {
	
	public static void main(String[] args) throws Exception {
		
		List<Diretor> diretores = new ArrayList<>();
		//criando o arquivo
		File file = new File("C:\\ws-alex-dev-treinamento\\aula-poo-heranca\\src\\cursojava\\main\\arquivoXLS.xls");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		Diretor diretor = new Diretor();
		diretor.setNome("leandro amorim");
		diretor.setIdade(32);
		diretor.setEmail("leandro@teste.com");
		diretor.setDataNascimento("30/11/1989");
		diretor.setNumeroCpf("12345678978");
		
		Diretor diretor2 = new Diretor();
		diretor2.setNome("estefane maria");
		diretor2.setIdade(22);
		diretor2.setEmail("estefane@gmail.com");
		diretor2.setDataNascimento("22/05/1992");
		diretor2.setNumeroCpf("12345678945");
		
		Diretor diretor3 = new Diretor();
		diretor3.setNome("larissa mendes");
		diretor3.setIdade(33);
		diretor3.setEmail("larissa@hotmail.com");
		diretor3.setDataNascimento("30/05/1988");
		diretor3.setNumeroCpf("45679812312");
		
		Diretor diretor4 = new Diretor();
		diretor4.setNome("carlos rodrigues junior");
		diretor4.setIdade(28);
		diretor4.setEmail("carlos@gmail.com");
		diretor4.setDataNascimento("05/05/1995");
		diretor4.setNumeroCpf("12345612312");
		
		Diretor diretor5 = new Diretor();
		diretor5.setNome("jessica calana mendes");
		diretor5.setIdade(28);
		diretor5.setEmail("jessica@bol.com.br");
		diretor5.setDataNascimento("30/05/1994");
		diretor5.setNumeroCpf("12312312312");
		
		Diretor diretor6 = new Diretor();
		diretor6.setNome("mariana rocha tenente");
		diretor6.setIdade(32);
		diretor6.setEmail("mariana@gmail.com");
		diretor6.setDataNascimento("05/05/1990");
		diretor6.setNumeroCpf("333322233333");
		
		diretores.add(diretor);
		diretores.add(diretor2);
		diretores.add(diretor3);
		diretores.add(diretor4);
		diretores.add(diretor5);
		diretores.add(diretor6);
		
		
		//usando a biblioteca do apache poi
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();/*VAI SER USADO PARA ESCREVER NA PLANILHA*/
		/*Criando a planilha*/
		HSSFSheet linhaDiretor = hssfWorkbook.createSheet("Planilha de diretores da Empresa ArfaxTechSoft"); 
		
		//controle de linhas
		int numeroDeLinha = 0;
		//VARRENDO A LISTA DE PESSOAS
		for(Diretor d : diretores) {
			
			//PARA CADA DIRETOR, VAI SER CRIADO UMA LINHA
			Row linha = linhaDiretor.createRow(numeroDeLinha++);//criando a linha na planilha
			
			int celula = 0;
			//E PARA CADA CADA ATRIBUTO DIRETOR, VAI SER CRIADO UMA CÉLULA
			Cell celNome = linha.createCell(celula++);/*CÉLULA 1*/
			celNome.setCellValue(d.getNome());
			
			Cell celIdade = linha.createCell(celula++);/*CÉLULA 2*/
			celIdade.setCellValue(d.getIdade());
			
			Cell celEmail = linha.createCell(celula++);/*CÉLULA 3*/
			celEmail.setCellValue(d.getEmail());
			
			Cell celDataNascimenot = linha.createCell(celula++);/*CÉLULA 4*/
			celDataNascimenot.setCellValue(d.getDataNascimento());
			
			Cell celCpf = linha.createCell(celula++);/*CÉLULA 5*/
			celCpf.setCellValue(d.getNumeroCpf());
			
		}/*TERMINOU DE MONTRA A PLANILHA*/
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);/*Escreve a planilha em arquivo*/
		saida.flush();
		saida.close();
		
		System.out.println("Planilha foi criada!");
		
	}
}

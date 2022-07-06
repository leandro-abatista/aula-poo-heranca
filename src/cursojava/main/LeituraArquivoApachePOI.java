package cursojava.main;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import cursojava.classes.Diretor;

public class LeituraArquivoApachePOI {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream entredaDeDados = new FileInputStream(new File("C:\\ws-alex-dev-treinamento\\aula-poo-heranca\\src\\cursojava\\main\\arquivoXLS.xls"));
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entredaDeDados);/*PREPARA A ENTRADA DO ARQUIVO EXCEL PARA LER*/
		HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);/*PEGA A PRIMEIRA PLANILHA DO ARQUIVO EXCEL*/
		
		Iterator<Row> linhaIterator = hssfSheet.iterator();
		
		List<Diretor> diretores = new ArrayList<>();
		
		/*Enquanto tiver linha na planilha*/
		while(linhaIterator.hasNext()) {
			//pegando a linha
			Row linha = linhaIterator.next();/*Dados da pessoa na linha*/
			Iterator<Cell> celula = linha.iterator();
			
			Diretor diretor = new Diretor();
			while(celula.hasNext()) {
				Cell cell = celula.next();
				switch (cell.getColumnIndex()) {
					case 0:
						diretor.setNome(cell.getStringCellValue());
						break;
					case 1:
						diretor.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
						break;
					case 2:
						diretor.setEmail(cell.getStringCellValue());
						break;
					case 3:
						diretor.setDataNascimento(cell.getStringCellValue());
						break;
					case 4:
						diretor.setNumeroCpf(cell.getStringCellValue());
						break;
				}
			}/*Fim das celulas da linha*/
			
			diretores.add(diretor);
		}
		
		entredaDeDados.close();/*Terminou de ler o arquivo Excel*/
		
		//Com essa lista de dados poderia-se fazer muitas coisas, como: Gravar no banco de dados
		//Enviar email, enviar sms, e uma infinidade de coisas
		for (Diretor diretor : diretores) {
			System.out.println(diretor);
		}
	}
}

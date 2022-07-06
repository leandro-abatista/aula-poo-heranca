package cursojava.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePOIEditando2 {

	public static void main(String[] args) throws Exception {
		
		
		File file = new File("C:\\ws-alex-dev-treinamento\\aula-poo-heranca\\src\\cursojava\\main\\arquivoXLS.xls");
		
		FileInputStream entradaDeDados = new FileInputStream(file);
		
		@SuppressWarnings("resource")
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entradaDeDados);/*Prepara a entrada do arquivo .xls do Excel*/
		
		//Esse objeto representa a nossa planilha do excel
		HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);/*Pegando a planilha*/
		
		Iterator<Row> linhaIterator = hssfSheet.iterator();
		
		while(linhaIterator.hasNext()) {/*Enquanto tiver linha*/
			
			Row linha = linhaIterator.next();/*dados do diretor na linha*/
			
			String valorDaCelula = linha.getCell(0).getStringCellValue();
			
			linha.getCell(0).setCellValue(valorDaCelula + " *** Valor gravado na aula! - Célula editada com sucesso!");
			
		}
		
		entradaDeDados.close();
		
		FileOutputStream saidaDeDados = new FileOutputStream(file);
		hssfWorkbook.write(saidaDeDados);
		saidaDeDados.flush();
		saidaDeDados.close();
		System.out.println("Planilha Atualizada");
	}
}

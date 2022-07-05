package cursojava.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import javax.swing.JOptionPane;

import cursojava.excecao.Excecao;

public class DataChronoUnit {

	public static void main(String[] args) throws Excecao {
		
		
		try {
			Date dataPassada = new SimpleDateFormat("dd-MM-yyyy").parse("05-07-2022");
			
			Long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-07-05"), LocalDate.now());
			System.out.println("Possui :: " +dias+ " entre as faixas de datas!");
			
			System.out.println();
			
			Long meses = ChronoUnit.MONTHS.between(LocalDate.parse("2021-07-05"), LocalDate.now());
			System.out.println("Possui :: " +meses+ " meses entre as faixas de datas!");
			
			System.out.println();
			
			Long semanas = ChronoUnit.WEEKS.between(LocalDate.parse("2021-07-05"), LocalDate.now());
			System.out.println("Possui :: " +semanas+ " semanas entre as faixas de datas!");
			
			System.out.println();
			
			Long anos = ChronoUnit.YEARS.between(LocalDate.parse("2020-07-05"), LocalDate.now());
			System.out.println("Possui :: " +anos+ " anos entre as faixas de datas!");
			
			
			
		} catch (ParseException e) {
			e.printStackTrace();
			throw new Excecao(e.getMessage());
		}
	}
}

package cursojava.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {

	public static void main(String[] args) {
		
		
		LocalDate date = LocalDate.now();
		System.out.println("Data atual do sistema :: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println();
		
		System.out.println("Dia da semana :: " + date.getDayOfWeek().name());
		
		System.out.println();
		
		System.out.println("Dia do mês :: " + date.getDayOfMonth());
		
		System.out.println();
		
		System.out.println("Dia do ano :: " + date.getDayOfYear());
		
		System.out.println();
		
		System.out.println("Ano :: " + date.getYear());
		
		System.out.println();
		
		System.out.println("Número do mês de referência :: " + date.getMonthValue());
		
		System.out.println();
		
		System.out.println("Mês do ano :: " + date.getMonth());
		
		System.out.println();
		
		System.out.println("Iso :: " + date.getChronology().dateNow().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
		System.out.println();
		
		System.out.println("Iso :: " + date.getEra());

	}

}

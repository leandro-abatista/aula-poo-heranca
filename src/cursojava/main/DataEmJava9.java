package cursojava.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataEmJava9 {

	public static void main(String[] args) {
		
		
		LocalDate dataBase = LocalDate.parse("2022-07-05");
		System.out.println("Mais 5 dias :: " + dataBase.plusDays(5));//é a data atual + 5 dias
		System.out.println();
		System.out.println("Mais 5 semanas :: " + dataBase.plusWeeks(5));
		System.out.println();
		System.out.println("Mais 5 meses :: " + dataBase.plusMonths(5));
		System.out.println();
		System.out.println("Mais 5 anos :: " + dataBase.plusYears(5));
		System.out.println();
		System.out.println("Menos 1 ano :: " + dataBase.minusYears(1));
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int parcela = 1; parcela <= 12; parcela++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println("Data de vencimento do boleto :: " 
			+ dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " -- Parcela : " + parcela + " -- " 
					+ "Total de dias do mês " + dataBase.lengthOfMonth()
					+ " - " 
					+ " Quantas falta " + dataBase.lengthOfYear());
		}
	}

}

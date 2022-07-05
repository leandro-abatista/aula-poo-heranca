package cursojava.main;

import java.time.LocalDate;
import java.time.Period;

public class DataEmJavaPeriod {

	public static void main(String[] args) {
		
		
		//LocalDate dataAntiga = LocalDate.of(2018, 2, 9);
		LocalDate dataAntiga = LocalDate.parse("2019-05-02");
		
		//LocalDate dataNova = LocalDate.of(2021, 7, 4);
		LocalDate dataNova = LocalDate.parse("2022-07-05");
		
		System.out.println("Data antiga é maior que a data nova :: " + dataAntiga.isAfter(dataNova));//Depois
		System.out.println();
		System.out.println("Data antiga é anterior a nova :: " + dataAntiga.isBefore(dataNova));//Antes
		System.out.println();
		System.out.println("Datas são iguais :: " + dataAntiga.isEqual(dataNova));//Antes
		
		Period periodo = Period.between(dataAntiga, dataNova);
		System.out.println();
		System.out.println("Quantos dias :: " + periodo.getDays());
		System.out.println("Quantos meses :: " + periodo.getMonths());
		System.out.println("Quantos anos :: " + periodo.getYears());
		System.out.println();
		System.out.println("Período é :: " 
		+ periodo.getYears() + " Anos, " 
		+ periodo.getMonths() + " Meses, e " 
		+ periodo.getDays() + " dias.");
		
	}
}

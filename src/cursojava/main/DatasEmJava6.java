package cursojava.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava6 {

	public static void main(String[] args) {
		
		/*NOVA API DE DATA A PARTIR DO JAVA8*/
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual :: "+dataAtual);
		
		System.out.println();
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual :: "+horaAtual);
		
		System.out.println();
		LocalDateTime dataEHoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora atual :: "
		+ dataEHoraAtual.format(DateTimeFormatter.ISO_DATE_TIME));
		
		System.out.println();
		LocalDateTime data = LocalDateTime.now();
		System.out.println("Data e Hora atual :: "
		+ data.format(DateTimeFormatter.ISO_DATE));
		
		System.out.println();
		LocalDateTime dataAtualHora = LocalDateTime.now();
		System.out.println("Data e Hora atual :: "
		+ dataAtualHora.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
	}

}

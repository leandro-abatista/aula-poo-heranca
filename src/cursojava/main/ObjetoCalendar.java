package cursojava.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ObjetoCalendar {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance(); 
		System.out.println("Calendar em milisegundos :: "+calendar.getTimeInMillis());
		System.out.println();
		System.out.println("Dia do Mês corrente :: "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println();
		System.out.println("Dia da semana :: "+calendar.get(calendar.DAY_OF_WEEK));
		System.out.println();
		System.out.println("Hora do dia :: "+calendar.get(calendar.HOUR_OF_DAY));
		System.out.println();
		System.out.println("Hora :: "+calendar.get(calendar.HOUR));
		System.out.println();
		System.out.println("Minutos :: "+calendar.get(calendar.MINUTE));
		System.out.println();
		System.out.println("Segundos :: "+calendar.get(calendar.SECOND));
		System.out.println();
		System.out.println("Ano :: "+calendar.get(calendar.YEAR));
		System.out.println();
		
		/*++++++++++++++++++++++++FORMATANDO A DATA COM CALENDAR+++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		
		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		System.out.println("Calendar data atual em formato padrão e string :: " 
		+ sdf.format(calendar.getInstance().getTime()));
		
		
		
	}
}

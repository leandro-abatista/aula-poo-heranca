package cursojava.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import cursojava.excecao.Excecao;

public class ObjetoCalendar {

	public static void main(String[] args) throws Excecao {
		
//		Calendar calendar = Calendar.getInstance(); 
//		System.out.println("Calendar em milisegundos :: "+calendar.getTimeInMillis());
//		System.out.println();
//		System.out.println("Dia do Mês corrente :: "+calendar.get(Calendar.DAY_OF_MONTH));
//		System.out.println();
//		System.out.println("Dia da semana :: "+calendar.get(calendar.DAY_OF_WEEK));
//		System.out.println();
//		System.out.println("Hora do dia :: "+calendar.get(calendar.HOUR_OF_DAY));
//		System.out.println();
//		System.out.println("Hora :: "+calendar.get(calendar.HOUR));
//		System.out.println();
//		System.out.println("Minutos :: "+calendar.get(calendar.MINUTE));
//		System.out.println();
//		System.out.println("Segundos :: "+calendar.get(calendar.SECOND));
//		System.out.println();
//		System.out.println("Ano :: "+calendar.get(calendar.YEAR));
//		System.out.println();
//		
//		/*++++++++++++++++++++++++FORMATANDO A DATA COM CALENDAR+++++++++++++++++++++++++++++++++++++++++++++++++++++*/
//		
//		System.out.println();
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//		
//		System.out.println("Calendar data atual em formato padrão e string :: " 
//		+ sdf.format(calendar.getInstance().getTime()));
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date dataVencimentoBoleto = sdf.parse("09-07-2022");//data 1
			Date dataAtualHoje = sdf.parse("10-07-2022");// data 2
			
			//comparando datas
			//AFTER É POSTERIOR, MAIOR OU DEPOIS DATA ATUAL
			/*Se a data de vencimento é maior que a data atual*/
			if (dataVencimentoBoleto.after(dataAtualHoje)) {
				System.out.println("Boleto não vencido!");
			} else {
				System.out.println("Boleto vencido!");
			}
			
			//comparando datas
			//BEFORE É ANTES, MENOR OU IGUAL A DATA ATUAL
			/*Se a data de vencimento é menor que a data atual*/
			if (dataVencimentoBoleto.before(dataAtualHoje)) {
				System.out.println("Boleto vencido - URGENTE!");
			} else {
				System.out.println("Boleto não vencido!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Excecao(e.getMessage());
		}
	}
}

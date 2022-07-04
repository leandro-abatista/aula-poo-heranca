package cursojava.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cursojava.datas.DataEmJava;

public class ExecutavelDatas {

	public static void main(String[] args) throws ParseException {
		
		//CLASSE DATE PERTENCE AO JAVA
		Date date = new Date();
		System.out.println(date.getDate());//dia do mês
		System.out.println(date.getDay());//dia do mês
		System.out.println(date.getHours());//hora 
		System.out.println(date.getMinutes());//minutos
		System.out.println(date.getSeconds());//segundos
		System.out.println("Data em milisegundos :: "+date.getTime());//
		System.out.println("Retorna a data de 1900 + 122 = 2022 :: "+(date.getYear() + 1900));//Retorna a data atual
		System.out.println();
		/*+++++++++++++++++++++++++++++++SIMPLE DATE FORMAT++++++++++++++++++++++++++++++++++++++++++++++*/
		
		System.out.println();
		
		//FORMATANDO O OBJETO DATE, PARA NOSTRAR AO USUÁRIO
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println("Formato padrão para mostrar ao usuário final :: "+sdf.format(date));
		
		System.out.println();
		
		//FORMATO SALVO PARA BANCO DE DADOS
		
		SimpleDateFormat banco = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
		System.out.println("Formato para salvar no banco de dados :: "+banco.format(date));
		
		System.out.println();
		
		System.out.println("Retorna um objeto date :: "+sdf.parse("1989-10-18 16:06:33"));
		
		System.out.println();
		
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Retorna um objeto date :: "+sdf.parse("1989-10-18"));
	}

}

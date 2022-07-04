package cursojava.main;

import java.util.Date;

public class ExecutavelDatas {

	public static void main(String[] args) {
		
		//CLASSE DATE PERTENCE AO JAVA
		Date date = new Date();
		System.out.println(date.getDate());//dia do mês
		System.out.println(date.getDay());//dia do mês
		System.out.println(date.getHours());//hora 
		System.out.println(date.getMinutes());//minutos
		System.out.println(date.getSeconds());//segundos
		System.out.println("Data em milisegundos :: "+date.getTime());//
		System.out.println("Retorna a data de 1900 + 122 = 2022 :: "+(date.getYear() + 1900));//Retorna a data atual
		

	}

}

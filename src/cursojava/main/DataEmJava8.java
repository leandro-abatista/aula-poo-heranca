package cursojava.main;

import java.time.Duration;
import java.time.Instant;

public class DataEmJava8 {

	public static void main(String[] args) throws InterruptedException {
		
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);/*Pode ser um processo com um tempo qualquer que não conhecemos*/
		
		Instant finalData = Instant.now();
		
		Duration duracao = Duration.between(inicio, finalData);
		
		System.out.println(" Duração em nano segundos :: "+ duracao.toNanos());
		
		System.out.println(" Duração em minutos :: "+ duracao.toMinutes());
		
		System.out.println(" Duração em milisegundos :: "+ duracao.toMillis());
		
		System.out.println(" Duração em segundos :: "+ duracao.toSeconds());
		
		System.out.println(" Duração em dias :: "+ duracao.toDays());
		
		System.out.println(" Duração em horas :: "+ duracao.toHours());
		
	}
	
}

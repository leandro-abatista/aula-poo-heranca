package cursojava.main;

public class ArrayVetor {

	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados possíveis*/
		/*As posições do aray funcionam como 0 - 1, 1 - 1, 2 - 1...*/
		/*Um array de 4 notas*/
		/*Um array sempre deve ter a quantidade de posições definidas*/
		double[] notas = new double[5];/*Um array do tipo double*/
		
		notas[0] = 100;
		notas[1] = 90;
		notas[2] = 80;
		notas[3] = 70;
		
		System.out.println("Posição 0 = " + notas);
	}
}

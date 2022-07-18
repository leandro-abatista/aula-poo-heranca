package cursojava.main;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {
		
		
		String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
		/*Array pode ser de todos os tipos de dados possíveis*/
		/*As posições do aray funcionam como 0 - 1, 1 - 1, 2 - 1...*/
		/*Um array de 4 notas*/
		/*Um array sempre deve ter a quantidade de posições definidas*/
		double[] notas = new double[Integer.parseInt(posicoes)];/*Um array do tipo double*/
		
		for(int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição " + pos + "?");
			notas[pos] = Double.valueOf(valor);
		}
		
		
		
		/*length retorna um inteiro, o tamanho do array*/
		for (int posicao = 0; posicao < notas.length; posicao++) {
			System.out.println("Posição "+ (posicao + 1) +" - Nota : " + notas[posicao]);
		}
	}
}

package cursojava.classes;

public class Disciplina {

	/*cada disciplina terá quatro notas durante o ano inteiro*/
	private String nomeDisciplina;
	private Double[] nota = new Double[4];

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public Double[] getNota() {
		return nota;
	}

	public void setNota(Double[] nota) {
		this.nota = nota;
	}

	public double getMediaNotas() {
		
		double somaTotal = 0;
		
		for (int pos = 0; pos < nota.length; pos++) {
			somaTotal += nota[pos];
		}
		
		return somaTotal/4;
		
	}

}

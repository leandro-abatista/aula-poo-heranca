package cursojava.classes;

/**
 * USANDO HERANÇA COM EXTENDS 
 * CLASSE FILHA DE PESSOA
 * SECRETARIO ESTÁ EXTENDENDO DA CLASSE PESSOA
 */
public class Secretario extends Pessoa {

	private int registro;
	private String nivelCargo;
	private String experiencia;

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.idade >= 18;
	}
	
	public String msgMaiorDeIdade() {
		return this.pessoaMaiorIdade() ? "É maior de Idade" : "É menor de Idade";
	}

	@Override
	public String toString() {
		return "Secretario "
				+ "\n[registro=" + registro 
				+ "\n, nivelCargo=" + nivelCargo 
				+ "\n, experiencia=" + experiencia
				+ "\n, nome=" + nome 
				+ "\n, idade=" + idade 
				+ "\n, dataNascimento=" + dataNascimento 
				+ "\n, registroGeral=" + registroGeral 
				+ "\n, numeroCpf=" + numeroCpf 
				+ "\n, nomeMae=" + nomeMae 
				+ "\n, nomePai=" + nomePai 
				+ "\n]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.90 * 0.2;
	}
	
	

}

package cursojava.classes;

/**
 * USANDO HERANÇA COM EXTENDS 
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

}

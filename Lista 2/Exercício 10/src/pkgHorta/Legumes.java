package pkgHorta;

public class Legumes {
	
	protected  String plantio;
	protected double peso;
	protected double tamanho;

	public Legumes(String p,double pe,double t){
		plantio = p;
		peso = pe;
		tamanho = t;
	}
	
	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getPlantio() {
		return plantio;
	}

	public void setPlantio(String plantio) {
		this.plantio = plantio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}

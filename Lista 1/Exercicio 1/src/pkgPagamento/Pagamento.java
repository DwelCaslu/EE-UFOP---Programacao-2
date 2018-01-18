package pkgPagamento;

public class Pagamento {
	
	private String matricula;
	private String nome;
	private double sal_hora, sal_bas, sal_desc1 ;
	
	Pagamento(String m, String n, double s){
		matricula = m;
		nome = n;
		sal_hora=s;
	}
	
	public void salarioBasico(){
		sal_bas = 40*sal_hora;
		System.out.println("O salario Basico e: R$"+sal_bas+" reais \n");
	}
	
	public void descInss(){
		sal_desc1 = sal_bas * 0.09;
		System.out.println("O desconto do INSS sera de: R$"+(sal_desc1)+"\n" );
	}
	
	public void descIr(){
		System.out.println("O desconto do Imposto de renda sera de: R$"+((sal_bas - sal_desc1) * 0.15)+" reais\n");
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSal_hora() {
		return sal_hora;
	}

	public void setSal_hora(double salHora) {
		sal_hora = salHora;
	}

	public double getSal_bas() {
		return sal_bas;
	}

	public void setSal_bas(double salBas) {
		sal_bas = salBas;
	}

	public double getSal_desc1() {
		return sal_desc1;
	}

	public void setSal_desc1(double salDesc1) {
		sal_desc1 = salDesc1;
	}
	
	

}

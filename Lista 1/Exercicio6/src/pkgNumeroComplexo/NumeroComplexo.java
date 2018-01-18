package pkgNumeroComplexo;

public class NumeroComplexo {
	private double real;
	private double imaginaria;
	
	public NumeroComplexo(double r, double i){
		real=r;
		imaginaria=i;	
	}
	
	public void imprimeNumero(){
		System.out.println("O numero e:"+real+" + "+imaginaria+"i\n");
		
	}
	
	public boolean eIgual(NumeroComplexo numero){
		if(numero.getReal()==real && numero.getImaginaria()==imaginaria){
			return true;
		}
		else{
			return false;
		}
	}

	public void soma(NumeroComplexo numero){
		System.out.println("Soma = "+(real+numero.getReal())+"+ "+(imaginaria + numero.getImaginaria())+"i\n");
	}
    
	public void subtrai(NumeroComplexo numero){
		System.out.println("Subtração = "+(real-numero.getReal())+"+ "+(imaginaria - numero.getImaginaria())+"i\n");
	}
	public void multiplica(NumeroComplexo numero){
		System.out.println("A Multiplicação A * B = "+((real * numero.getReal())-(imaginaria * numero.getImaginaria()))+"+"+((real * numero.getImaginaria())+(imaginaria * numero.getImaginaria())+"i\n"));
	}
	public void divide(NumeroComplexo numero){
		System.out.println("A divisão de A por B = "+(((real * numero.getReal())+(imaginaria * numero.getImaginaria()))/((imaginaria*imaginaria)+(numero.getImaginaria())))+"+"+(((numero.getReal() * imaginaria)-(real * numero.getImaginaria())/((imaginaria * imaginaria)+(numero.getImaginaria() * numero.getImaginaria()) )))+"i\n");
	}
	
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
	

}

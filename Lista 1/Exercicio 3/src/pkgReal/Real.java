package pkgReal;

public class Real { 
	
	private double numero;
	private int inte;
	private double  deci;
	
	
	Real(double n){
		numero = n;
	}
	
	public void imprimeNumero(){
		System.out.println("O numero é: "+numero+"\n");
	}
	
	public void imprimePartes(){
		inte =  (int) numero ;
		deci = numero - inte ;
		System.out.println("A parte inteira do numero e :"+inte+"\n");
		System.out.println("A parte decimal do numero e :"+deci+"\n");
	}

}

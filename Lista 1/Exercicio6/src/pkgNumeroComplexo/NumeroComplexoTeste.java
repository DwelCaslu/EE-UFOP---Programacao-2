package pkgNumeroComplexo;

public class NumeroComplexoTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumeroComplexo n1= new NumeroComplexo(5,4);
		NumeroComplexo n2= new NumeroComplexo(3,2);
		
		n1.imprimeNumero();
		n2.imprimeNumero();
		
		System.out.println("Os numeros sao iguais? "+n1.eIgual(n2)+"\n");
		
		n1.soma(n2);
		n1.subtrai(n2);
		n1.multiplica(n2);
		n1.divide(n2);
	
	}

}

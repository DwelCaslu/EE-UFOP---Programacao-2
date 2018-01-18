package pkgmatriz_fabrica_loja;

public class Teste_venda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Matriz m1 = new Matriz("1234","Rua mello",1000,"Jose Barbosa");
		Fabrica f1= new Fabrica("2345","Rua da varzea",2000,10);
		Fabrica f2= new Fabrica("3456","Rua sem fim",3000,15);
		Loja l1 = new Loja("9890","Rua do beco",400,5);
		Loja l2 = new Loja("687","Rua da moitinha",5040,9);
		Loja l3 = new Loja("9870","Rua do beco",4300,2);
	
		Venda vetvenda[]= new Venda[6];
		double faturamento=0;
		
		vetvenda[0] = m1;
		vetvenda[1] = f1;
		vetvenda[2] = f2;
		vetvenda[3] = l1;        
		vetvenda[4] = l2;
		vetvenda[5] = l3;  
			         
		for(int i=0;i<6;i++){
		   faturamento = faturamento + vetvenda[i].getVenda();
		}
		
		System.out.println("O faturamento dessa empresa foi de: R$"+faturamento);
		
	}
}

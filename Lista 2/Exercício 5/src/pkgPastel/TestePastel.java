package pkgPastel;

public class TestePastel {

	public static void main(String[] args) {
		
		
		PastelCarne p1 = new PastelCarne(5,10);
		System.out.println("Preço do pastel: "+p1.calculaPreco());
		
		PastelQueijo p2 = new PastelQueijo(2,3);
		System.out.println("Preço do pastel: "+p2.calculaPreco());
		
		Pastel p3 = new PastelCarne(2,8);
		System.out.println("Preço do pastel: "+p3.calculaPreco());
		
		Pastel vetPastel[] = new Pastel[3];
		vetPastel[0]=p1;
		vetPastel[1]=p2;
		vetPastel[2]=p3;
		
		double faturamento = 0.0;
		
		for(int i = 0; i<3 ; i++)
			faturamento += vetPastel[i].calculaPreco();
		
		System.out.println("Faturamento total: "+faturamento);
		
		int contCarne = 0;
		int contQueijo = 0;
		
		for (int i = 0; i<=2; i ++){
			if(vetPastel[i] instanceof PastelCarne) contCarne++;
			else contQueijo++;
		}
		
		System.out.println("Total de pastéis de carne: "+contCarne);
		System.out.println("Total de pastéis de queijo: "+contQueijo);
	
	}
}

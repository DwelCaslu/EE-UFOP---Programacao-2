package pkgLavaRapido;

public class Teste_lavaJato {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Busca_e_traz b1 = new Busca_e_traz ("10/02/2010","Lucas",150,"Rua palmas");
		Agendamento a1 = new Agendamento ("10/02/2010","Jose",100);
		Agendamento a2 = new Agendamento ("10/02/2010","Joao",150);
		
		b1.ImprimeFicha();
		a1.ImprimeFicha();
		a2.ImprimeFicha();
		
		LavaJato vetCaixa[] = new LavaJato[3];
		vetCaixa[0]=b1;
		vetCaixa[1]=a1;
		vetCaixa[2]=a2;
		
		double faturamento = 0;
		
		for(int i=0;i<3;i++){
			faturamento= faturamento + vetCaixa[i].getPreco();
		}
		
		System.out.println("\nO caixa total será de : R$"+faturamento);

	}
}

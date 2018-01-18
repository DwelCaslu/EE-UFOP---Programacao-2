package pkg_Exercicio_6;

public class Exercicio_6 {

	public static void main(String[] args) throws MinhaExcecao{
		// TODO Auto-generated method stub
		
		int c = args.length;
		String s[] = new String[4];
		int cont = 0;
		
		System.out.println("Os argumentos sao: ");
		for(int i=0;i<4;i++){
			try{
				if(c!=4)throw (new MinhaExcecao());
				s[i] = args[i];
				System.out.println(""+s[i]);
			}
			catch(MinhaExcecao e){
				e.getMessage();
			}
		}
	
		
	}

}

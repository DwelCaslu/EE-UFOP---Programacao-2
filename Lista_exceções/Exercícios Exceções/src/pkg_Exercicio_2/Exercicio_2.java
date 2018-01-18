package pkg_Exercicio_2;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		String n1="",n2="";
		int num1=0,num2=0;
		
		try {
			n1 = args[0];
			num1 = Integer.parseInt(n1);
			
			n2 = args[1];
			num2 = Integer.parseInt(n2);
			
			System.out.println("O resultado será:"+num1/num2);
		}
		catch (ArithmeticException e) {
			System.out.println("Erro! Divisão por zero.");
		}
		catch (NumberFormatException e) {
			System.out.println("Erro! Todos os parâmetros devem ser inteiros.");
		}
		
	}

}

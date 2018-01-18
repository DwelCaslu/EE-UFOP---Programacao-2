package pkg_Exercicio_1;

import javax.swing.JOptionPane;


public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n1,n2;
		int num1=0,num2=0;
		try {
			
			n1 = JOptionPane.showInputDialog("Digite um número: ");
			num1 = Integer.parseInt(n1);
		
			n2 = JOptionPane.showInputDialog("Digite outro número: ");
			num2 = Integer.parseInt(n2);
			System.out.println("O resultado será:"+num1/num2);
		
		}
		catch (ArithmeticException e) {
			System.out.println("deu erro");
		}
	}

}

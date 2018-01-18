package pkg_Exercicio_4;

import javax.swing.JOptionPane;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		String s1,s2,maior;
		int num1=0,num2=0,tam;
		
		s1 =  args[0];
		s2 = args[1];;
		
		try {
			num1 = s1.length();
			num2 = s2.length();
			
			if(num1 != num2){
				if (num1>num2){
				maior = s1;
				tam = num1;
				}
				else{
					maior = s2;
					tam = num2;
				}
				System.out.println("A maio string e a string: "+maior+", cujo tamanho e: "+tam);
			}
			else {
				System.out.println("As strings têm o mesmo tamanho.");
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Há uma string nula!");
		}
		
		
	}

}

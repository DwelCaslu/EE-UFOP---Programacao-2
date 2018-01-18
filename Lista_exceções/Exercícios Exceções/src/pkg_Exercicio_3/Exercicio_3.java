package pkg_Exercicio_3;

import javax.swing.JOptionPane;

public class Exercicio_3 {

	
	public static void main(String[] args) {
		
		int pos;
		String posi;
		int vet[];
		
		posi = JOptionPane.showInputDialog("Digite um número: ");
		pos = Integer.parseInt(posi);
		
		try {
			vet = new int [pos];
			System.out.println("vetor declarado com sucesso!");
		} 
		catch (NegativeArraySizeException e) {
			System.out.println("Valor inválido !");
		}		
	}
}
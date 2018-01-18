package pkg_Exercicio_6;

public class MinhaExcecao extends Exception {
	
	public MinhaExcecao(){
		super("O numero de argumentos deve ser 4, a quantidade de elementos que você digitou está incorreta!");
	}
}

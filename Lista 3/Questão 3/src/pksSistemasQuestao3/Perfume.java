package pksSistemasQuestao3;

public class Perfume {
	
private int identificador;
private String nome, linha;
private double preco;

public Perfume(int id,String nom,String lin,double pre){
	identificador = id;
	nome = nom;
	linha = lin;
	preco = pre;
}
public double getPreco(){
	return preco;
}


}

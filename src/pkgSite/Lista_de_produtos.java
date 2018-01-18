package pkgSite;

 public class Lista_de_produtos {
	
	public static Produtos produtos[];
	private int tmax;
	public static int total;

	public Lista_de_produtos(int t){
		tmax = t;
		total =0;
		produtos = new Produtos[t];
		
	}
	
	public void insere(Produtos c){
		if(total == tmax) return;
		produtos[total] = c;
		total++;
	}

	public static Produtos getProdutos(int i) {
		return produtos[i];
	}

	public static void setProdutos(int i,Produtos p) {
		Lista_de_produtos.produtos[i] = p;
		total++;
	}
	public static void exclui(int i){
		int j;
		for(j=i;j<total-1;j++){
			produtos[j]=produtos[j+1];
		}
		produtos[j+1] = null;
		total--;
	}
	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Lista_de_produtos.total = total;
	}
	
	
	}
package pkgSite;

public class Lista_de_clientes {
	
	public static Cliente clientes[];
	private int tmax;
	public static int total;
	
	public Lista_de_clientes(int t){
		tmax = t;
		total =0;
		clientes = new Cliente[t];
	}
	
	public void insere(Cliente c){
		if(total == tmax) return;
		clientes[total] = c;
		total++;
	}

	public static Cliente getClientes(int i) {
		return clientes[i];
	}

	public static void setClientes(int i,Cliente c) {
		Lista_de_clientes.clientes[i] = c;
		total++;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Lista_de_clientes.total = total;
	}
	public static void exclui(int i){
		int j;
		for(j=i;j<total-1;j++){
			clientes[j]=clientes[j+1];
		}
		clientes[j+1] = null;
		total--;
	}
	
}

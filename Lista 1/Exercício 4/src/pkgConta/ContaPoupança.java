package pkgConta;

public class ContaPoupanša {
	
	private double saldo;
    private double taxa;
    
	ContaPoupanša(double s,double t){
		saldo = s;
		taxa = t;
	}
	
	public void depositar(double quantia){
		saldo = saldo + quantia;
	}
	
	public void retirar (double quantia){
		saldo = saldo - quantia;
	}
	
	public void obterSaldo(){
		System.out.println("O saldo dessa conta Ú: "+saldo+"\n");
	}
	
	public void adicionarJuros(){
		saldo = saldo + (saldo * taxa);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

}

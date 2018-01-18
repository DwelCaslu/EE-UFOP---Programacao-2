package pkgEquacao;

public class Calcula {
	
	private double a;
	private double b;
	private double c;
	private double xl;
	private double x2l;
	private double delta;
	
	Calcula(double A, double B, double C){
		a=A;
		b=B;
		c=C;
	}
	
	public void imprime_eq(){
		System.out.println("A equação e:   ("+a+")x² + ("+ b+")x +("+c+") = 0\n");	
	}
	
	public void resolve(){
		
		delta=(b*b)-(4*a*c);
		xl=(-b + (Math.sqrt(delta)))/(2*a);
		x2l=(-b - (Math.sqrt(delta)))/(2*a);
		
		System.out.println("As raízes dessa equação são: "+xl+" e "+x2l+"\n");
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getXl() {
		return xl;
	}

	public void setXl(double xl) {
		this.xl = xl;
	}

	public double getX2l() {
		return x2l;
	}

	public void setX2l(double x2l) {
		this.x2l = x2l;
	}
}
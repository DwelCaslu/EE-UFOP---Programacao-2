package pkgSite;

import javax.swing.JFrame;

public class Teste_loja {

	public static void main(String[] args) {
		
		Loja frame = new Loja();
		frame.pack();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.declara();
		frame.setVisible(true);
	
	}
}

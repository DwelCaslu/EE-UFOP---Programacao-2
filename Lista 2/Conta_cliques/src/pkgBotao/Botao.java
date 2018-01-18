package pkgBotao;

import javax.swing.*;
import java.awt.event.*;

public class Botao extends JFrame implements ActionListener{

	private JButton but;
	private JLabel texto;
	private JPanel painel;
	int cont;
	
	public Botao(){
		super("Swing Ap´plication");
		but = new JButton("Clique aqui!");
		texto = new JLabel ("Numero de cliques : 0");
		cont =0;
		painel = new JPanel();
		painel.setLayout(new BoxLayout(painel,BoxLayout.Y_AXIS));
		painel.add(but);
		painel.add(texto);
		
		but.addActionListener(this);
		getContentPane().add(painel);
	}
	public void actionPerformed(ActionEvent e){
		cont++;
		texto.setText("Number of button clicks: "+cont);
	}	
}

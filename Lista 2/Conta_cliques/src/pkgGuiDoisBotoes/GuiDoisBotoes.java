package pkgGuiDoisBotoes;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GuiDoisBotoes extends JFrame implements ActionListener{

	private JButton but1,but2;
	private JLabel texto1,texto2;
	private JPanel painel;
	private int cont1, cont2;
	
	public GuiDoisBotoes(){
		super("Teste de eventos");
		cont1 = 0;
		cont2 = 0;
		but1 = new JButton ("Botao 1");
		but2 = new JButton ("Botao 2");
		texto1 = new JLabel("Numero de clicks no Botao 1: 0");
		texto2 = new JLabel("Numero de clicks no Botao 2: 0");
	
		painel = new JPanel();
		painel.setLayout(new BoxLayout(painel,BoxLayout.Y_AXIS));
		
		painel.add(but1);
		painel.add(texto1);		
		but1.addActionListener(this);
		
		painel.add(but2);
		painel.add(texto2);
		but2.addActionListener(this);
		
		getContentPane().add(painel);
	}
	
	public void actionPerformed(ActionEvent e){
	
		if(e.getSource()==but1){
			cont1++;
			texto1.setText("Numero de clicks : "+cont1);
		}
		else if(e.getSource()==but2){
			cont2++;
			texto2.setText("Numero de clicks : "+cont2);
		}
	}
	
	
}

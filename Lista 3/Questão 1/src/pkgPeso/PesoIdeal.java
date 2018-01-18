package pkgPeso;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PesoIdeal extends JFrame{
	
	private JRadioButton rb[] = new JRadioButton[2];
	private JTextField tfAltura;
	private JLabel peso;
	
	public PesoIdeal(){
		super("Peso Ideal");
		tfAltura = new JTextField();
		
		RadioItemListener ril = new RadioItemListener();
	    ButtonGroup bg = new ButtonGroup();
		
	    rb[0] = new JRadioButton("Masculino");
	    rb[1] = new JRadioButton("Feminino");
	    
	    for (int i=0; i<2; i++) {
	        rb[i].addItemListener(ril);
	        bg.add(rb[i]);
        }
	     
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4,2,5,5));
		cp.add(new JLabel("Altura: "));
		cp.add(tfAltura);
		cp.add(new JLabel("Sexo: "));
		cp.add(rb[0]);
		cp.add(new JLabel(" ", JLabel.LEFT));
		cp.add(rb[1]);
		cp.add(new JLabel("Peso Ideal: "));
		peso = new JLabel();
	    peso.setBorder(BorderFactory.createCompoundBorder(
	         BorderFactory.createLineBorder(Color.black),
	         BorderFactory.createEmptyBorder(5, 5, 5, 5)));
	    cp.add(peso);
	}
	 private class RadioItemListener implements ItemListener {
	      public void itemStateChanged(ItemEvent e) {
	    	 double alt;
	    	 alt = Double.parseDouble(tfAltura.getText()); 
	         JRadioButton rb = (JRadioButton)e.getSource();
	         String item = rb.getText();
	         if(item == "Masculino"){
	        	 alt = (72.7 * alt) - 58;
	         }
	         else{
	        	 alt = (62.1 * alt) - 44.7;
	         }
	         peso.setText(""+alt);
	   } }
}
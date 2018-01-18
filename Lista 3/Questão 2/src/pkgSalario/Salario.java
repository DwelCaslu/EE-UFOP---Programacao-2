package pkgSalario;

import javax.swing.*;

import java.awt.*;
import javax.swing.event.*;

public class Salario extends JFrame implements ListSelectionListener{
	
	private JTextField tfNome,tfCargo,tfSalario;
	private JList lista;
	private String elem[] = {"Calcular Reajuste", "Calcular Desconto", "Calcular Salário Líquido"};
	private JPanel cp,cp2;
	
	public Salario(){
		super("Calcula Salario");
		getContentPane().add(new JScrollPane(lista=new JList(elem)), "Center");
		lista.addListSelectionListener(this);
		tfNome = new JTextField();
		tfCargo = new JTextField();
		tfSalario = new JTextField();
		
		cp = new JPanel();
		cp.setLayout(new GridLayout(4,2,10,5));
		cp.add(new JLabel("Nome"));
		cp.add(tfNome);
		cp.add(new JLabel("Cargo"));
		cp.add(tfCargo);
		cp.add(new JLabel("Salário"));
		cp.add(tfSalario);
		cp.add(new JLabel(" ", JLabel.LEFT));
		cp.add(new JLabel(" ", JLabel.LEFT));
		
		getContentPane().add(cp,BorderLayout.NORTH);
		
		cp2 = new JPanel();
		cp2.setLayout(new GridLayout(1,1,5,5));
		cp2.add(lista);
		
		getContentPane().add(cp2,BorderLayout.CENTER);
	}
	
public void valueChanged(ListSelectionEvent e) {
		double sal;
		String item;
		sal = Double.parseDouble(tfSalario.getText()); 
		
		item = (String)(lista.getSelectedValue());
		
		if(item=="Calcular Reajuste"){
			sal = sal * 1.38;
		}
		else if(item=="Calcular Desconto"){
			sal = (sal * 1.38)- (sal * 0.15);
		}
		else if(item=="Calcular Salário Líquido"){
			sal = (sal * 1.38)- (sal * 0.15);
		}
		JOptionPane.showMessageDialog(null,"Nome: "+tfNome.getText()+"\nCargo: "+tfCargo.getText()+"\nSalário: "+sal+"\nInformação Solicitada: "+item);
	
	}
	
	

}

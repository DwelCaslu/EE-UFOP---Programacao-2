package pkgSite;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Loja extends JFrame{  
	
	public static Lista_de_clientes listac;
	public static Lista_de_produtos listap;
	private JTextField tfBusca;
	private JButton BBuscar,BHome,BProdutos,BCadastraC,BExcluiC,BCadastraP,BExcluiP,BIncluiI,BExcluiI,BFinaliza;
	private JLabel LArea,LFinal;
	private JList Carrinho, LiTela,LiBusca;
	private JRadioButton rb[] = new JRadioButton[3];
	private JPanel painel,painel2,painel3,painel4;
	private String produtostela[] = new String[1500];
	public static Produtos vet[] = new Produtos[500];
	public static Cliente vet2[] = new Cliente[500];
	private String carrinho[] = new String[500];
	private int cont=0,incl= -1;
	
	private JTextField tfnome,tfcpf,tfcpf2, tfnasc, tftel, tfend,tfnomep,tfnomep2,tfquantidade,tfpreco,tfnumero,tftipo,tftecido,tfcor,tfnumero2; 
	private JFrame cadastrac,excluic,cadastrap,excluip;
	private JButton okp1,okp2,okc1,okc2;
	private JPanel p1,p2,p3,p4;
	private JTabbedPane tabs;
	
	public Loja(){
		super("Oiapoque On-line");
		//parte referente às janelas secundárias
		okp1 = new JButton("OK");
		okp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    	okp1();
	    }});
		okp2 = new JButton("OK");
		okp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    	okp2();
	    }});
		okc1 = new JButton("OK");
		okc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    	okc1();
	    }});
		okc2 = new JButton("OK");
		okc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    	okc2();
	    }});
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		
		tfnome = new JTextField();
		tfcpf = new JTextField();
		tfnasc = new JTextField();
		tftel = new JTextField();
		tfend = new JTextField();
		
		tfcpf2 = new JTextField();
		
		tfnomep = new JTextField();
		tfnomep2 = new JTextField();
		tfquantidade = new JTextField();
		tfpreco = new JTextField();
		tfnumero = new JTextField();
		tftipo = new JTextField();
		tftecido = new JTextField();
		tfcor = new JTextField();
		tfnumero2 = new JTextField(); 
		//termina aki
		
		//parte referente à janela principal
		
		BBuscar = new JButton("Buscar");
		BBuscar.setPreferredSize(new Dimension(120,30));
		BBuscar.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            Buscar();
	      }});
		
		BHome = new JButton("Home");
		BHome.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            Home();
	      }});
		
		BProdutos = new JButton("Visualizar Produtos");
		BProdutos.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            Produtos();
	      }});
		
		BCadastraC = new JButton("Cadastrar Cliente");
		BCadastraC.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            CadastraC();
	      }});
		
		BExcluiC = new JButton("Excluir Cliente");
		BExcluiC.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            ExcluiC();
	      }});
		
		BCadastraP = new JButton("Cadastrar Produto");
		BCadastraP.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            CadastraP();
	      }});
		
		BExcluiP = new JButton("Excluir Produto");
		BExcluiP.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            ExcluiP();
	      }});
		
		BIncluiI = new JButton("Incluir Item");
		BIncluiI.setMinimumSize(new Dimension(180,40));
		BIncluiI.setPreferredSize(new Dimension(180,40));
		BIncluiI.setMaximumSize(new Dimension(180,40));
		BIncluiI.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            IncluiI();
	      }});
		
		BExcluiI = new JButton("Excluir Item");
		BExcluiI.setMinimumSize(new Dimension(180,40));
		BExcluiI.setPreferredSize(new Dimension(180,40));
		BExcluiI.setMaximumSize(new Dimension(180,40));
		BExcluiI.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            ExcluiI();
	      }});
		
		BFinaliza = new JButton("Finalizar Compras");
		BFinaliza.setMinimumSize(new Dimension(180,40));
		BFinaliza.setPreferredSize(new Dimension(180,40));
		BFinaliza.setMaximumSize(new Dimension(180,40));
		BFinaliza.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            FinalizaI();
	      }});
	
		
		tfBusca = new JTextField(50);
		tfBusca.setPreferredSize(new Dimension(50,30));
		
		Carrinho = new JList();
		Carrinho.setMinimumSize(new Dimension(180,60));
		Carrinho.setPreferredSize(new Dimension(180,600));
		Carrinho.setMaximumSize(new Dimension(180,2000));
		Carrinho.setBorder(BorderFactory.createCompoundBorder(
		BorderFactory.createLineBorder(Color.black),
		BorderFactory.createEmptyBorder(180,60, 5, 5)));
		
		LArea = new JLabel(new ImageIcon("images/back.jpg"), JLabel.LEFT);
		LArea.setBorder(BorderFactory.createCompoundBorder(
		BorderFactory.createLineBorder(Color.black),
		BorderFactory.createEmptyBorder(0,0, 0, 0)));
		JLabel LFinal = new JLabel();
		
		JList LiTela = new JList();
		LiTela.setMinimumSize(new Dimension(933,694));
		LiTela.setPreferredSize(new Dimension(933,694));
		LiTela.setMaximumSize(new Dimension(1500,10000));
		LiTela.setBorder(BorderFactory.createCompoundBorder(
		BorderFactory.createLineBorder(Color.black),
		BorderFactory.createEmptyBorder(0,0, 0, 0)));
		
	    ButtonGroup bg = new ButtonGroup();
	    for(int i =0;i<3;i++){
	    	rb[i]= new JRadioButton();
	    	bg.add(rb[i]);
	    }
	
		painel = new JPanel(new GridLayout( 13, 1, 5, 5));
		painel.add(BHome);
		painel.add(new JLabel(" ", JLabel.LEFT));
		painel.add(new JLabel(" ", JLabel.LEFT));
		painel.add(new JLabel(" ", JLabel.LEFT));
		painel.add(BProdutos);
		painel.add(new JLabel(" ", JLabel.LEFT));
		painel.add(new JLabel(" ", JLabel.LEFT));
		painel.add(new JLabel(" ", JLabel.LEFT));
		painel.add(BCadastraC);
		painel.add(BExcluiC);
		painel.add(BCadastraP);
		painel.add(BExcluiP);
		painel.add(new JLabel(" ", JLabel.LEFT));
		
		
		painel2 = new JPanel(new FlowLayout());
		painel2.add(new JLabel("                    "));
		painel2.add(tfBusca);
		painel2.add(BBuscar);
		painel2.add(new JLabel("   Selecione o grupo:   "));
		painel2.add(rb[0]);
		painel2.add(new JLabel("Calçado  "));
		painel2.add(rb[1]);
		painel2.add(new JLabel("Cama  "));
		painel2.add(rb[2]);
		painel2.add(new JLabel("Confecções  "));
		
		painel3 = new JPanel();
		painel3.setLayout(new BoxLayout(painel3,BoxLayout.Y_AXIS));
		painel3.add(LArea);
		
		painel4 = new JPanel();
		painel4.setLayout(new BoxLayout(painel4,BoxLayout.Y_AXIS));
		painel4.add(BIncluiI);
		painel4.add(BExcluiI);
		painel4.add(new JLabel(" "));
		painel4.add(new JLabel("       Produtos selecionados: "));
		painel4.add(new JLabel(" "));
		JScrollPane pane = new JScrollPane(Carrinho);
		painel4.add(pane);
		pane.setAlignmentX(LEFT_ALIGNMENT);
		pane.setMinimumSize(new Dimension(180,500));
		pane.setPreferredSize(new Dimension(180,500));
		pane.setMaximumSize(new Dimension(180,2000));
		painel4.add(new JLabel(" "));
		painel4.add(BFinaliza);
		painel4.add(new JLabel(" "));
		
		
		getContentPane().add(painel,BorderLayout.WEST);
		getContentPane().add(painel2,BorderLayout.NORTH);
		getContentPane().add(painel3,BorderLayout.CENTER);
		getContentPane().add(painel4,BorderLayout.EAST);
		
	}	 
	
	
	
	public void Buscar() {
		int achou = 0;
		produtostela = new String[1500];
		StringBuffer sb = new StringBuffer();
		int i,j,m = -1,c,t;
		JTextField aux = new JTextField();
		String p = null,aux2 = aux.getText();
		p = tfBusca.getText();
		
		for(j = 0;j<listap.getTotal();j++){
			vet[j] = listap.getProdutos(j);
		}
		
		for	(i=0;i<3;i++){
			if(rb[i].isSelected()){
				m = i;
			}
		}
		if(m == -1){
			JOptionPane.showMessageDialog(null,"Selecione um grupo de Busca!");
			achou=2;
		}
		else if(p.equals(aux2)){
			JOptionPane.showMessageDialog(null,"Entre com o nome do produto a ser procurado!");
			achou=2;
		}
		else if(m==0){
			for( i = 0; vet[i] != null;i++){
				if (vet[i] instanceof calcado && vet[i].getProduto().equals(p)){
					achou++;
					for(j = 0; j < 20;j++){
						sb.append(" ");	
					}
						sb.append(vet[i].getProduto());
						c = vet[i].getProduto().length();
						c = 70 - c ;
						for(t = 0; t<c;t++){
							sb.append(" ");	
						}
						sb.append("Preço:");
						sb.append(vet[i].getPreco());
						sb.append("           Quantidade desponível:          ");
						sb.append(vet[i].getQuantidade());
					aux2 = sb.toString();
					produtostela[i*3] = aux2 ;
					
				}
			}
		}
		
		else if(m==1){
			for( i = 0; vet[i] != null;i++){
				if (vet[i] instanceof cama && vet[i].getProduto().equals(p)){
					achou++;
					for(j = 0; j < 20;j++){
						sb.append(" ");	
					}
						sb.append(vet[i].getProduto());
						c = vet[i].getProduto().length();
						c = 70 - c ;
						for(t = 0; t<c;t++){
							sb.append(" ");	
						}
						sb.append("Preço:");
						sb.append(vet[i].getPreco());
						sb.append("           Quantidade desponível:          ");
						sb.append(vet[i].getQuantidade());
					aux2 = sb.toString();
					produtostela[i*3] = aux2 ;
				}
			}
		}
		
		else {
			for( i = 0; vet[i] != null;i++){
				if (vet[i] instanceof confeccao && vet[i].getProduto().equals(p)){
					achou++;
					for(j = 0; j < 20;j++){
						sb.append(" ");	
					}
						sb.append(vet[i].getProduto());
						c = vet[i].getProduto().length();
						c = 70 - c ;
						for(t = 0; t<c;t++){
							sb.append(" ");	
						}
						sb.append("Preço:");
						sb.append(vet[i].getPreco());
						sb.append("           Quantidade desponível:          ");
						sb.append(vet[i].getQuantidade());
					aux2 = sb.toString();
					produtostela[i*3] = aux2 ;
				}
			}
		}
		
		
		painel3.removeAll();
		painel3.setLayout(new BoxLayout(painel3,BoxLayout.Y_AXIS));
		LiTela = new JList(produtostela);
		JScrollPane pane = new JScrollPane(LiTela);
		painel3.add(pane);
		painel3.repaint();
		painel3.revalidate();
		
		if(achou == 0){
			JOptionPane.showMessageDialog(null,"Nenhum Produto encontrado!");
		}
		else if(achou == 2){
			Home();
		}
	}
	
	public void Home() {
		painel3.removeAll();
		painel3.setLayout(new BoxLayout(painel3,BoxLayout.Y_AXIS));
		painel3.add(LArea);
		painel3.repaint();
		painel3.revalidate();
	}
	
	public void Produtos() {
		produtostela = new String[1500];
		String a = null;
		int t,c;
		StringBuffer sb ;
		for(int j = 0;j<listap.getTotal();j++){
			vet[j] = listap.getProdutos(j);
		}
		for(int i = 0; i < listap.getTotal();i++){
			sb = new StringBuffer();
			for(t = 0; t < 20;t++){
				sb.append(" ");	
			}
				sb.append(vet[i].getProduto());
				c = vet[i].getProduto().length();
				c = 70 - c ;
				for(t = 0; t<c;t++){
					sb.append(" ");	
				}
				sb.append(" Preço: ");
				sb.append(vet[i].getPreco());
				sb.append("           Quantidade disponível:          ");
				sb.append(vet[i].getQuantidade());
			a = sb.toString();
			produtostela[i*3] = a ;
		}
		painel3.removeAll();
		painel3.setLayout(new BoxLayout(painel3,BoxLayout.Y_AXIS));
		LiTela = new JList(produtostela);
		JScrollPane pane = new JScrollPane(LiTela);
		painel3.add(pane);
		painel3.repaint();
		painel3.revalidate();
		
	}
	
	public void CadastraC() {
		if(cadastrac != null){
			cadastrac.setVisible(false);
		}
		tfnome = new JTextField();
		tfcpf = new JTextField();
		tfnasc = new JTextField();
		tftel = new JTextField();
		tfend = new JTextField();
		cadastrac = new JFrame();
		cadastrac.setTitle("Cadastrar Clientes");
		cadastrac.setMinimumSize(new Dimension(550,350));
		cadastrac.setPreferredSize(new Dimension(550,350));
		cadastrac.setMaximumSize(new Dimension(550,350));
		cadastrac.setLocation(350, 250);
		p1.removeAll();
		p1 = new JPanel();
		p1.setLayout(new GridLayout(6,2,5,5));
		p1.add(new JLabel("Nome: "));
		p1.add(tfnome);
		p1.add(new JLabel("CPF: "));
		p1.add(tfcpf);
		p1.add(new JLabel("Data de nascimento: "));
		p1.add(tfnasc);
		p1.add(new JLabel("Telefone: "));
		p1.add(tftel);
		p1.add(new JLabel("Endereço: "));
		p1.add(tfend);
		p1.add(new JLabel(" "));
		p1.add(okc1);
		cadastrac.setContentPane(p1);
		cadastrac.pack();
		cadastrac.setVisible(true);	
	}
	
	public void ExcluiC() {
		if(excluic != null){
			excluic.setVisible(false);
		}
		tfcpf2 = new JTextField();
		excluic = new JFrame();
		excluic.setTitle("Excluir cliente");
		excluic.setMinimumSize(new Dimension(350,180));
		excluic.setPreferredSize(new Dimension(350,180));
		excluic.setMaximumSize(new Dimension(350,180));
		excluic.setLocation(350, 250);
		p2.removeAll();
		p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
		p2.add(new JLabel("          "));
		p2.add(new JLabel("            Digite o CPF do cliente que deseja excluir: "));
		p2.add(new JLabel("          "));
		tfcpf2.setMinimumSize(new Dimension(300,40));
		tfcpf2.setPreferredSize(new Dimension(300,40));
		tfcpf2.setMaximumSize(new Dimension(300,40));
		tfcpf2.setAlignmentX(LEFT_ALIGNMENT);
		p2.add(tfcpf2);
		p2.add(new JLabel("         "));
		okc2.setAlignmentX(CENTER_ALIGNMENT);
		p2.add(okc2);
		okc2.setAlignmentX(CENTER_ALIGNMENT);
		excluic.setContentPane(p2);
		excluic.pack();
		excluic.setVisible(true);	
		
	}
	
	public void CadastraP() {
		Produtos();
		Home();
		if(cadastrap != null){
			cadastrap.setVisible(false);
		}
		cadastrap = new JFrame();
		cadastrap.setTitle("Cadastrar novo produto");
		cadastrap.setMinimumSize(new Dimension(700,500));
		cadastrap.setPreferredSize(new Dimension(700,500));
		cadastrap.setMaximumSize(new Dimension(700,500));
		cadastrap.setLocation(300, 150); 
		
		tfnomep = new JTextField();
		tfnomep2 = new JTextField();
		tfquantidade = new JTextField();
		tfpreco = new JTextField();
		tfnumero = new JTextField();
		tftipo = new JTextField();
		tftecido = new JTextField();
		tfcor = new JTextField();
		tfnumero2 = new JTextField(); 
		
		p3.removeAll();
		p3 = new JPanel();
		p3.setLayout(new GridLayout(9,3,20,10));
		p3.add(new JLabel(" "));
		p3.add(new JLabel("     Entre com os dados do produto : "));
		p3.add(new JLabel(" "));
		p3.add(new JLabel("                Nome : "));
		p3.add(new JLabel("                Quantidade : "));
		p3.add(new JLabel("                Preço : "));
		p3.add(tfnomep);
		p3.add(tfquantidade);
		p3.add(tfpreco);
		p3.add(new JLabel("                      CAMA : "));
		p3.add(new JLabel("                      CONFECÇÕES : "));
		p3.add(new JLabel("                      CALÇADOS : "));
		p3.add(new JLabel("       Tipo (Casal ou solteiro) :"));
		p3.add(new JLabel("       Número : "));
		p3.add(new JLabel("       Número :"));
		p3.add(tftipo);
		p3.add(tfnumero);
		p3.add(tfnumero2);
		p3.add(new JLabel(" "));
		p3.add(new JLabel("     Tecido :"));
		p3.add(new JLabel("     Cor :"));
		p3.add(new JLabel(" "));
		p3.add(tftecido);
		p3.add(tfcor);
		p3.add(new JLabel(" "));
		p3.add(okp1);
		p3.add(new JLabel(" "));
	    
	    cadastrap.setContentPane(p3);
	    cadastrap.pack();
		cadastrap.setVisible(true);	
	}
	
	public void ExcluiP() { 
		if(excluip != null){
			excluip.setVisible(false);
		}
		tfnomep2 = new JTextField();
		excluip = new JFrame();
		excluip.setTitle("Excluir produto");
		excluip.setMinimumSize(new Dimension(350,180));
		excluip.setPreferredSize(new Dimension(350,180));
		excluip.setMaximumSize(new Dimension(350,180));
		excluip.setLocation(350, 250);
		p4.removeAll();
		p4 = new JPanel();
		p4.setLayout(new BoxLayout(p4,BoxLayout.Y_AXIS));
		p4.add(new JLabel("          "));
		p4.add(new JLabel("            Digite o nome do produto que deseja excluir: "));
		p4.add(new JLabel("          "));
		tfnomep2.setMinimumSize(new Dimension(300,40));
		tfnomep2.setPreferredSize(new Dimension(300,40));
		tfnomep2.setMaximumSize(new Dimension(300,40));
		tfnomep2.setAlignmentX(LEFT_ALIGNMENT);
		p4.add(tfnomep2);
		p4.add(new JLabel("         "));
		okp2.setAlignmentX(CENTER_ALIGNMENT);
		p4.add(okp2);
		okp2.setAlignmentX(CENTER_ALIGNMENT);
		excluip.setContentPane(p4);
		excluip.pack();
		excluip.setVisible(true);	
	
		 
	}
	
	public void IncluiI() {
		int c = -1;
			c = LiTela.getSelectedIndex();
		if(c<0){
			JOptionPane.showMessageDialog(null,"Selecione o item a ser incluído!");
		}
		else{
			c = c /3;
			carrinho[cont] = vet[c].getProduto().toString();
			vet[c].setQuantidade(vet[c].getQuantidade()-1);
			if(vet[c].getQuantidade() <0){
				JOptionPane.showMessageDialog(null,"O produto selecionado não se encontra mais disponível !");
				vet[c].setQuantidade(0);
			}
			else{
				cont++;
				Carrinho = new JList(carrinho);
				painel4.removeAll();
				painel4.add(BIncluiI);
				painel4.add(BExcluiI);
				painel4.add(new JLabel(" "));
				painel4.add(new JLabel("       Produtos selecionados: "));
				painel4.add(new JLabel(" "));
				JScrollPane pane = new JScrollPane(Carrinho);
				painel4.add(pane);
				pane.setAlignmentX(LEFT_ALIGNMENT);
				pane.setMinimumSize(new Dimension(180,500));
				pane.setPreferredSize(new Dimension(180,500));
				pane.setMaximumSize(new Dimension(180,2000));
				painel4.add(new JLabel(" "));
				painel4.add(BFinaliza);
				painel4.add(new JLabel(" "));
				painel4.repaint();
				painel4.revalidate();
			}
			Produtos();
		}
	}
	
	public void ExcluiI() {
		int c;
		c = Carrinho.getSelectedIndex();
		if(c==-1){
			JOptionPane.showMessageDialog(null,"Primeiro selecione o item a ser excluído do Carrinho de compras!");
		}
		else{
			for(int i=0;vet[i]!=null;i++){
				if(vet[i].getProduto().equals(carrinho[c])){
					vet[i].setQuantidade(vet[i].getQuantidade()+1);
				}
			}
			for(int i=c; i<carrinho.length-1;i++){
				carrinho[i]=carrinho[i+1];
			}
			cont--;
			Carrinho = new JList(carrinho);
			painel4.removeAll();
			painel4.add(BIncluiI);
			painel4.add(BExcluiI);
			painel4.add(new JLabel(" "));
			painel4.add(new JLabel("       Produtos selecionados: "));
			painel4.add(new JLabel(" "));
			JScrollPane pane = new JScrollPane(Carrinho);
			painel4.add(pane);
			pane.setAlignmentX(LEFT_ALIGNMENT);
			pane.setMinimumSize(new Dimension(180,500));
			pane.setPreferredSize(new Dimension(180,500));
			pane.setMaximumSize(new Dimension(180,2000));
			painel4.add(new JLabel(" "));
			painel4.add(BFinaliza);
			painel4.add(new JLabel(" "));
			painel4.repaint();
			painel4.revalidate();
			Produtos();
		}
	}
	
	public void FinalizaI() {
		JTextField aux = new JTextField();
		String aux2 = aux.getText();
		double preco[] = new  double[cont];
		int quanti[] = new int[cont];
		int l = 5;
		int i,j,quant=0,conta=0,co;
		double soma=0;
		String a ;
		String nome = null;
		
		a = JOptionPane.showInputDialog(null," Digite seu CPF, por favor.");
	    
		for( i=0;i<listac.getTotal();i++){
			vet2[i] = listac.getClientes(i);
		}
		co=0;
		for(i=0; vet2[i]!=null;i++){
			if(vet2[i].getCpf().equals(a)){
				co=1;
			}
		}
		
		i =0;
			for(j=0;j<cont;j++){
				if(carrinho[j]!= null){
					i++;
				}
			}
		
		if (a == null){
			
		}
		else if (a .equals(aux2)){
			JOptionPane.showMessageDialog(null,"Campo Vazio!");
			FinalizaI();
		}
		
		else if(i==0){
			JOptionPane.showMessageDialog(null,"Nenhum produto foi selecionado!");
		}
		else if(co == 0){
			JOptionPane.showMessageDialog(null,"CPF não cadastrado! favor cadastrar-se!");
			CadastraC();
		}
		else{
		for(i=0;i<listac.getTotal();i++){
			if(vet2[i].getCpf().equals(a)){
				nome = vet2[i].getNome();
				break;
			}
		}
		for( i=0;i<listap.getTotal();i++){
			vet[i] = listap.getProdutos(i);
		}
		for(i=0;i<cont;i++){
			quanti[i] = 1;
			for(j=0;vet[j]!=null;j++){
				if(carrinho[i].equals(vet[j].getProduto())){
					preco[i]=vet[j].getPreco();
					soma = soma + preco[i];
				}
			}
		}
			
		for(i=0;i<cont;i++){
			quant =0;
			aux2 = carrinho[i];
			for(j=0;j<cont;j++){
				if(aux2.equals(carrinho[j])){
					quant ++;
				}
				if(quant>1){
					for(co=j;co<cont-1;co++){
						carrinho[co]=carrinho[co+1];
						preco[co]=preco[co+1];
						quanti[co] = quanti[co+1];
					}
					cont--;
					j--;
					quant = 1;
					quanti[i]++;
				}

			}
			//quanti[i] = quant;
		}
		l = l + cont;
		painel3.removeAll();
		painel3.setLayout(new GridLayout(l,7,10,10));
		painel3.setBorder(BorderFactory.createCompoundBorder(
		BorderFactory.createLineBorder(Color.black),
		BorderFactory.createEmptyBorder(0,0, 0, 0)));
		
		for(i=0;i<8;i++){
			painel3.add(new JLabel(" "));
		}
		painel3.add(new JLabel(" "));
		painel3.add(new JLabel(" NOME: "));
		painel3.add(new JLabel(" "+nome));
		painel3.add(new JLabel(" CPF: "));
		painel3.add(new JLabel(" "+a));
		painel3.add(new JLabel(" "));
		for(i=0;i<2;i++){
			painel3.add(new JLabel(" "));
		}
		painel3.add(new JLabel(" PRODUTO: "));
		painel3.add(new JLabel(" QUANTIDADE: "));
		painel3.add(new JLabel(" PREÇO UNITÁRIO: "));
		for(i=0;i<2;i++){
			painel3.add(new JLabel(" "));
		}
		for(i=0;i<cont;i++){
			for(j=0;j<2;j++){
				painel3.add(new JLabel(" "));
			}
			painel3.add(new JLabel(""+carrinho[i]));
			painel3.add(new JLabel("             "+quanti[i]));
			painel3.add(new JLabel("             "+preco[i]));
			for(j=0;j<2;j++){
				painel3.add(new JLabel(" "));
			}
		}
		painel3.add(new JLabel(" "));
		painel3.add(new JLabel(" "));
		painel3.add(new JLabel(" VALOR TOTAL: "));
		painel3.add(new JLabel("        "+soma));
		for(j=0;j<10;j++){
			painel3.add(new JLabel(" "));
		}
		painel3.repaint();
		painel3.revalidate();
		
		carrinho = new String[500];
		JOptionPane.showMessageDialog(null,"Compra realizada com sucesso!");
		Carrinho = new JList(carrinho);
		painel4.removeAll();
		painel4.add(BIncluiI);
		painel4.add(BExcluiI);
		painel4.add(new JLabel(" "));
		painel4.add(new JLabel("       Produtos selecionados: "));
		painel4.add(new JLabel(" "));
		JScrollPane pane = new JScrollPane(Carrinho);
		painel4.add(pane);
		pane.setAlignmentX(LEFT_ALIGNMENT);
		pane.setMinimumSize(new Dimension(180,500));
		pane.setPreferredSize(new Dimension(180,500));
		pane.setMaximumSize(new Dimension(180,2000));
		painel4.add(new JLabel(" "));
		painel4.add(BFinaliza);
		painel4.add(new JLabel(" "));
		painel4.repaint();
		painel4.revalidate();
		
		cont=0;
		}
	}
	public void okc1() {
		int comp = 1,comp2 =0;
		JTextField aux = new JTextField();
		String aux2 = aux.getText();	
		String a ,b,c,d,e;
		
		a = tfnome.getText();
		if(tfnome.getText().equals(aux2)){
			comp2++;
		}
		b = tfcpf.getText();
		if(tfcpf.getText().equals(aux2)){
			comp2++;
		}
		c = tfnasc.getText();
		if(tfnasc.getText().equals(aux2)){
			comp2++;
		}
		d = tftel.getText();
		if(tftel.getText().equals(aux2)){
			comp2++;
		}
		e = tfend.getText();
		if(tfend.getText().equals(aux2)){
			comp2++;
		}
		
		for(int i=0;i<listac.getTotal();i++){
			vet2[i] = listac.getClientes(i);
		}
		
		for(int j=0;j<listac.getTotal();j++){
			if(vet2[j].getCpf().equals(b)){
				comp = 0; 
			}
		}
		if(comp2 != 0){
			JOptionPane.showMessageDialog(null,"Campo Vazio!");
			CadastraC();
		}
		else if(comp == 0){
			cadastrac.setVisible(false);
			JOptionPane.showMessageDialog(null,"CPF já cadastrado!");
			CadastraC();
		}
		else if (comp == 1){
			cadastrac.setVisible(false);
			listac.setClientes(listac.getTotal(), new Cliente(a,c,d,e,b));
			JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!");
		}
	}
	
	public void okc2() {
		JTextField aux = new JTextField();
		String aux2 = aux.getText();	
		String a = tfcpf2.getText();
		int i,b=0;
		
		for( i=0;i<listac.getTotal();i++){
			vet2[i] = listac.getClientes(i);
		}
		
		for( i=0;vet2[i]!=null;i++){
			if(a.equals(vet2[i].getCpf())){
				b++;
			}	
		}
		
		if(a.equals(aux2)){
			JOptionPane.showMessageDialog(null,"Campo vazio!");
			ExcluiC();
		}
	
		else if(b==0){
			JOptionPane.showMessageDialog(null,"CPF não encontrado!");
			ExcluiC();
		}
		else{
			for( i=0;i<listac.getTotal();i++){
				if(a.equals(vet2[i].getCpf())){
					b=i;
				}	
			}
			listac.exclui(b);
			
			JOptionPane.showMessageDialog(null,"Cliente excluído com sucesso!");
			excluic.setVisible(false);
		}
	}
	//tfnomep,tfnomep2,tfquantidade,tfpreco,tfnumero,tftipo,tftecido,tfcor,tfnumero2; 
	public void okp1() {
		
		JTextField aux = new JTextField();
		String aux2 = aux.getText();
		String a = tfnomep.getText(),b = tfquantidade.getText(),c = tfpreco.getText(),d = tftipo.getText(),e = tfnumero.getText(),f = tftecido.getText(),g = tfnumero2.getText(),h = tfcor.getText();	
		int b1 = 0, marc = 0,conf=0;
		double c1=0;
		try{
		if(!b.equals(aux2)){
			b1 = Integer.parseInt(tfquantidade.getText());
		}
		if(!c.equals(aux2)){
			c1 = Double.parseDouble(tfpreco.getText());
		}
		
			if(a.equals(aux2) && b.equals(aux2) && c.equals(aux2) && d.equals(aux2) && e.equals(aux2) && f.equals(aux2) && g.equals(aux2) && h.equals(aux2)){
				JOptionPane.showMessageDialog(null,"Nenhum item foi preenchido !");
				CadastraP();
				marc = 1;
			}
			else if(a.equals(aux2) || b.equals(aux2) || c.equals(aux2)){
				JOptionPane.showMessageDialog(null,"Há campos não preenchidos !");
				CadastraP();
				marc = 1;
			}
			else if(tftipo.getText().equals(aux2) && (tfnumero.getText().equals(aux2) || tftecido.getText().equals(aux2)) && (tfnumero2.getText().equals(aux2) || tfcor.getText().equals(aux2))){
				JOptionPane.showMessageDialog(null,"A sequência de valores preenchida é inválida!");
				CadastraP();
				marc = 1;
			}
			else if(!tftipo.getText().equals(aux2) && (tfnumero.getText().equals(aux2) && tftecido.getText().equals(aux2)) && (tfnumero2.getText().equals(aux2) && tfcor.getText().equals(aux2))){

				for(int i=0;i<listap.getTotal();i++){
					if(vet[i].getProduto().equals(a)){
						vet[i].setPreco(c1);
						vet[i].setQuantidade(vet[i].getQuantidade()+b1);
						conf =1;
						listap.setProdutos(i,vet[i]);
						listap.setTotal(listap.getTotal()-1);
						break;
					}
				}
				if (conf == 0){
					listap.setProdutos(listap.getTotal(), new cama(a,b1,c1,d));
				}
				JOptionPane.showMessageDialog(null,"Produto da classe Cama cadastrado com sucesso!");
			}
			else if( (!tfnumero.getText().equals(aux2) && !tftecido.getText().equals(aux2))&& ((tftipo.getText().equals(aux2)) && (tfnumero2.getText().equals(aux2) && tfcor.getText().equals(aux2)))){
				
				int e1 = Integer.parseInt(tfnumero.getText());
				
				for(int i=0;i<listap.getTotal();i++){
					if(vet[i].getProduto().equals(a)){
						vet[i].setPreco(c1);
						vet[i].setQuantidade(vet[i].getQuantidade()+b1);
						conf =1;
						break;
					}
				}
				if (conf == 0){
					listap.setProdutos(listap.getTotal(), new confeccao(a,b1,c1,e1,f));
				}
				JOptionPane.showMessageDialog(null,"Produto da classe Confecções cadastrado com sucesso!");
			}
			else {
				
				int g1 = Integer.parseInt(tfnumero2.getText());
				
				for(int i=0;i<listap.getTotal();i++){
					if(vet[i].getProduto().equals(a)){
						vet[i].setPreco(c1);
						vet[i].setQuantidade(vet[i].getQuantidade()+b1);
						conf =1;
						break;
					}
				}
				if (conf == 0){
					listap.setProdutos(listap.getTotal(), new calcado(a,b1,c1,h,g1));
				}
				JOptionPane.showMessageDialog(null,"Produto da classe Calçado cadastrado com sucesso!");
			}
		}

		catch(Exception erro){
			JOptionPane.showMessageDialog(null,"O preenchimento dos dados está incorreto!");
			marc = 1;
		}
			
			if(marc == 0){
				Produtos();
				cadastrap.setVisible(false);	
			}
	}
	
	public void okp2() {
		
		JTextField aux = new JTextField();
		String aux2 = aux.getText();	
		String a;
		a = tfnomep2.getText();
		int i,b;
		b=0;
		
		for( i=0;i<listap.getTotal();i++){
			vet[i] = listap.getProdutos(i);
		}
		
		for( i=0;vet[i]!=null;i++){
			if(a.equals(vet[i].getProduto())){
				b++;
			}	
		}
		
		if(a.equals(aux2)){
			JOptionPane.showMessageDialog(null,"Campo vazio!");
			ExcluiP();
		}
	
		else if(b==0){
			JOptionPane.showMessageDialog(null,"Nome não encontrado!");
			ExcluiP();
		}
		else{
			for( i=0;i<listap.getTotal();i++){
				if(a.equals(vet[i].getProduto())){
					b=i;
					break;
				}	
			}
			listap.exclui(b);
			Produtos();
			JOptionPane.showMessageDialog(null,"Produto excluído com sucesso!");
		}
		Produtos();
		excluip.setVisible(false);
	}
	
	public void declara(){
		Lista_de_clientes listac = new Lista_de_clientes(500);
		Lista_de_produtos listap = new Lista_de_produtos(500);
		
		listac.insere (new Cliente("Weld Lucas Cunha","06/05/1993","91508592","Rua Kenedy","089.720.626-69"));
		listac.insere (new Cliente("Graziele Massafera","26/2/1990","91901234","Rua da varzea","189.463.226-19"));
		listac.insere (new Cliente("Joaquina Santos","26/1/1983","98272933","Rua Mello Franco","235.346.234-56"));
		listac.insere (new Cliente("Antonio Nunes","08/05/1990","99102894","Rua Getulio vargas","264.374.626-75"));
		listac.insere (new Cliente("Silvio Santos","01/03/1963","98493722","Rua das frutas","089.634.434-36"));
		listac.insere (new Cliente("Eugenio Futra","16/11/1983","92824853","Rua dente de leite","346.346.636-37"));
		listac.insere (new Cliente("Herbert Sena Silva","30/10/1985","90926384","Rua da voadora","349.736.346-46"));
		listac.insere (new Cliente("Abreu Fudencio","15/05/19844","99028375","Rua das flores","564.340.464-34"));
		listac.insere (new Cliente("Sergio Mello","14/08/1991","90192836","Rua dario castor","456.734.634-64"));
		listac.insere (new Cliente("Belmir Santos","18/12/1989","91047395","Rua da sacanagem","346.346.663-34"));
		listac.insere (new Cliente("José Maria", "13/02/1970", "31 3754-7851", "Rua das Uvas, 162", "152.125.232-16"));
		listac.insere (new Cliente("João da Silva", "15/03/1980", "31 3734-8831", "Rua das Mangas, 132", "178.123.754-64"));
		listac.insere (new Cliente("Joaquim Pereira","18/06/1985","31 3589-8954", "Rua Vida Boa, 548","124.133.964-82"));
		listac.insere (new Cliente("Maria Silva", "22/09/1990","31 6547-4781" , "Rua das Virgens, 632", "158.173.234-68"));
		listac.insere (new Cliente("Antônio da Silva","25/10/1987", "31 3734-6584","Rua Ula Ula, 12","538.522.674-38" ));
		listac.insere (new Cliente("Pedro Silva", "16/07/1986", "31 6334-6531","Rua Grande, 13", "238.533.324-50"));
		listac.insere (new Cliente("Weld da Silva", "01/08/1959", "31 6548-2345", "Rua Porto, 17","547.643.753-64"));

		listap.insere ( new cama ("Lençol", 3, 15.50, "S"));
		listap.insere ( new cama ("Fronha", 2, 18.50, "S"));
		listap.insere ( new cama ("Colcha de Seda", 6, 60, "S"));
		listap.insere ( new cama ("Edredon Fino", 6, 50, "S"));
		listap.insere ( new cama ("Cobertor", 6, 30, "C"));
		listap.insere ( new cama ("Edredon Grosso", 10, 100, "C"));
		listap.insere ( new cama ("Jogo de Travesseiros", 11, 110, "C"));
		listap.insere ( new cama ("Jogo de Travesseiros bordado", 8, 60, "S"));
		listap.insere ( new cama ("Lençol de seda", 4, 200, "C"));
		listap.insere ( new cama ("Colchão BOX", 5, 800, "C"));
		listap.insere ( new cama ("Colchão BOX Sono Bom", 7, 500, "S"));

		listap.insere ( new calcado ("Tênis Comum", 2, 100, "Azul", 38));
		listap.insere ( new calcado ("Tênis Adidas Flex", 6, 300, "Prata", 39));
		listap.insere ( new calcado ("Tênis Nike Voador", 14, 320, "Vermelho", 40));
		listap.insere ( new calcado ("Sapato Social Bico Fino", 20, 150, "Preto/Cinza", 41));
		listap.insere ( new calcado ("Sapato Social Bico Quadrado", 40, 300, "Marrom", 43));
		listap.insere ( new calcado ("Tênis Puma", 18, 500, "Branco", 37));
		listap.insere ( new calcado ("Tênis do Piu-Piu", 39, 200, "Amarelo", 35));
		listap.insere ( new calcado ("Tênis Reebok", 49, 220, "Cinza", 42));
		listap.insere ( new calcado ("Tênis Aero Fly", 24, 290, "Verde", 37));
		listap.insere ( new calcado ("Tênis Mizunno", 30, 230, "Preto", 45));
		listap.insere ( new calcado ("Chinelo Havainas", 60, 50, "Rosa", 35));

		listap.insere(new confeccao("Camisa Nike FIT", 5, 89.9, 30, "Malha"));
		listap.insere(new confeccao("Moleton Adidas 365", 10, 95, 32, "Nylon"));
		listap.insere(new confeccao("Blusa Feminina Marisa", 32, 39, 25, "Seda"));
		listap.insere(new confeccao("Jaqueta Buffalo Man", 64, 500, 34, "Couro"));
		listap.insere(new confeccao("Calça Jeans Coca-Cola", 20, 200, 40, "Jeans"));
		listap.insere(new confeccao("Calça Social Sketch", 30, 110, 38, "Pano Fino"));
		listap.insere(new confeccao("Camisa Nike RUN", 35, 90, 32, "Tecido Reciclável"));
		listap.insere(new confeccao("Camisa Pólo CIA do Terno", 20, 40, 29, "Tecido Grosso"));
		listap.insere(new confeccao("Camisa Umbro", 50, 110, 30, "Malha Esportiva"));
		listap.insere(new confeccao("Terno Sketch", 43, 500, 40, "Seda"));
	}	
}

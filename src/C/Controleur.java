package C;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import M.Classe;
import M.Control;
import M.Enseignants;
import M.Salle;
import M.matiere;
import V1.Ajoute1;
import V1.Ajoute2;
import V1.P;
import V1.myMain;
import V1.Tab.mine;

public class Controleur {
	 P v;
	Control c;
		
	public static JPanel e;
	public Controleur(Control c,P v){
		
		this.c=c; this.v=v;

	
	
		
		
	}
	public static void main(String[] arg0){
		
		Control c=new Control();
		P v=new P(c.getlevels(),c.getens());
		
		Controleur cont=new	Controleur(c,v);
		
		cont.Actions();

		
	}

	
	public void Actions() {
		v.getComboBox().addItemListener(new Thehandler());
		v.getComboBox_2().addItemListener(new Thehandler3());
		
		v.getAjoutebtn().addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent arg0) {

        		
        		int row=v.getTableau().getSelectedColumn();
    			int col=v.getTableau().getSelectedRow();
    			try{
        			String S=SelectAjout(v.getTableau().getSelectedColumn(),v.getTableau().getSelectedRow());
        				
        		
        			Ajoute1 w=new Ajoute1(v.getComboBox().getSelectedItem(),v.getComboBox_1().getSelectedItem(),col,row);
        			//w.initialize(v.getComboBox().getSelectedItem(),v.getComboBox_1().getSelectedItem(),col,row);
        			v.setW(w);
        			init();	
        			w.getContentPane().add(v.getMatiere());
        			w.getContentPane().add(v.getSalles());
        			v.getAjou().addActionListener(new ActionListener() {
        				public void actionPerformed(ActionEvent arg0) {
        					try{	
        					int res=c.ajout(v.getMatiere().getSelectedItem(),v.getSalles().getSelectedItem(),v.getNiv1(),v.getClasse1(),v.getI()+8,v.getJ());
        					if(res==0) JOptionPane.showMessageDialog(null,"Enseignant Occupé","Erreur",JOptionPane.ERROR_MESSAGE);
        					if(res==-1) 	 JOptionPane.showMessageDialog(null,"Nombre de séance par semaine maximale","Erreur",JOptionPane.ERROR_MESSAGE);
        					update();
        						updateemp();
        						v.getW().dispose();
        					}catch(Exception e){
        						
        					}
        				}
        			});
        			

        			        			
        	
        		
        	
			
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "Aucun cell est sélectioné");
			}}
		}
        		);

		v.getBtnSupprimerSance().addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	try{	int i=v.getTableau().getSelectedColumn();
    			int j=v.getTableau().getSelectedRow();
	        	String S=SelectAjout(v.getTableau().getSelectedColumn(),v.getTableau().getSelectedRow());
        		c.supprimerséance(v.getComboBox().getSelectedItem(),v.getComboBox_1().getSelectedItem(),i+8,j);
        		updateemp();
        		
        	}catch(Exception e){
    			JOptionPane.showMessageDialog(null,"Aucun séa"+ "nce sélectioner");

        	}
        }});
	
	v.getAjoutbtn2().addActionListener(new ActionListener() {
		

			
		public void actionPerformed(ActionEvent arg0) {
        	//	try{
    		Ajoute2 a=new Ajoute2();
    		v.setA(a);
    		a.addbut();
    		v.setChoice(initChoice2());
    		a.addchoice();
    		
    		v.getBtnAjouter().addActionListener(new ActionListener(){
    			public void actionPerformed(ActionEvent e) {
    			String[] a,b,d;
    			ArrayList<String[]> list=new ArrayList<>();
    			if(!v.getTextField_4().getText().isEmpty() && !v.getTextField_4().getText().equalsIgnoreCase("Niveau/Classe") )
    				{a=getClassesndlevle(v.getTextField_4().getText());
    				list.add(a);
    				}
    			if(!v.getTextField_5().getText().isEmpty() && !v.getTextField_5().getText().equalsIgnoreCase("Niveau/Classe") )
    				{b=getClassesndlevle(v.getTextField_5().getText());
    				list.add(b);
    				}
    			if(!v.getTextField_6().getText().isEmpty() && !v.getTextField_6().getText().equalsIgnoreCase("Niveau/Classe") )
    				{d=getClassesndlevle(v.getTextField_6().getText());
    				list.add(d);
    				}
    			if(list.isEmpty()) JOptionPane.showMessageDialog(null, "Erreur","Erreur de saisir niv/classe",JOptionPane.ERROR_MESSAGE);

    			else{
    			if(v.getC().getSelectedIndex()==2)
    			{updates();
    				 c.addEnsign(v.getTextField().getText(),v.getTextField_1().getText(),v.getTextField_2().getText(),v.getTextField_3().getText(),v.getC().getSelectedIndex(),v.getChoiceT().getSelectedItem(),(Date)v.getDateField(),v.getFormattedTextField(),list);
    				 v.getajout2().dispose();}
    			if(v.getC().getSelectedIndex()==1)
    				{
    				c.addEnsign(v.getTextField().getText(),v.getTextField_1().getText(),v.getTextField_2().getText(),v.getTextField_3().getText(),v.getC().getSelectedIndex(),v.getChoiceT().getSelectedItem(),v.getDateField(),v.getGarde().getText(),list);
    				updates();
    				 v.getajout2().dispose();}}
    			if(v.getC().getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Aucun type est selectioné");
    			
    		
    			}});
    		
    	}
	});
	v.getE().addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
	       	v.frame.setBounds(100,10,1100, 700);
			v.frame.setContentPane(v.getTab1());
		}
		
	});
	v.getBtnRetour().addActionListener(	  new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) 
    	{	
    			v.frame.setBounds(300, 150, 600, 450);
    			v.frame.setContentPane(v.s());
    			      
    			

    			    
    			
    	}		
    	
    });
	v.getBR().addActionListener(	  new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
			v.frame.setBounds(300, 150, 600, 450);
    		v.frame.setContentPane(v.s());

    			
    	}		
    	
    });
    
	v.getCb().addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {

			v.frame.setContentPane(v.getTab());
			v.frame.setBounds(100,10,1100, 700);
		}
			
		});
	}	private ArrayList<String> getens(){
			ArrayList<String>A=new ArrayList<>();
			A.add("");
			for(Enseignants e:c.getens()){
				A.add(e.toString());
				
			}
			return A;
		}
		public class handler implements FocusListener {
			@Override
			public void focusGained(FocusEvent e) {
				if(e.getSource()==v.getTextField_4())
					v.getTextField_4().setText("");
				if(e.getSource()==	v.getTextField_4())
					v.getTextField_5().setText("");
				if(e.getSource()==	v.getTextField_5())
					v.getTextField_5().setText("");
			}


			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		
		
	}
		public String SelectAjout(int c, int r) {
			v.getTableau().clearSelection();
			//getRootPane().getParent().disable();		//getRootPane.getParent.dispose();
			return v.getTableau().getValueAt(r, c).toString();
		}
		public void setmodel(DefaultTableModel mod, String[][] tem){
			mod.setDataVector(tem,tete());
			if(mod.equals(v.getMod()))
			centrerTable(v.getTableau());
			else centrerTable(v.getTableau1());
		}
		public void updateemp() {
			setmodel(v.getMod(),c.getemp(v.getComboBox().getSelectedItem(),v.getComboBox_1().getSelectedItem()));
		}
		private void centrerTable(JTable table) {     mine custom =new mine();
		  for (int i=0 ; i<table.getColumnCount() ; i++) 
		  table.getColumnModel().getColumn(i).setCellRenderer(custom);
		  
		   }
		String[] tete(){
			 String[] entetes = {"Samdi", "Dimanche", "Lundi", "Mardi", "Mercredi","Jeudi"};
			 return entetes;
		}
		public  void updates(){

		v.getComboBox_2().addItem(c.getens().get(c.getens().size()-1).toString());
		}
		public void update(){
			ArrayList<matiere> A=c.getMat(v.getNiv1());
			ArrayList<Salle> C=c.getSalleslibre(v.getI(),v.getJ());
			}
		public  void init(){
			ArrayList<matiere> A=c.getMat(v.getNiv1());
			System.out.println(A.size());
			ArrayList<Salle> C=c.getSalleslibre(v.getI(),v.getJ());
			Choice c =v.getMatiere();
			
			v.setMatiere(choicess(A));
			v.getMatiere().setBounds(46, 15, 100, 20);
			v.setSalles(choices(C));
			v.getSalles().setBounds(227, 15, 100, 20);
		
			}

		 public	 Choice choicess(ArrayList<matiere> A){
			 Choice c=new Choice();
			for(int i=0;i<A.size();i++) c.add(A.get(i).toString());
			return c;
		}

		 public	 Choice choices(ArrayList<Salle> A){
			 Choice c=new Choice();
			 c.addItemListener(new ItemListener() {
			 	public void itemStateChanged(ItemEvent arg0) {
			 		init();
			 	}
			 });
			for(int i=0;i<A.size();i++) c.add(A.get(i).toString());
			return c;
		

}
		 
			public class Thehandler implements ItemListener{   			

				@Override
    			public void itemStateChanged(ItemEvent arg0) {
					
    				if(arg0.getStateChange()==ItemEvent.SELECTED) {
    					try{
    						    				
    					
    					setChoicses(v.getComboBox().getSelectedItem());    					 		       v.getlbl().setVisible(true);
    					setmodel(v.getMod(),c.getemp(v.getComboBox().getSelectedItem(),v.getComboBox_1().getSelectedItem()));
    					
    				}catch(Exception e){
    					setmodel(v.getMod(), inittab());
						v.getComboBox_1().setVisible(false);
						v.getlbl().setVisible(false);

    					
							
    				}}

    				
						
    	}}
			private void setChoicses(String item) {
				
				v.setCombo_1(initcombo(getitems(item)));
				v.getComboBox_1().setBounds(26, 182, 102, 20);
				Thehandler2 hand=new Thehandler2();
				v.getComboBox_1().addItemListener(hand);
		        v.frame.getContentPane().add(v.getComboBox_1());
					
			}
	
			ArrayList<String> getitems(String ite)
			{	
				ArrayList<Classe> tem=getobjects(ite);
				ArrayList<String> S=new ArrayList<>();
				for(int i=0;i<tem.size();i++){
					S.add(tem.get(i).toString());
				}
				
			return S;}
			ArrayList<Classe> getobjects(String ite){
				
				ArrayList<Classe> e=c.Niv(ite).getCl();
				return e;
			}
			private Choice initChoice2(){
				Choice e= new Choice();
				for(String v:c.getAllmats()){
					e.add(v);
				}
				
				return e;
			
			}
			private Choice initcombo(ArrayList<String> A)
			{ Choice c=new Choice();
				for(int i=0;i<A.size();i++)
					c.add(A.get(i));
				return c;
				
			}
			public class Thehandler2 implements ItemListener{   			
				
				@Override
				public void itemStateChanged(ItemEvent arg0) {
					
					if(arg0.getStateChange()==ItemEvent.SELECTED) {
					setmodel(v.getMod(),c.getemp(v.getComboBox().getSelectedItem(),v.getComboBox_1().getSelectedItem()));
					
						
					}
					

			
}
			}
			public class Thehandler3 implements ItemListener{   			

				@Override
    			public void itemStateChanged(ItemEvent arg0) {
					
    				if(arg0.getStateChange()==ItemEvent.SELECTED) 
    				try{	
    					
    					
    					setmodel(v.getModel(),c.getempensi(v.getComboBox_2().getSelectedItem()));
    				}catch(Exception e){
    					setmodel(v.getModel(),inittab());
    				}
				}}
			public String[] getClassesndlevle(String s){
				String[] a = null;
				try{
				a=s.split("/");}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Erreur","Erreur de Saisir",JOptionPane.ERROR_MESSAGE);
				}
				return a;
		}
			public JFrame getv(){
				return v;
			}
			String[][] inittab(){
				 String[][] donnees = {
			                {"", "", "", "", "",""},
			                {"", "", "", "","", ""},	                  {"", "", "", "", "",""},	  {"", "", "", "", "",""},
			                {"", "", "", "", "",""},                {"", "", "", "", "",""}, {"", "", "", "", "",""}       };
				 return donnees;
			}

}
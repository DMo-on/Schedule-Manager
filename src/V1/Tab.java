package V1;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.AbstractDocument;

import C.Controleur;
import M.Classe;
import M.Control;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.Border;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Tab extends JPanel {
	
	private JTable tableau;
	Ajoute1 w;
	
	
	Scene s;



	private  JButton btnRetour ;
	JButton btnAjouterSance;
	JButton btnSupprimerSance;
    DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
    DefaultTableModel model ;
    ArrayList<String> Levels;
    Choice comboBox,comboBox_1;
 
public DefaultTableModel getMod(){
	return model;
}


	JLabel lbcl;
    public static class mine
    extends JEditorPane implements TableCellRenderer {
  

    public mine() {
    }


    @Override
    public Component getTableCellRendererComponent(
        JTable table, Object value, boolean isSelected,
        boolean hasFocus, int row, int column) {
        this.setText((String) value);
        return this;
    }
}


	/**
	 * Create the panel.
	 */
	public Tab(ArrayList<String> lev) {
		setBackground(new Color(51, 204, 255));
		setBounds( 300, 300,940,600);
		Levels=lev;
		
	        setLayout(null);
	        setLayout(null);
	        
	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(260, 66, 590, 523);
	        add(scrollPane);
	        
	       tableau=new JTable(model);
	        scrollPane.setViewportView(tableau);
	        tableau.getTableHeader().setReorderingAllowed(false);
	        tableau.getTableHeader().setBackground(Color.BLUE);
	        		model =new DefaultTableModel
	        			    (
	        			    	    init(),
	        			    	   tete()
	        			    	    ) 
	        			    	{
	        			    	   
	        			    	    @Override
	        			    	    public boolean isCellEditable(int rowIndex, int columnIndex) 
	        			    	    {
	        			    	        return false;
	        			    	    }
	        			    	};
	        			        centrerTable(tableau);

	    	        tableau.setModel(model);
	    	        tableau.setRowSelectionAllowed(false);
	    	        tableau.setColumnSelectionAllowed(false);
	    	       // this.centrerTable(tableau);
	    	        tableau.setCellSelectionEnabled(false);
	        tableau.getColumnModel().getColumn(0).setPreferredWidth(90);
	        tableau.getColumnModel().getColumn(1).setPreferredWidth(90);
	        tableau.getColumnModel().getColumn(2).setPreferredWidth(90);
	        tableau.getColumnModel().getColumn(3).setPreferredWidth(90);
	        tableau.getColumnModel().getColumn(4).setPreferredWidth(90);
	        tableau.getColumnModel().getColumn(5).setPreferredWidth(90);
	        dtcr.setHorizontalAlignment(SwingConstants.CENTER);


	        // table.getColumn("ghi").setCellRenderer(dtcr);
	         //table.getColumn("ghi").setCellRenderer(dtcr)
		        
	         tableau.setFont(new Font("Verdana", Font.ITALIC, 13));
	        // tableau.setCellSelectionEnabled(true);
	         tableau.setRowHeight(70);
	         tableau.setBorder(null);
	        
	        
	       
	       
	        
	        JLabel lblhh = new JLabel("      8h - 9h");
	        lblhh.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblhh.setBounds(167, 122, 78, 30);
	        add(lblhh);
	        
	        JLabel lblhh_1 = new JLabel("      9h - 10h");
	        lblhh_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblhh_1.setBounds(167, 196, 78, 30);
	        add(lblhh_1);
	        
	        JLabel lblhh_2 = new JLabel("    10h - 11h");
	        lblhh_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblhh_2.setBounds(167, 264, 78, 30);
	        add(lblhh_2);
	        
	        JLabel lblhh_3 = new JLabel("    11h - 12h");
	        lblhh_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblhh_3.setBounds(167, 331, 78, 30);
	        add(lblhh_3);
	        
	        JLabel lblhh_4 = new JLabel("    14h - 15h");
	        lblhh_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblhh_4.setBounds(167, 400, 78, 30);
	        add(lblhh_4);
	        
	        JLabel lblhh_5 = new JLabel("    15h - 16h");
	        lblhh_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblhh_5.setBounds(167, 472, 78, 30);
	        add(lblhh_5);
	        
	        JLabel lblhh_6 = new JLabel("    16h - 17h");
	        lblhh_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        lblhh_6.setBounds(167, 543, 78, 30);
	        add(lblhh_6);
	        comboBox=initcombo(Levels);
	   
	        comboBox.setBounds(26, 129, 102, 20);
	        add(comboBox);
	        
	        
	         btnAjouterSance = new JButton("Ajouter s\u00E9ance");
	        btnAjouterSance.setBackground(new Color(0, 102, 255));
	     
	        btnAjouterSance.setBounds(26, 255, 131, 23);
	        btnAjouterSance.setBorder(BorderFactory.createEtchedBorder());

	        add(btnAjouterSance);
	        
	         btnSupprimerSance = new JButton(" Supprimer s\u00E9ance");
	        btnSupprimerSance.setBackground(new Color(0, 102, 255));
	        btnSupprimerSance.setBorder(BorderFactory.createEtchedBorder());
	
	        btnSupprimerSance.setBounds(26, 300, 131, 23);
	        add(btnSupprimerSance);
	        
	        JLabel lblNiveau = new JLabel("Niveau");
	        lblNiveau.setBounds(26, 109, 55, 14);
	        add(lblNiveau);
	        
	       lbcl = new JLabel("Classe");
	        lbcl.setBounds(26, 162, 46, 14);
	        lbcl.setVisible(false);
	        add(lbcl);
	        
	         btnRetour = new JButton(" Retour");
	         btnRetour.setBackground(new Color(0, 0, 255));
	        btnRetour.setForeground(new Color(0, 0, 0));
	        btnRetour.setBounds(39, 436, 89, 23);
	        add(btnRetour);
	        
           
	       
	    		
	    	
	        	
	         

	}

	private Choice getChoice(){
		return comboBox;
	}
	
	private String getcombo2() {
		return comboBox_1.getSelectedItem();
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
		ArrayList<Classe> e=new ArrayList<>();
		return e;
	}
	
	String[][] init(){
		 String[][] donnees = {
	                {"", "", "", "", "",""},
	                {"", "", "", "","", ""},	                  {"", "", "", "", "",""},	  {"", "", "", "", "",""},
	                {"", "", "", "", "",""},                {"", "", "", "", "",""}, {"", "", "", "", "",""}       };
		 return donnees;
	}
	String[] tete(){
		 String[] entetes = {"Samdi", "Dimanche", "Lundi", "Mardi", "Mercredi","Jeudi"};
		 return entetes;
	}
	private void centrerTable(JTable table) {     mine custom =new mine();
	  for (int i=0 ; i<table.getColumnCount() ; i++) 
	  table.getColumnModel().getColumn(i).setCellRenderer(custom);
	  
	   }
    

		
	

	private Choice initcombo(ArrayList<String> A)
	{ Choice c=new Choice();
		for(int i=0;i<A.size();i++)
			c.add(A.get(i));
		return c;
		
	}
	public void setLevels(ArrayList<String> A)
	{	
		Levels=A;
	}

	 String getNiv() {
		return w.getNiv() ;
	}



	 String getClasse() {
		return w.getClasse();
	}



	 Choice getSalles() {
		return w.getSalles();
	}



	 Choice getMatiere() {
		return w.getMatiere();
	}



	 DefaultComboBoxModel<String> getM() {
		return w.getM();
	}



	 DefaultComboBoxModel<String> getM1() {
		return w.getM1();
	}



	 int getI() {
		return w.getI();
	}



	 int getJ() {
		return w.getJ();
	}
	  JButton getBtnAjouterSance() {
		return btnAjouterSance;
	}
	  JButton getBtnRetour() {
			return btnRetour;
		}
		 JButton getBtnSupprimerSance() {
			return btnSupprimerSance;
		}
		 JButton getAjou() {
			return w.ajou;
		}



		 JButton getCancel() {
			return w.cancel;
		}
		    Choice getComboBox_1() {
				return comboBox_1;
			}
			public void setMatiere(Choice choicess) {
				w.setMatiere(choicess);
			}
			public void setSalles(Choice choicess) {
				w.setSalles(choicess);
			}
			public void setW(Ajoute1 ajoute1) {
				w=ajoute1;
			}
			public void setcombo_1(Choice initcombo) {
				comboBox_1=initcombo;
			}
			public Choice getComboBox(){
				return comboBox;
			}
			public JTable getTableau() {
				return tableau;
			}
			public Ajoute1 getW() {
			return w;
			}
			public JLabel getlbl(){
				return lbcl;
			}

		
}
	


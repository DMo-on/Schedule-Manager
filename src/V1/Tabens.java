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

import M.Enseignants;
import V1.Ajoute2;
import javafx.scene.layout.Border;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Tabens extends JPanel {
	
	private JTable tableau;
	private Ajoute2 a;
	private DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
    private DefaultTableModel model ;
    ArrayList<String> ensi;
    private Choice comboBox;

	private JButton btnAjouterSance;
	private JButton btnRetours;
	JButton ss;
    private static class mine
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



	public Tabens(ArrayList<Enseignants> ens) {
		
		ensi=toStr(ens);
		setBounds( 300, 300,940,600);
		setBackground(new Color(51, 204, 255));

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


		        
	         tableau.setFont(new Font("Verdana", Font.ITALIC, 13));
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
	        //((JComponent) comboBox).setBorder(BorderFactory.createRaisedBevelBorder());
	       comboBox=initcombo(ensi);
	      
	        comboBox.setBounds(26, 129, 102, 20);
	        add(comboBox);
	        
	        
	         btnAjouterSance = new JButton("Ajouter ensigniant");
	        btnAjouterSance.setBackground(new Color(0, 102, 255));
	       
	        btnAjouterSance.setBounds(26, 255, 131, 23);
	        btnAjouterSance.setBorder(BorderFactory.createEtchedBorder());

	        
	        
	        add(btnAjouterSance);
	        	ss=new JButton("Retour");
	        	ss.setBackground(new Color(0, 0, 255));
		        ss.setForeground(new Color(0, 0, 0));
		        ss.setBounds(39, 435, 89, 23);
		        add(ss);
           // add(tableau.getTableHeader());
            //add(tableau);
	       
	    		
	    	
	        	
	        

	}
	public JButton getBR() {
		return ss;
	}
	private ArrayList<String> toStr(ArrayList<Enseignants> ens) {
		ArrayList<String> S=new ArrayList<>();
		S.add("");
		for(Enseignants e: ens){
			S.add(e.toString());
		}
		return S;
	}
	public String SelectAjout(int c, int r) {
		tableau.clearSelection();
		return tableau.getValueAt(r, c).toString();
	}
	private Choice getChoice(){
		return comboBox;
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
 
	public void fillTable(String[][] A){
		model.setDataVector(A, tete());
		centrerTable(tableau);
}
	private void centrerTable(JTable table) {     mine custom =new mine();
	  for (int i=0 ; i<table.getColumnCount() ; i++) 
	  table.getColumnModel().getColumn(i).setCellRenderer(custom);
	  
	   }
	public void setmodel(String[][] tem){
		
		model.setDataVector(tem, tete());
		centrerTable(tableau);
	}
	private Choice initcombo(ArrayList<String> A)
	{ Choice c=new Choice();
		for(int i=0;i<A.size();i++)
			c.add(A.get(i));
		return c;
		
	}
	

	public DefaultListModel<String> getM() {
		return a.getM();
	}

	


	



	public JTextField getTextField() {
		return a.getTextField();
	}



	



	public JTextField getTextField_1() {
		return a.getTextField_1();
	}






	public JTextField getTextField_2() {
		return a.getTextField_2();
	}







	public JTextField getTextField_3() {
		return a.getTextField_3();
	}



	



	public JTextField getGarde() {
		return a.getGarde();
	}






	public Choice getChoicetab() {
		return a.getChoice();
	}






	public Choice getC() {
		return a.getC();
	}







	public JLabel getLbl() {
		return a.getLbl();
	}






	public JFormattedTextField getFormattedTextField() {
		return a.getFormattedTextField();
	}






	public Date getDateField() {
		return a.getDateField();
	}

















	











	



	public JTextField getTextField_4() {
		return a.getTextField_4();
	}





	public JTextField getTextField_5() {
		return a.getTextField_5();
	}






	public JTextField getTextField_6() {
		return a.getTextField_6();
	}
	public JTable getTableau1() {
		return tableau;
	}
	public Ajoute2 getA() {
		return a;
	}
	public DefaultTableCellRenderer getDtcr() {
		return dtcr;
	}
	public DefaultTableModel getModel() {
		return model;
	}
	public ArrayList<String> getEnsi() {
		return ensi;
	}
	public Choice getComboBox2() {
		return comboBox;
	}
	public JButton getBtnAjouter() {
		return a.getBtnAjouter();
	}



	public JButton getBtnAnnuler() {
		return a.getBtnAnnuler();
	}
	public void setComboBOX_2(Choice initcombo) {
		comboBox=initcombo;
	}
	public Ajoute2 getajout2() {
		return a;
	}
    public JButton getAjoutbtn2() {
		return btnAjouterSance;
	}
	public void setA(Ajoute2 a2) {
a=a2;		
	}

	public void setChoice(Choice c){
		a.setChoice(c);
	}
	
}
    

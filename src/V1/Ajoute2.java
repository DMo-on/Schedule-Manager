package V1;

import java.awt.Choice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;


import M.Control;

import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.text.Format;
import java.awt.event.ItemEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Ajoute2 extends JDialog {

	private JPanel contentPane;
	DefaultListModel<String> M;
	private JTextField textField;
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField garde;
	Choice choice,c;
	JLabel lbl;
	JFormattedTextField formattedTextField,dateField;
	private JLabel lblType;
	private JLabel lblMatiere;
	private JLabel lblNom;
	private JLabel lblPrnom;
	private JLabel lblAdress;
	private JLabel lblNumtel;
	private JLabel lblDateDeb;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;



	JButton btnAjouter,btnAnnuler;
	
	
	
	public Ajoute2() {
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		c=init();
		c.setBounds(40, 32, 97, 20);
		getContentPane().add(c);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent c) {
				if(Character.isDigit(c.getKeyChar()))
					c.consume();
			}
		});
		textField.setBounds(206, 32, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		 dateField = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));

		dateField.setValue(new java.util.Date());
		    dateField.setSize(80, 20);
		    dateField.setLocation(81, 129);
		  getContentPane().add(dateField);
		textField_1 = new JTextField();
		textField_1.setBounds(348, 32, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(Character.isDigit(c))
					arg0.consume();
			}
		});
		
		textField_2 = new JTextField();
		textField_2.setBounds(206, 88, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(348, 88, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(!Character.isDigit(c))
					arg0.consume();
			}
		});
		
	//	 choice = this.matiere();
	/*	choice.setBounds(40, 88, 97, 20);
		getContentPane().add(choice);
		*/
		 formattedTextField =new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
		formattedTextField.setValue(new java.util.Date());
		formattedTextField.setBounds(263, 129, 86, 20);
		
		getContentPane().add(formattedTextField);
		
		garde = new JTextField();
	
		garde.setBounds(250, 129, 86, 20);
		getContentPane().add(garde);
		garde.setColumns(10);
		
		 lbl = new JLabel("");
		lbl.setBounds(182, 132, 70, 14);
		getContentPane().add(lbl);
		
		 
		/*btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] a,b,d;
				ArrayList<String[]> list=new ArrayList<>();
				if(!textField_4.getText().isEmpty() && !textField_4.getText().equalsIgnoreCase("Niveau/Classe") )
					{a=getClassesndlevle(textField_4.getText());
					list.add(a);
					}
				if(!textField_5.getText().isEmpty() && !textField_5.getText().equalsIgnoreCase("Niveau/Classe") )
					{b=getClassesndlevle(textField_5.getText());
					list.add(b);
					}
				if(!textField_6.getText().isEmpty() && !textField_6.getText().equalsIgnoreCase("Niveau/Classe") )
					{d=getClassesndlevle(textField_6.getText());
					list.add(d);
					}
				if(list.isEmpty()) JOptionPane.showMessageDialog(null, "Erreur","Erreur de saisir niv/classe",JOptionPane.ERROR_MESSAGE);

				else{
				if(c.getSelectedIndex()==2)
				{main.tab1.updates();
					Control.addEnsign(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),c.getSelectedIndex(),choice.getSelectedItem(),date1(),getdate2(),list);
				dispose();}
				if(c.getSelectedIndex()==1)
					{
					Control.addEnsign(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),c.getSelectedIndex(),choice.getSelectedItem(),date1(),grade().getText(),list);
					main.tab1.updates();
					dispose();}}
				if(c.getSelectedIndex()==0) JOptionPane.showMessageDialog(null, "Aucun type est selectioné");
				
			}
		});*/
		
		 btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			
			}
		});
		btnAnnuler.setBounds(260, 221, 89, 23);
		getContentPane().add(btnAnnuler);
		
		lblType = new JLabel("Type");
		lblType.setBounds(10, 35, 53, 14);
		getContentPane().add(lblType);
		
		lblMatiere = new JLabel("Matiere");
		lblMatiere.setBounds(0, 91, 46, 14);
		getContentPane().add(lblMatiere);
		
		lblNom = new JLabel("Nom");
		lblNom.setBounds(150, 35, 46, 14);
		getContentPane().add(lblNom);
		
		lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setBounds(302, 35, 46, 14);
		getContentPane().add(lblPrnom);
		
		lblAdress = new JLabel("Adress");
		lblAdress.setBounds(150, 91, 46, 14);
		getContentPane().add(lblAdress);
		
		lblNumtel = new JLabel("numTel");
		lblNumtel.setBounds(306, 91, 46, 14);
		getContentPane().add(lblNumtel);
		
		lblDateDeb = new JLabel("Date deb");
		lblDateDeb.setBounds(22, 132, 64, 14);
		getContentPane().add(lblDateDeb);
		
		textField_4 = new JTextField("Niveau/Classe");
		handler text=new handler();
		textField_4.addFocusListener(text);
		textField_4.setBounds(81, 175, 80, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField("Niveau/Classe");
		textField_5.setColumns(10);
		textField_5.setBounds(206, 175, 80, 20);
		textField_5.addFocusListener(text);

		getContentPane().add(textField_5);
		
		textField_6 = new JTextField("Niveau/Classe");
		textField_6.setColumns(10);
		textField_6.addFocusListener(text);

		textField_6.setBounds(348, 175, 80, 20);
		getContentPane().add(textField_6);
		setBounds(400, 250, 500, 300);
		getContentPane().setLayout(null);
		getContentPane();
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		lbl.setVisible(false);
		grade().setVisible(false);
		
		date2().setVisible(false);
		
		
		
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	 public void initialize() {
		

	
	
	}
	private Choice init(){
		Choice a=new Choice();
		a.addItemListener(new ItemListener() {
			

			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getStateChange()==ItemEvent.SELECTED)
					if(a.getSelectedIndex()==1){
						show2();
					}
				if(a.getSelectedIndex()==2){
					show1();
				}
				
			}

			private void show2() {
				grade().setVisible(true);
				date2().setVisible(false);
				lbl.setText("Grade");
				lbl.setVisible(true);

			}

			private void show1() {
					date2().setVisible(true);
					grade().setVisible(false);
					lbl.setText("Date de fin");
					lbl.setVisible(true);
					

			}
		});
		a.add("");
		a.add("Permanent");
		a.add("Vacataires");
		return a;
		
	}
	private JTextField grade(){
		return garde;
	}
	 Date date1(){
		return  (java.util.Date)formattedTextField.getValue();
	}
	Date getdate2(){
		return  (java.util.Date)this.dateField.getValue();

		
	}
	
	private JFormattedTextField  date2(){
		java.util.Date date = (java.util.Date)formattedTextField.getValue();
		return  formattedTextField;
	}
	/*private Choice matiere(){
		ArrayList<String> mat=Control.getAllmats();
		Choice a=new Choice();
		for(String s:mat){
			a.add(s);
		}
		return a;
	}*/
	public class hand implements KeyListener{
		@Override
		public void keyTyped(KeyEvent c) {
			if(Character.isDigit(c.getKeyChar()))
				c.consume();
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			
		}
	}
	public String[] getClassesndlevle(String s){
		String[] a = null;
		try{
		a=s.split("/");}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erreur","Erreur de Saisir",JOptionPane.ERROR_MESSAGE);
		}
		return a;
}
	public class handler implements FocusListener {
		@Override
		public void focusGained(FocusEvent arg0) {
			if(arg0.getSource()==textField_4)
				textField_4.setText("");
			if(arg0.getSource()==textField_5)
				textField_5.setText("");
			if(arg0.getSource()==textField_6)
					textField_6.setText("");
		}


		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
	}
	public DefaultListModel<String> getM() {
		return M;
	}



	public void setM(DefaultListModel<String> m) {
		M = m;
	}



	public JTextField getTextField() {
		return textField;
	}



	public void setTextField(JTextField textField) {
		this.textField = textField;
	}



	public JTextField getTextField_1() {
		return textField_1;
	}



	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}



	public JTextField getTextField_2() {
		return textField_2;
	}



	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}



	public JTextField getTextField_3() {
		return textField_3;
	}



	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}



	public JTextField getGarde() {
		return garde;
	}



	public void setGarde(JTextField garde) {
		this.garde = garde;
	}



	public Choice getChoice() {
		return choice;
	}



	public void setChoice(Choice choice) {
		this.choice = choice;
	}



	public Choice getC() {
		return c;
	}



	public void setC(Choice c) {
		this.c = c;
	}



	public JLabel getLbl() {
		return lbl;
	}



	public void setLbl(JLabel lbl) {
		this.lbl = lbl;
	}



	public JFormattedTextField getFormattedTextField() {
		return formattedTextField;
	}



	public void setFormattedTextField(JFormattedTextField formattedTextField) {
		this.formattedTextField = formattedTextField;
	}



	public Date getDateField() {
		return (java.util.Date)dateField.getValue();
	}



	public void setDateField(JFormattedTextField dateField) {
		this.dateField = dateField;
	}
	public void addbut(){
		btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(107, 221, 89, 23);
		getContentPane().add(btnAjouter);
		
	}



	public JLabel getLblType() {
		return lblType;
	}



	public void setLblType(JLabel lblType) {
		this.lblType = lblType;
	}



	public JLabel getLblMatiere() {
		return lblMatiere;
	}



	public void setLblMatiere(JLabel lblMatiere) {
		this.lblMatiere = lblMatiere;
	}













	



	public JTextField getTextField_4() {
		return textField_4;
	}



	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}



	public JTextField getTextField_5() {
		return textField_5;
	}



	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}



	public JTextField getTextField_6() {
		return textField_6;
	}



	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}
	public JButton getBtnAjouter() {
		return btnAjouter;
	}
	public void addchoice(){
		getChoice().setBounds(40, 88, 97, 20);
		getContentPane().add(getChoice());
	}



	public JButton getBtnAnnuler() {
		return btnAnnuler;
	}

}
	 
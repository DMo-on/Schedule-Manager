package V1;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import C.Controleur;
import M.Enseignants;
import M.niveau;
import javafx.scene.control.Button;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class myMain extends JPanel {

	JButton btnNewButton,btnGestionDeClasse;

	static ArrayList<String> A;
	 Tab tab;
	 Tabens tab1;
	ArrayList<niveau> level;
	ArrayList<Enseignants> ens;
	public myMain() {
		setLayout(null);
		 btnNewButton = new JButton("Gestion d'enseignants");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(211, 71, 174, 47);
		add(btnNewButton);
		
		 btnGestionDeClasse = new JButton("Gestion de classe");
		btnGestionDeClasse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGestionDeClasse.setBounds(211, 198, 174, 47);
		add(btnGestionDeClasse);

	}

	public myMain(ArrayList<niveau> a, ArrayList<Enseignants> e) {
		setlvl(a);
		setEns(e);
		
		setBounds(300, 300,  600, 500);
         tab=new Tab(getlvl());
        tab1=new Tabens(getEns());	
        setLayout(null);
		 btnNewButton = new JButton("Gestion d'enseignants");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(200, 57, 200, 47);
		add(btnNewButton);
		
		 btnGestionDeClasse = new JButton("Gestion de classe");
		btnGestionDeClasse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGestionDeClasse.setBounds(200, 142, 200, 47);
		add(btnGestionDeClasse);
		
		
		JButton quitter=new JButton("Quiter");
		quitter.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}

			
		});
		quitter.setBounds(230, 250, 120, 47);
		add(quitter);
		}
	
	private ArrayList<String> getlvl(){
		A=new ArrayList<>();
		A.add("");
		for(niveau e:level){
			A.add(e.toString());
			
		}
		return A;}




		private void setEns(ArrayList<Enseignants> e2) {
			ens=e2;
	}
		private ArrayList<Enseignants> getEns(){
			return ens;
		}
		
	public void setlvl(ArrayList<niveau> A){
	level=A;
	}
	public String getNiv() {
		return tab.getNiv() ;
	}



	public String getClasse() {
		return tab.getClasse();
	}



	public Choice getSalles() {
		return tab.getSalles();
	}



	public Choice getMatiere() {
		return tab.getMatiere();
	}



	public DefaultComboBoxModel<String> getM() {
		return tab.getM();
	}



	public DefaultComboBoxModel<String> getM1() {
		return tab.getM1();
	}



	public int getI() {
		return tab.getI();
	}



	public int getJ() {
		return tab.getJ();
	}

	public DefaultListModel<String> getMmain() {
		return tab1.getM();
	}



	



	public JTextField getTextField() {
		return tab1.getTextField();
	}



	



	public JTextField getTextField_1() {
		return tab1.getTextField_1();
	}






	public JTextField getTextField_2() {
		return tab1.getTextField_2();
	}







	public JTextField getTextField_3() {
		return tab1.getTextField_3();
	}



	



	public JTextField getGarde() {
		return tab1.getGarde();
	}






	public Choice getChoicetab() {
		return tab1.getChoicetab();
	}






	public Choice getC() {
		return tab1.getC();
	}







	public JLabel getLbl() {
		return tab1.getLbl();
	}

	public JLabel getlbl(){
		return tab.getlbl();
	}




	public JFormattedTextField getFormattedTextField() {
		return tab1.getFormattedTextField();
	}






	public Date getDateField() {
		return tab1.getDateField();
	}







	public JButton getBR() {
		return tab1.getBR();
	}









	











	



	public JTextField getTextField_4() {
		return tab1.getTextField_4();
	}





	public JTextField getTextField_5() {
		return tab1.getTextField_5();
	}
	public JPanel AS(){
		return this;
	}





	public JTextField getTextField_6() {
		return tab1.getTextField_6();
	}
	public JTable getTableau1() {
		return tab1.getTableau1();
	}
	public Ajoute2 getA() {
		return tab1.getA();
	}
	public DefaultTableCellRenderer getDtcr() {
		return tab1.getDtcr();
	}
	public DefaultTableModel getModel() {
		return tab1.getModel();
	}
	public ArrayList<String> getEnsi() {
		return tab1.ensi;
	}
	public Choice getComboBox() {
		return tab.comboBox;
	}
	public JButton getAjoutebtn() {
		return tab.getBtnAjouterSance();
	}
	public JButton getBtnRetour() {
		return tab.getBtnRetour();
	}
	public JButton getBtnSupprimerSance() {
		return tab.getBtnSupprimerSance();
	}
	public JButton getAjou() {
		return tab.getAjou();
	}



	public JButton getCancel() {
		return tab.getCancel();
	}
	public JButton getBtnAjouter() {
		return tab1.getBtnAjouter();	}



	public JButton getBtnAnnuler() {
		return tab1.getBtnAnnuler();
	}
  
	public JButton getE() {
		return 		 btnNewButton;

	}
	public JButton getCb() {
		return btnGestionDeClasse;
	}
	   public Choice getComboBox_1() {
			return tab.getComboBox_1();
		}

	public void setMatiere(Choice choicess) {
		tab.setMatiere(choicess);
	}

	public void setSalles(Choice choicess) {
		tab.setSalles(choicess);
	}

	public  void setW(Ajoute1 ajoute1) {
			tab.setW(ajoute1);
	}
	public  void setA(Ajoute2 a){
		tab1.setA(a);
	}

	public void setcombo_1(Choice initcombo) {
		tab.setcombo_1(initcombo);
	}
	public Choice getComboBox2() {
		return tab1.getComboBox2();
	}
	public JTable getTableau() {
		return tab.getTableau();
	}
	public DefaultTableModel getMod(){
		return tab.getMod();
	}

	public  Ajoute1 getW() {
		return tab.getW();
	}

	public void setComboBOX_2(Choice initcombo) {
		tab1.setComboBOX_2(initcombo);
	}

	public Ajoute2 getajout2() {
		return tab1.getajout2();
	}

	 public JButton getAjoutbtn2() {
			return tab1.getAjoutbtn2();
		}

	 public void setChoice(Choice c){
		 tab1.setChoice(c);
	 }
	
	
	
}

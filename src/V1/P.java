package V1;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Window;
import java.util.Date;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import M.Enseignants;
import M.niveau;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;

public class P extends JFrame {
	private JPanel p;
	 public  JFrame frame;
	private  ArrayList<niveau> niv;
	private myMain T;
	private myMain S;

JFrame frame(){
	return frame;
}
	public P(ArrayList<niveau> A,ArrayList<Enseignants> E) {

		/*T=new main(A,E);
		 * 
		setniv(A);*/
	    frame = new JFrame("Employ");
T=new myMain(A,E);
		setniv(A);
	        
		 
	     
	        frame.setBounds(300, 150, 600, 450);
	   //     frame.getContentPane().add(fxPanel);
	      // frame.add(fxPanel);
		    frame.setVisible(true);
		   
	        frame.setContentPane(T);
	        

	        
	     
	     
		
	        
	}
	/*	 Platform.runLater(new Runnable() {
	            @Override
	            public void run() {
	                initFX(fxPanel);
	            }
	       });
	    
	}*/
	

	public myMain s(){
    	//System.out.println(T);
    	System.out.println(T.btnGestionDeClasse);
    	return T;
    }
	
	
    public  ArrayList<niveau> getniv(){
    	return niv;
    }
    public void setniv(ArrayList<niveau> A){
    	niv=A;
    	setlvl(niv);
    }
    public String getNiv1() {
		return T.getNiv() ;
	}


    
	public String getClasse1() {
		return T.getClasse();
	}



	public Choice getSalles() {
		return T.getSalles();
	}



	public Choice getMatiere() {
		return T.getMatiere();
	}



	public DefaultComboBoxModel<String> getM() {
		return T.getM();
	}



	public DefaultComboBoxModel<String> getM1() {
		return T.getM1();
	}



	public int getI() {
		return T.getI();
	}



	public int getJ() {
		return T.getJ();
	}

	public DefaultListModel<String> getMmain() {
		return T.getMmain();
	}



	



	public JTextField getTextField() {
		return T.getTextField();
	}



	



	public JTextField getTextField_1() {
		return T.getTextField_1();
	}






	public JTextField getTextField_2() {
		return T.getTextField_2();
	}







	public JTextField getTextField_3() {
		return T.getTextField_3();
	}



	



	public JTextField getGarde() {
		return T.getGarde();
	}






	public Choice getChoiceT() {
		return T.getChoicetab();
	}


	public JButton getBR() {
		return T.getBR();
	}



	public Choice getC() {
		return T.getC();
	}
	







	public JLabel getLbl() {
		return T.getLbl();
	}

	public JLabel getlbl(){
		return T.getlbl();
	}






	public JFormattedTextField getFormattedTextField() {
		return T.getFormattedTextField();
	}






	public Date getDateField() {
		return  T.getDateField();
	}

















	











	



	public JTextField getTextField_4() {
		return T.getTextField_4();
	}





	public JTextField getTextField_5() {
		return T.getTextField_5();
	}






	public JTextField getTextField_6() {
		return T.getTextField_6();
	}
	public JTable getTableau() {
		return T.getTableau();
	}
	public Ajoute2 getA() {
		return T.getA();
	}
	public DefaultTableCellRenderer getDtcr() {
		return T.getDtcr();
	}
	public DefaultTableModel getModel() {
		return T.getModel();
	}
	public ArrayList<String> getEnsi() {
		return T.getEnsi();
	}
	public Choice getComboBox() {
		return T.getComboBox();
	}
	public JButton getAjoutebtn() {
		return T.getAjoutebtn();
	}
	public JButton getBtnRetour() {
		return T.getBtnRetour();
	}
	public JButton getBtnSupprimerSance() {
		return T.getBtnSupprimerSance();
	}

	public JButton getAjou() {
		return T.getAjou();
	}



	public JButton getCancel() {
		return T.getCancel();
	}
	public JButton getBtnAjouter() {
		return T.getBtnAjouter();
	}
	 public Choice getComboBox_1() {
			return T.getComboBox_1();
		}




	public JButton getBtnAnnuler() {
		return T.getBtnAnnuler();
	}
	   
		public JButton getE() {
			return T.getE();
		}
		public JButton getCb() {
			return T.getCb();
		}
		public JPanel getTab(){
			return T.tab;
		}
		public JPanel getTab1(){
			return T.tab1;
		}
		public void setMatiere(Choice choicess) {
			T.setMatiere(choicess);
		}
		public void setSalles(Choice choicess) {
			T.setSalles(choicess);
		}
		public void setW(Ajoute1 ajoute1) {
			T.setW(ajoute1);
			
		}
		public void setCombo_1(Choice initcombo) {
			T.setcombo_1(initcombo);
		}
		public JTable getTableau1() {
			return T.getTableau1();
		}
		public Choice getComboBox_2(){
			return T.getComboBox2();
		}
		public void setlvl(ArrayList<niveau> A){
			T.setlvl(A);
			}
		public  JPanel getAS(myMain a){
			T=a;
		return T;
		}
		public DefaultTableModel getMod(){
			return T.getMod();
		}
		public Ajoute1 getW() {
			return T.getW();
		}
		public void setComboBOX_2(Choice initcombo) {
			T.setComboBOX_2(initcombo);
		}
		public Ajoute2 getajout2() {
			return T.getajout2();
		}
		 public JButton getAjoutbtn2() {
				return T.getAjoutbtn2();
			}
		public void setA(Ajoute2 a) {
			T.setA(a);
		}

		 public void setChoice(Choice c){
			 T.setChoice(c);
		 }
   
}

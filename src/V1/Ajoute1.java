package V1;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import M.Control;
import M.Salle;
import M.matiere;

import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ajoute1 extends JDialog {

	private JPanel contentPane;
	String Niv,Classe;
	Choice Salles,Matiere;
	private DefaultComboBoxModel<String> M;
	private DefaultComboBoxModel<String> M1;
	int i,j;
	JButton ajou,cancel;
	

	
	public Ajoute1(String niv,String Classe,int i,int j) {
		
		Niv=niv; this.Classe=Classe;
		this.i=i; this.j=j;
		setResizable(false);
	
		setBounds(400, 250, 370, 191);
		getContentPane().setLayout(null);
		
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		getContentPane().setLayout(null);
		
		

		

		
	
		getContentPane().setLayout(null);
		ajou=new JButton("Ajouter");
	
		ajou.setBounds(66, 116, 80, 23);
		 cancel=new JButton("Annuler");
		cancel.setBounds(197, 116, 89, 23);
		getContentPane().add(ajou);
		getContentPane().add(cancel);
		
		JLabel lblMatiere = new JLabel("Matiere");
		lblMatiere.setBounds(0, 15, 46, 14);
		getContentPane().add(lblMatiere);
		
		JLabel lblSallesLibre = new JLabel(" Salles libres");
		lblSallesLibre.setBounds(152, 15, 75, 14);
		getContentPane().add(lblSallesLibre);
		
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	 public void initialize(String niv,String Classe,int i,int j) {
		
		Niv=niv; this.Classe=Classe;
		this.i=i; this.j=j;
		

	
	
	}
	


	public String getNiv() {
		return Niv;
	}



	public String getClasse() {
		return Classe;
	}



	public Choice getSalles() {
		return Salles;
	}



	public Choice getMatiere() {
		return Matiere;
	}



	public DefaultComboBoxModel<String> getM() {
		return M;
	}



	public DefaultComboBoxModel<String> getM1() {
		return M1;
	}



	public int getI() {
		return i;
	}



	public int getJ() {
		return j;
	}



	public JButton getAjou() {
		return ajou;
	}



	public JButton getCancel() {
		return cancel;
	}



	public void setMatiere(Choice choicess) {
		Matiere=choicess;
	}



	public void setSalles(Choice choicess) {
		Salles=choicess;
	}
	 }
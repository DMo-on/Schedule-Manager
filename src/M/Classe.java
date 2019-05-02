package M;

import java.util.ArrayList;

public class Classe {
	Emptemp Emp;
	String Nom;
	 Classe(String nom,Emptemp Emp){
		 Nom=nom;
		 this.Emp=Emp;
	 }
	public Emptemp getEmp() {
		return Emp;
	}
	public void setEmp(Emptemp emp) {
		Emp = emp;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	 
	public boolean equals(Object o){
		 if(o instanceof Classe){
			 if(((Classe) o).getNom().equals(getNom()) && ((Classe) o).getEmp().equals(getEmp()) )
				 return true;
		 }
	 			return false;
	 			}
	public séance[][] getemp(){
		return Emp.getMatrice();
		
	}
	public String[][]gettempstring(){
		String[][] A =new String[7][6];
		for(int i=0;i<7;i++){
			for(int j=0;j<6;j++) A[i][j]=getemp()[i][j].toString();
		}
		return A;
	}
	public ArrayList<séance> getempensi(Enseignants A){
		return Emp.getséanceeensign(A);
		
	}
	public String toString()
	{
			return Nom;
	}
	public int modifemp(Salle s, matiere mat, int i, int j) {
		return Emp.modifemp(s,mat,i,j);
	}
	public boolean Salleoccup(int i,int j,Salle s){
		return Emp.salleoccupe(i, j, s);
	}

	public void suprimerséance(int i, int j) {
	Emp.suprimeséance(i,j);
	}

}

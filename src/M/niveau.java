package M;

import java.util.ArrayList;

public class niveau {
ArrayList<Classe> Cl;
ArrayList<matiere> matieres;
int niv;
	
	public niveau(ArrayList<Classe> cl,ArrayList<matiere> mats,int niv){
	Cl=cl;
	matieres=mats;
	this.niv=niv;
}

	public ArrayList<Classe> getCl() {
	return Cl;
}
	public void setCl(ArrayList<Classe> cl) {
	Cl = cl;
}
	public ArrayList<matiere> getMatieres() {
	return matieres;
}
	public void setMatieres(ArrayList<matiere> matieres) {
	this.matieres = matieres;
}
	public int getniv(){
		return niv;
	}
	public void setniv(int niveau){
		niv=niveau;
	}
	public String toString()
		{
		return niv+"";
		
	}
	public séance[][] empdeclasse(String nom){
		if(rechClas(nom)==null) return null;
		return rechClas(nom).getemp();
	}
	public Classe rechClas(String nom){
		for(Classe e:Cl){
			if(e.getNom().equalsIgnoreCase(nom))
				return e;
		}
		return null;
	}
	public boolean equals(Object o)
		{
		if(o instanceof niveau)
		{
			if(((niveau) o).getniv()==getniv())
				return true;
		}
		return false;
	}

	public String[][] getemp(String classe) {
		Classe a=rechClas(classe);
		if(a!=null){
			return a.gettempstring();
			
		}
		return null;
	}

	public int modifemp(String classe, Salle S, matiere mat, int i, int j,ArrayList<Enseignants> A) {
		Enseignants B=null;
		
		
		Classe c=rechClas(classe);
		for(Enseignants e:A){
			if(e.Classexist(c))
			{				
				B=e;
				break;
			}
		}
		if(B!=null){
			
			if(!B.EnsiOccupe(i, j))
			{if(c.modifemp(S,mat,i,j)==0) return -1;
			return 1;}

		}
		return 0;
		
	}

	public void Suprimeséance(String classe, int i, int j) {
		Classe e=rechClas(classe);
		e.suprimerséance(i,j);
	}
	public boolean Classoccupe(int i,int j,Salle s){
		for(Classe e:Cl){
			if(e.Salleoccup(i, j, s))
				return true;
		}
		return false;
	}
	

}

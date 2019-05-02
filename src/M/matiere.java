package M;

import java.util.ArrayList;

public class matiere {
	private String Nom;
	private ArrayList<Enseignants>  EnseignAssur;
	public matiere(String nomMat) {
		Nom = nomMat;
		EnseignAssur=new ArrayList<>();

	
	}
	public matiere(String nomMat,Enseignants enseignAssur) {
		Nom = nomMat;
		EnseignAssur=new ArrayList<>();
		addEnseignAssur(enseignAssur);
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nomMat) {
		Nom = nomMat;
	}
	public ArrayList<Enseignants> getEnseignAssur() {
		return EnseignAssur;
	}
	public boolean Enseignassur(Enseignants A){
		for(Enseignants e:EnseignAssur)
			if(e.equals(A)) return true;
		return false;
	}
	public void addEnseignAssur(Enseignants A) {
             if(!Enseignassur(A)) EnseignAssur.add(A);
	}
	public String toString(){
		return Nom;
	}
	public boolean equals(Object o){
		if(o instanceof matiere){
			if(((matiere) o).getNom().equals(getNom()))
				return true;
		}
		return false;
	}
	public boolean matiereexist(ArrayList<matiere> a) {
		for(matiere e:a){
			if(e.equals(a)) return  true;
		}
		return false;
	}
	
}

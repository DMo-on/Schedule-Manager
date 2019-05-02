package M;

public class Salle {
	
	private String Nom;
	Salle(String nom){
		Nom=nom;
	}

	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}

	public boolean equals(Object o){
		if(o instanceof Salle){
			if(((Salle) o).getNom().equals(getNom())) 
				return true;
		}
			return false;
	}
	public String toString(){
		return Nom;
	}
	
	
}

package M;


import java.util.ArrayList;

	public abstract class Enseignants {
	private String Nom,Pr�nom,Numtel,Adress;
 	private ArrayList<Classe> classes;
 	private matiere Mat;

	Enseignants(String nom, String pr�nom, String numtel, String adress, matiere Mat) {
		Nom = nom;
  	  classes=new ArrayList<>();

		Pr�nom = pr�nom;
		Numtel = numtel;
		Adress = adress;
		this.Mat=Mat;
		Mat.addEnseignAssur(this);
		
	}
	public String getNumtel() {
		return Numtel;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPr�nom() {
		return Pr�nom;
	}
	public void setPr�nom(String pr�nom) {
		Pr�nom = pr�nom;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}

	public void setNumtel(String numtel) {
		Numtel = numtel;
	}
 
    public matiere getMat() {
	     return Mat;
}
    public void setMat(matiere mat) {
		   Mat = mat;
}
    public void Ajouteclasses(Classe A) {
    	classes.add(A);
    	//if(!Classexist(A)) classes.add(A);
    }
	public boolean Classexist(Classe A){
		for(Classe e:classes){
			if(e.equals(A)) return true;
		}
		return false;
}
	public ArrayList<Classe> getClasses() {
	return classes;
} 
	@Override
	public boolean equals(Object o){
		if(o instanceof Enseignants){
			if(((Enseignants) o).getNom().equals(this.getNom()) && ((Enseignants) o).getPr�nom().equals(this.getPr�nom())) return true;
		}
		return false;
	}
	public s�ance[][] empenisgn(){
		ArrayList<s�ance> mat=new ArrayList<>();
		for(Classe e:classes){
			
			mat.addAll(e.getempensi(this));
			
		}
		
		Emptemp empen=new Emptemp(mat);
		return empen.getMatrice();

		
		
		
	}
	public String[][]gettempstring(){
		String[][] A =new String[7][6];
		s�ance[][] B= empenisgn();
		for(int i=0;i<7;i++){
			for(int j=0;j<6;j++) A[i][j]=B[i][j].toString();
		}
		return A;
	}
	public boolean EnsiOccupe(int i,int j){
		if(empenisgn()[i-8][j].libre()) return false;
		return true;
	}

	
}

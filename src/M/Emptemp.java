package M;

import java.util.ArrayList;

public class Emptemp {
	ArrayList<séance> Seances;
	//nombre de séance extra max pour une matiere par semaine
	int maxAr=3,maxFr=2,maxMa=1,maxSI=2,maxAng=1;
	Emptemp(ArrayList<séance> Se){
		this.Seances=Se;
		
	}
	Emptemp(){
		Seances=new ArrayList<>();
	}
	public ArrayList<séance> getSeances() {
		return Seances;
	}
	public void setSeances(ArrayList<séance> seances) {
		Seances = seances;
	}

	void EmptempAjoutséance(séance A){
		if(!séanceexist(A)) Seances.add(A);
		
	}
	private boolean séanceexist(séance a) {
	   for(séance s:Seances){
		   if(s.equals(a)) 
			   return true;
	   }
		return false;
	}
	public séance[][] getMatrice(){
		séance[][] mat=init();
		for(séance S:Seances){
			
			if(Control.jour(S.getJour())!=-1){ 
				
			mat[S.getHour()-8][Control.jour(S.getJour())]=S;
		}}
		
			
			return mat;
		
	}
	public ArrayList<séance> getséanceeensign(Enseignants A){
		ArrayList<séance> mat=new ArrayList<>();
		for(séance S:Seances){

			if(S.enseign(A)){			
			mat.add(S);}
		}
		
			
			return mat;
		
		
	}
	public ArrayList<séance> getséanceSalle(Salle A){
		
		ArrayList<séance> mat=new ArrayList<>();
		for(séance S:Seances){
			if(S.getSalle().equals(A))
			mat.add(S);
		}
		return mat;
	}
	public séance[][] init(){
		séance[][] mat=new séance[7][6];
		for(int i=0;i<7;i++){
			for(int j=0;j<6;j++){
				mat[i][j]=new séance(i+8,Control.numjour(j));
				
			}
		}
		return mat;
	}
	public static ArrayList<séance> Rechlibre(séance[][] temp,String jour) {
		ArrayList<séance> Temp = new ArrayList<>();
			
			for(int i=0;i<7;i++)
			{ if(temp[i][Control.jour(jour)]!=null){
				if(temp[i][Control.jour(jour)].toString().equals(""))
					Temp.add(temp[i][Control.jour(jour)]);  }
			}
			return Temp;
	}
	public int modifemp(Salle s, matiere mat, int i, int j) {
	
		if(getNBmax(mat)>0){
			AdjustNBleft(mat);
		séance w=new séance(i,Control.numjour(j),mat,s);
		Seances.add(w) ;
		return 1;}
		return 0;
		
	}
	public void suprimeséance(int i, int j) {
		int a=séanceindex(getMatrice()[j][i-8]);
		if(a!=-1){	
		Seances.remove(a);}
	}
	private int séanceindex(séance a){
		for(int i=0;i<Seances.size();i++){
			if(Seances.get(i)!=null && a!=null){
			if(Seances.get(i).equals(a)) return i;}
		}
		return -1;}
	public boolean salleoccupe(int i,int j,Salle s){
		if(getMatrice()[i][j].getSalle()!=null)
		if(getMatrice()[i][j].getSalle().equals(s))
			return true;
		return false;
		
	}
	private int getNBmax(matiere m){
		if(m.getNom().equalsIgnoreCase("Arabe"))
			return maxAr;
		if(m.getNom().equalsIgnoreCase("Français"))
		return maxFr;
		if(m.getNom().equalsIgnoreCase("Anglais"))
			return maxAng;
		if(m.getNom().equalsIgnoreCase("Math"))
			return maxMa;
		if(m.getNom().equals("Science Islamique"))
			return maxSI;
		return 0;
		
					
		
	}
	private void AdjustNBleft(matiere m){
		if(m.getNom().equalsIgnoreCase("Arabe"))
			 maxAr--;
		if(m.getNom().equalsIgnoreCase("Français"))
		 maxFr--;
		if(m.getNom().equalsIgnoreCase("Anglais"))
			 maxAng--;
		if(m.getNom().equalsIgnoreCase("Math"))
			 maxMa--;
		if(m.getNom().equals("Science Islamique"))
			 maxSI--;
		
	}
	
	


}

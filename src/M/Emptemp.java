package M;

import java.util.ArrayList;

public class Emptemp {
	ArrayList<s�ance> Seances;
	//nombre de s�ance extra max pour une matiere par semaine
	int maxAr=3,maxFr=2,maxMa=1,maxSI=2,maxAng=1;
	Emptemp(ArrayList<s�ance> Se){
		this.Seances=Se;
		
	}
	Emptemp(){
		Seances=new ArrayList<>();
	}
	public ArrayList<s�ance> getSeances() {
		return Seances;
	}
	public void setSeances(ArrayList<s�ance> seances) {
		Seances = seances;
	}

	void EmptempAjouts�ance(s�ance A){
		if(!s�anceexist(A)) Seances.add(A);
		
	}
	private boolean s�anceexist(s�ance a) {
	   for(s�ance s:Seances){
		   if(s.equals(a)) 
			   return true;
	   }
		return false;
	}
	public s�ance[][] getMatrice(){
		s�ance[][] mat=init();
		for(s�ance S:Seances){
			
			if(Control.jour(S.getJour())!=-1){ 
				
			mat[S.getHour()-8][Control.jour(S.getJour())]=S;
		}}
		
			
			return mat;
		
	}
	public ArrayList<s�ance> gets�anceeensign(Enseignants A){
		ArrayList<s�ance> mat=new ArrayList<>();
		for(s�ance S:Seances){

			if(S.enseign(A)){			
			mat.add(S);}
		}
		
			
			return mat;
		
		
	}
	public ArrayList<s�ance> gets�anceSalle(Salle A){
		
		ArrayList<s�ance> mat=new ArrayList<>();
		for(s�ance S:Seances){
			if(S.getSalle().equals(A))
			mat.add(S);
		}
		return mat;
	}
	public s�ance[][] init(){
		s�ance[][] mat=new s�ance[7][6];
		for(int i=0;i<7;i++){
			for(int j=0;j<6;j++){
				mat[i][j]=new s�ance(i+8,Control.numjour(j));
				
			}
		}
		return mat;
	}
	public static ArrayList<s�ance> Rechlibre(s�ance[][] temp,String jour) {
		ArrayList<s�ance> Temp = new ArrayList<>();
			
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
		s�ance w=new s�ance(i,Control.numjour(j),mat,s);
		Seances.add(w) ;
		return 1;}
		return 0;
		
	}
	public void suprimes�ance(int i, int j) {
		int a=s�anceindex(getMatrice()[j][i-8]);
		if(a!=-1){	
		Seances.remove(a);}
	}
	private int s�anceindex(s�ance a){
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
		if(m.getNom().equalsIgnoreCase("Fran�ais"))
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
		if(m.getNom().equalsIgnoreCase("Fran�ais"))
		 maxFr--;
		if(m.getNom().equalsIgnoreCase("Anglais"))
			 maxAng--;
		if(m.getNom().equalsIgnoreCase("Math"))
			 maxMa--;
		if(m.getNom().equals("Science Islamique"))
			 maxSI--;
		
	}
	
	


}

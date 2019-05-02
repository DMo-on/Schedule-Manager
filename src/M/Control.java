package M;


import java.util.ArrayList;
import java.util.Date;

import V1.P;

public class Control {
	
	
	 ArrayList<niveau> Levels;
	 ArrayList<Salle> salles;
	 ArrayList<Enseignants> Enseignants;
	public   Control(){
		Levels=new ArrayList<>();
		salles=new ArrayList<>();
		Enseignants=new ArrayList<>();
		ArrayList<Classe> cl=new ArrayList<>();
		ArrayList<matiere> sea=new ArrayList<>();
		
		Emptemp emp1=new Emptemp();
		Emptemp emp2=new Emptemp();

		matiere m1=new matiere("Arabe");
		matiere m2=new matiere("Français");
		matiere m3=new matiere("Anglais");


		Salle s1=new Salle("143t");
		Salle s2=new Salle("168t");
		Classe c1=new Classe("c1", emp1);
		Classe c2=new Classe("c2", emp2);
		séance S1=new séance(8,"samdi",m1,s1);
		séance S2=new séance(9,"samdi",m2,s2);
		séance S3=new séance(11,"samdi",m1,s2);
		emp1.EmptempAjoutséance(S1);	
		emp1.EmptempAjoutséance(S2);
		emp1.EmptempAjoutséance(S3);
		

		permanent e1=new permanent("harrouz","wail","2","333s",m1,"gr",new Date());
		permanent e2=new permanent("djebri","mounira","2","333s",m2,"grad",new Date(13,12,15));
		e2.Ajouteclasses(c1);
		e2.Ajouteclasses(c2);
		e1.Ajouteclasses(c1);
		e1.Ajouteclasses(c2);
		Enseignants.add(e1);
		Enseignants.add(e2);
		salles.add(new Salle("165t"));
		salles.add(s1);
		salles.add(s2);


		cl.add(c1); cl.add(c2);
		sea.add(m1);
		sea.add(m2);
		sea.add(m3);
		niveau n=new niveau(cl,sea,1);
		Levels.add(n);
		
		

	

		

	

		
		
		 
	 }
	
	
	
	
	
	public static   int jour(String jour){
		if(jour.equalsIgnoreCase("Samdi")) return 0;
		if(jour.equalsIgnoreCase("dimanche")) return 1;
		if(jour.equalsIgnoreCase("lundi")) return 2;
		if(jour.equalsIgnoreCase("mardi")) return 3;
		if(jour.equalsIgnoreCase("mercredi")) return 4;
		if(jour.equalsIgnoreCase("jeudi")) return 5;
		if(jour.equalsIgnoreCase("vendredi")) return 6;
		return -1;
		
	}
	public static   String numjour(int jour){
		if(jour==0) return "Samdi";
		if(jour==1) return "dimanche";
		if(jour==2) return "lundi";
		if(jour==3) return "mardi";
		if(jour==4) return "mercredi";
		if(jour==5) return "jeudi";
		if(jour==6) return "vendredi";
		return ""
				;
		
	}
	
	public  ArrayList<séance> Rechcrénaulibre(String nom,String j){
		séance[][] temp=null;
		ArrayList<séance> Crénau=null;
		for(niveau e:Levels)
		{
			if(e.empdeclasse(nom)!=null) {
				temp=e.empdeclasse(nom);
				break;
			}
		
		
		
	} 		
		if(temp==null) return null;
		Crénau=Emptemp.Rechlibre(temp, j);

return Crénau;
}
	public  ArrayList<niveau> getlevels(){
		return Levels;
	}





	public  ArrayList<Salle> getSalleslibre(int jour,int heure) {
		ArrayList<Salle> A=new ArrayList<>();
		for(Salle e:salles){
			if(!Salleoccupe(jour, heure, e)) 
				A.add(e);
		}
		return A;
	}





	public  ArrayList<matiere> getMat( String niv) {
		niveau A=Niv(niv);	
		
		return A.getMatieres();
	}
	public  ArrayList<Enseignants> getens(){
		return Enseignants;
	}





	public  int ajout(String mat, String salle, String niv, String classe, int i, int j) {
			niveau A=Niv(niv);
			
			return A.modifemp(classe,rechSalle(salle),rechMat(mat,A), i, j,getens());
	}



	private  Enseignants rechEnsi(String ensi) {
		for(Enseignants e:Enseignants) {
			if(e.toString().equals(ensi))  return e;}
		return null;
	}


	private  Salle rechSalle(String salle) {
		for(Salle e:salles) {if(e.toString().equals(salle)) 
			
			
			return e;}
		return null;
	}





	private  matiere rechMat(String mat,niveau A) {
		
		if(A==null){
			for(niveau b:Levels){
				for(matiere e: b.getMatieres()) if(e.toString().equals(mat)) return e;
				return null;
			}
		}
		for(matiere e: A.getMatieres()) if(e.toString().equals(mat)) return e;
		return null;
	}





	public  niveau Niv(String A){
		for(niveau e:this.getlevels()){ 
			if(e.toString().equals(A)) {;return e;}
		}
		return null;
	}





	public  ArrayList<Classe> getclasses(String ite) {
		if(Niv(ite)!=null)
		{ 
		return Niv(ite).Cl;}
		return null;

	}
	





	public  String[][] getemp(String niv, String classe) {
		niveau n=Niv(niv);
		if(n!=null){
			
			return n.getemp(classe);
		
		}		

		return null;
		}





	public  String[][] getempensi(String ensi) {
	Enseignants A=	rechEnsi(ensi);
	
	return A.gettempstring();
	}
	public  boolean Salleoccupe(int i,int j,Salle s){
		for(niveau n:Levels){
			if(n.Classoccupe(i, j, s))
				return true;
		}
		return false;
	}





	public  ArrayList<String> getAllmats() {
		ArrayList<matiere> A =new ArrayList<>();
		ArrayList<String> result =new ArrayList<>();

		for(niveau n:Levels){
			for(matiere m:n.matieres){
				if(!m.matiereexist(A))
					A.add(m);
			}
			
		}
		for(matiere m:A){	
			result.add(m.toString());
			
		}
		return result;
	}





	public  void addEnsign(String nom, String prénom, String adress, String numtel,int num,String mat,Date date,Object extra, ArrayList<String[]> list) {
		matiere matier=rechMat(mat,null);
		if(num==1){
		Enseignants.add(new permanent(nom,prénom,numtel,adress,matier,(String)extra,date));
		for(int i=0;i<list.size();i++){
			if(Niv(list.get(i)[0])!=null && Niv(list.get(i)[0]).rechClas(list.get(i)[1])!=null)
			
		Enseignants.get(Enseignants.size()-1).Ajouteclasses(Niv(list.get(i)[0]).rechClas(list.get(i)[1]));	
			else System.out.println("error");
			}
		
		
		}
	if(num==2){
		Enseignants.add(new vacataires(nom,prénom,adress,numtel,date,(Date)extra,matier));
		for(int i=0;i<list.size();i++){
			if(Niv(list.get(i)[0])!=null && Niv(list.get(i)[0]).rechClas(list.get(i)[1])!=null)
			
		Enseignants.get(Enseignants.size()-1).Ajouteclasses(Niv(list.get(i)[0]).rechClas(list.get(i)[1]));}
		
		}
	}

	





	public  void supprimerséance(String niv, String classe, int i, int j) {
		niveau e=Levels.get(Integer.parseInt(niv)-1);
		e.Suprimeséance(classe,i,j);
		
	}
	



}
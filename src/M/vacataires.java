package M;

import java.util.Date;

public class vacataires extends Enseignants {
	private Date deb,fin;
	vacataires(String nom, String pr�nom, String numtel, String adress,  Date deb,Date fin, matiere Mat) {
		super(nom, pr�nom, numtel, adress,Mat);
		Datesetter(deb,fin);
		
	}
	public void Datesetter(Date d1,Date d2){
		if(d2.compareTo(d1)>0){
			setFin(d2);
			setDeb(d1);}
		
	}
	
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
	}
	public Date getDeb() {
		return deb;
	}
	public void setDeb(Date deb) {
		this.deb = deb;
	}
	public String toString() {
		return this.getNom()+" "+this.getPr�nom()+String.format("Date d�but %s - Date fin %s",getDeb(),getFin());
	}
	

}

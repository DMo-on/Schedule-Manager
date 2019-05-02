package M;

import java.util.Date;


public class permanent extends Enseignants{
    Date deb;
    String Grade;
    permanent(String nom, String prénom, String numtel, String adress, matiere Mat,String gr,Date d) {
		super(nom, prénom, numtel, adress, Mat);
		Grade=gr;
		deb=d;
	}
    	public String toString() {
		return getNom()+" "+getPrénom();
	}

	public Date getDeb() {
		return deb;
	}
	
	public void setDeb(Date deb) {
		this.deb = deb;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	

}
}

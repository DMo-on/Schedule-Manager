package M;

public class séance {
	int hour;
	String jour;
	Salle Salleseance;
	matiere M;
	
	séance(int a,String jour,matiere M,Salle Sall){
		hour=a;
		this.M=M;
		this.jour=jour;
		Salleseance=Sall;}
	séance(int a,String jour){
		hour=a;
		this.jour=jour;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getendhour(){
		return hour+1;
	}
	
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public Salle getSalle() {
		return Salleseance;
	}
	public void setSalle(Salle Sall) {
		Salleseance = Sall;
	}
	public matiere getM() {
		return M;
	}
	public void setM(matiere m) {
		M = m;
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof séance){
			if(((séance) o).getHour()==getHour() && ((séance) o).getM().equals(getM()))
				return true;
		}
		return false;
		
	}
	public String toString(){
		if(M!=null && Salleseance!=null)return M.toString()+"\n"+getSalle().toString();
			
		return"";
	}
	public boolean libre(){
		if(this.toString().equals("")) return true;
		return false;
	}
	public boolean enseign(Enseignants A){
		if(A.getMat().equals(getM()))
			return true;
		return false;
	}
	
}

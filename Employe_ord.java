package tp5;

public class Employe_ord extends Employe {
	private int nbh;
	private double prix_h;
	public Employe_ord(String nom) {
	    super(nom);
	}
	public Employe_ord(String nom,int nbh,double prix_h) {
	super(nom);
	this.nbh=nbh;
	this.prix_h=prix_h;

}
public void setInfo(int nbh,double prix_h) {
	this.nbh=nbh;
	this.prix_h=prix_h;
}
public double getSalaire() {
	int hn=Math.min(nbh,39);
	int hsupp=Math.max(0, nbh-39);
	double salaire=hn*prix_h+hsupp*prix_h*1.5;
	return salaire;
	
}
}

package tp5;

public class Commerciaux extends Employe{
	private double prix_fixe;
	private double ca;
	public Commerciaux(String nom,double prix_fixe,double ca) {
		super(nom);
		this.prix_fixe=prix_fixe;
		this.ca=ca;
	}
	public void setInfo(double prix_fixe,double ca) {
		this.prix_fixe=prix_fixe;
		this.ca=ca;
	}
	@Override
	public double getSalaire() {
		return prix_fixe+0.01*ca;
	}

}

package model;

public class ReservationSpectacle extends Reservation{
	private int numZone;
	
	public ReservationSpectacle(int jour, int mois, int numZone, int numChaise) {
		super(jour, mois, numChaise);
		this.numZone = numZone;
	}
	
	public String toString() {
		return "Le " + (super.getJour()) + "/" + (super.getMois()) + " : zone n°" + numZone 
				+ " chaise n°" + super.getNumEntite() + ".";
	}
}

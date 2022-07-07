package domein;

public class Rechthoek extends Veelhoek {
	
	private double breedte;
	private double lengte;

	public Rechthoek(double breedte, double lengte) {
		super(4);
		try {
			this.setBreedte(breedte);
			this.setLengte(lengte);
		}
		catch(IllegalArgumentException e) {
			System.err.println(e);
		}
		// TODO Auto-generated constructor stub
	}

	public double getBreedte() {
		return breedte;
	}

	private void setBreedte(double breedte) {
		if(breedte <= 0.0 || breedte >= 20.0) {
			throw new IllegalArgumentException("0.0 < breedte < 20.0");
		}
		this.breedte = breedte;
	}

	public double getLengte() {
		return lengte;
	}

	private void setLengte(double lengte) {
		if(lengte <= 0.0 || lengte >= 20.0) {
			throw new IllegalArgumentException("0.0 < lengte < 20.0");
		}
		this.lengte = lengte;
	}
	
	public double berekenOppervlakte() {
		return ((double)(this.getBreedte() * this.getLengte()));
	}
	
	public double berekenOmtrek() {
		return ((this.getBreedte() + this.getLengte()) * 2.0);
	}
	
	@Override
	public String toString() {
		return String.format("%sLengte = %.1f%nBreedte = %.1f%nOmtrek = %.1f%nOppervlakte = %.1f%n", super.toString(), this.getLengte(), this.getBreedte(), this.berekenOmtrek(), this.berekenOppervlakte());
	}

}

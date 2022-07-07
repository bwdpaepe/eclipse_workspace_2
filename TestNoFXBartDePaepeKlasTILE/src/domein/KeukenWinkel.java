package domein;

public class KeukenWinkel extends Winkel {

	public KeukenWinkel(String naam, String vestigingsplaats, String sector, int omzet) {
		super(naam, vestigingsplaats, sector, omzet);
		// TODO Auto-generated constructor stub
	}

	public KeukenWinkel(String naam, String vestigingsplaats, String sector, int omzet, Classificatie classificatie) {
		super(naam, vestigingsplaats, sector, omzet, classificatie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double geefJaarlijkseBelasting() {
		// TODO Auto-generated method stub
		return 2500.0;
	}

}

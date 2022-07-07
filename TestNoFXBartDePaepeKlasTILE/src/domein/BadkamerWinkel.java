package domein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BadkamerWinkel extends Winkel {
	
	private List<DoucheBak> voorraad;

	public BadkamerWinkel(String naam, String vestigingsplaats, String sector, int omzet, Classificatie classificatie) {
		//super(naam, vestigingsplaats, sector, omzet, classificatie);
		this(naam, vestigingsplaats, sector, omzet, classificatie,new ArrayList<>());
		// TODO Auto-generated constructor stub
	}

	public BadkamerWinkel(String naam, String vestigingsplaats, String sector, int omzet, Classificatie classificatie, List<DoucheBak> voorraad) {
		super(naam, vestigingsplaats, sector, omzet, classificatie);
		this.setVoorraad(voorraad);
		// TODO Auto-generated constructor stub
	}

	public List<DoucheBak> getVoorraad() {
		return voorraad;
	}

	private void setVoorraad(List<DoucheBak> voorraad) {
		this.voorraad = voorraad;
	}
	
	public DoucheBak[] geefDoucheBakkenMetLengteEnBreedteEnMateriaal(int deLengte, int deBreedte, String hetMateriaal) {
		List<DoucheBak> output = new ArrayList<>();
		for(DoucheBak db: this.getVoorraad()) {
			if(db.getBreedte() >= deBreedte && db.getLengte() >= deLengte) {
				output.add(db);
			}
		}
		
		return output.toArray(new DoucheBak[output.size()]);
	}
	
	@Override
	public String toString() {
		String output = "";
		//String output = String.format("%s %s, in %s, sector = %s, omzet = %d%n", this.getClass().getSimpleName(), this.getNaam(), this.getVestigingsplaats(), this.getSector(), this.getOmzet());
		output += super.toString();
		int counter = 1;
		for(DoucheBak db: this.getVoorraad()) {
			output += String.format("%n%s %d: %s", db.getClass().getSimpleName(), counter, db);
			counter++;
		}
		
		return output;
	}
	
	public void voegDoucheBakAanVoorraadToe(DoucheBak doucheBak) {
		this.voorraad.add(doucheBak);
	}

	@Override
	public double geefJaarlijkseBelasting() {
		// TODO Auto-generated method stub
		return (double)((this.getOmzet() * 2.5) / 100.0);
	}

}

package domein;

import exceptions.SectorMisMatchException;

public abstract class Winkel implements TeBetalenBelasting {
	private String naam;
	private String vestigingsplaats;
	private String sector;
	private int omzet;
	private Classificatie classificatie;
	
	public Winkel(String naam, String vestigingsplaats, String sector, int omzet) {
		this(naam,vestigingsplaats,sector,omzet,Classificatie.KLEIN);
	}
	
	public Winkel(String naam, String vestigingsplaats, String sector, int omzet, Classificatie classificatie) {
		this.setNaam(naam);
		this.setVestigingsplaats(vestigingsplaats);
		try {
			this.setSector(sector);
		} catch (SectorMisMatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setOmzet(omzet);
		this.setClassificatie(classificatie);
	}

	public String getNaam() {
		return naam;
	}

	private void setNaam(String naam) {
		if(naam == null || naam.trim().isEmpty()) {
			throw new IllegalArgumentException("naam mag niet leeg zijn");
		}
		this.naam = naam;
	}

	public String getVestigingsplaats() {
		return vestigingsplaats;
	}

	private void setVestigingsplaats(String vestigingsplaats) {
		this.vestigingsplaats = vestigingsplaats;
	}

	public String getSector() {
		return sector;
	}

	private void setSector(String sector) throws SectorMisMatchException {
		if(sector == null || sector.trim().isEmpty()) {
			throw new SectorMisMatchException("sector mag niet leeg zijn");
		}
		else {
			if(!sector.matches("([A-Z]{3}\\d{4})||([a-z]{5}\\d{2,})")) {
				throw new SectorMisMatchException("sector voldoen aan formaat AAA1111 of aaaaa33..");
			}
			else {
				this.sector = sector;
			}
		}
		
	}

	public int getOmzet() {
		return omzet;
	}

	private void setOmzet(int omzet) {
		if(omzet<=0) {
			throw new IllegalArgumentException("omzet >= 0 !");
		}
		this.omzet = omzet;
	}

	public Classificatie getClassificatie() {
		return classificatie;
	}

	private void setClassificatie(Classificatie classificatie) {
		if(classificatie == null) {
			throw new IllegalArgumentException("classificatie mag niet leeg zijn");
		}
		this.classificatie = classificatie;
	}
	
	@Override
	public String toString() {
		String output = String.format("%s %s, in %s, sector = %s, omzet = %d%n", this.getClass().getSimpleName(), this.getNaam(), this.getVestigingsplaats(), this.getSector(), this.getOmzet());
		return output;
	}
	
	

}

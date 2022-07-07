package domein;

import java.util.Objects;

public class Werknemer implements Comparable<Werknemer>{
	
	private final long stamboeknr;
    private final String naam, voornaam;
    private String woonplaats;

    public Werknemer(long stamboeknr, String naam, String voornaam) {
        this(stamboeknr,naam,voornaam,"Gent");
    }

    public Werknemer(long stamboeknr, String naam, String voornaam, String woonplaats) {
        this.stamboeknr = stamboeknr;
        this.naam = naam;
        this.voornaam = voornaam;
        setWoonplaats(woonplaats);
    }

    
    public long getStamboeknr() {
        return stamboeknr;
    }

    public String getNaam() {
        return naam;
    }


    public String getVoornaam() {
        return voornaam;
    }


    public String getWoonplaats() {
        return woonplaats;
    }

    private void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    @Override
    public String toString() {
        return String.format("Werknemer: %d - %s %s, uit %s", stamboeknr, voornaam, naam, woonplaats);
    }

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + (int) (stamboeknr ^ (stamboeknr >>> 32));
//		return result;
		return Objects.hash(stamboeknr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Werknemer other = (Werknemer) obj;
		if (stamboeknr != other.stamboeknr)
			return false;
		return true;
	}

	@Override
	public int compareTo(Werknemer o) {
		// TODO Auto-generated method stub
		//return 0;
		return Long.compare(this.stamboeknr, o.stamboeknr);
	}
    
    

}

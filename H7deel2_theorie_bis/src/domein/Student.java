package domein;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private long stamboeknr;
    private String naam, voornaam, woonplaats;

    public Student(long stamboeknr, String naam, String voornaam, String woonplaats)
    {
        setStamboeknr(stamboeknr);
        setNaam(naam);
        setVoornaam(voornaam);
        setWoonplaats(woonplaats);       
    }
    
    public long getStamboeknr()
    {
        return stamboeknr;
    }    
    public final void setStamboeknr(long stamboeknr)
    {
        if(stamboeknr==0)
            throw new IllegalArgumentException("Geen correct stamboeknr");
        this.stamboeknr = stamboeknr;
    }
    public String getNaam()
    {
        return naam;
    }
    private void controleNullString(String string)
    {
        if(string==null)
            throw new IllegalArgumentException("Null");
    }
    public final void setNaam(String naam)
    {
        controleNullString(naam);
        this.naam = naam;
    }
    public String getVoornaam()
    {
        return voornaam;
    }
    public final void setVoornaam(String voornaam)
    {
        controleNullString(voornaam);
        this.voornaam = voornaam;
    }
    public String getWoonplaats()
    {
        return woonplaats;
    }
    public final void setWoonplaats(String woonplaats)
    {
        controleNullString(woonplaats);
        this.woonplaats = woonplaats;
    }

	@Override
	public int hashCode() {
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
		Student other = (Student) obj;
		return stamboeknr == other.stamboeknr;
	}
	
	@Override
    public String toString()
    {
        return String.format("%nStudent{stamboeknr=%d, naam=%s, voornaam=%s, woonplaats=%s}",
					stamboeknr, naam, voornaam, woonplaats);
    }

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Long.compare(this.stamboeknr, o.stamboeknr);
		//return this.stamboeknr.compareTo(o.stamboeknr);
	}

	
    


}

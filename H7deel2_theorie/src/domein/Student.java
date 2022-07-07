package domein;

public class Student implements Comparable<Student>{
	private long stamboeknr;
	private String naam, voornaam, woonplaats;
	
	public Student(long stamboeknr, String naam, String voornaam, String woonplaats) {
		this.stamboeknr = stamboeknr;
		this.naam = naam;
		this.voornaam = voornaam;
		this.woonplaats = woonplaats;
	}
	
	
	
	public long getStamboeknr() {
		return stamboeknr;
	}



	public void setStamboeknr(long stamboeknr) {
		this.stamboeknr = stamboeknr;
	}



	public String getNaam() {
		return naam;
	}



	public void setNaam(String naam) {
		this.naam = naam;
	}



	public String getVoornaam() {
		return voornaam;
	}



	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}



	public String getWoonplaats() {
		return woonplaats;
	}



	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}



	@Override
	public int compareTo(Student o) {
		return Long.compare(this.stamboeknr, o.stamboeknr);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (stamboeknr ^ (stamboeknr >>> 32));
		return result;
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
		if (stamboeknr != other.stamboeknr)
			return false;
		return true;
	}
	
	

}

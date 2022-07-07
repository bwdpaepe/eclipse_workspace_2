package domein;

import java.util.Objects;

public class Brommer implements Tweewieler
{
    private char klasse;     
    private String nummerplaat;
    
    public Brommer()
    {
        this ('A',"S-AAA001");
    }
    public Brommer(char klasse, String nummerplaat)
    {
        setKlasse(klasse);
        setNummerplaat(nummerplaat);
    } 
    public char getKlasse() 
    {
        return klasse;
    }
    public String getNummerplaat() 
    {
        return nummerplaat;
    }
    private void setKlasse(char klasse)
    {
        if (klasse !='A' && klasse !='B' && klasse !='P')
            throw new IllegalArgumentException("Ongeldige klasse");
        this.klasse = klasse;
    }  

    //TODO: vraag 9
    private void setNummerplaat(String nummerplaat) {
    	switch(this.getKlasse()) {
    	case 'A':
    		if(!nummerplaat.matches("S-A[A-Z]{2}\\d{3}")) {
    			throw new IllegalArgumentException("de nummerplaat moet zijn van het type 'S-AAA001'");
    		}
    		break;
    	case 'B': 
    		if(!nummerplaat.matches("S-B[A-Z]{2}\\d{3}")) {
    			throw new IllegalArgumentException("de nummerplaat moet zijn van het type 'S-AAA001'");
    		}
    		break;
    	case 'P': 
    		if(!nummerplaat.matches("S-P[A-Z]{2}\\d{3}")) {
    			throw new IllegalArgumentException("de nummerplaat moet zijn van het type 'S-AAA001'");
    		}
    		break;
    	default:
    		throw new IllegalArgumentException("ongeldige klasse");
    	}
    }

    //TODO: vraag 10
    public double berekenMilieubijdrageVoorTweewieler() {
    	double milieubijdrage;
    	switch(this.getKlasse()) {
    	case 'A':
    		milieubijdrage = 30.0;
    		break;
    	case 'B': 
    		milieubijdrage = 50.0;
    		break;
    	case 'P': 
    		milieubijdrage = 20.0;
    		break;
    	default:
    		milieubijdrage = 0.0;
    	
    		return milieubijdrage;
    }
    
    public boolean isElektrisch()
    {
        return klasse == 'P';
    }
    @Override
    public String toString()
    {
        return String.format("Brommer van klasse %c met nummerplaat %s",klasse,nummerplaat);
    }
	@Override
	public int hashCode() {
		return Objects.hash(klasse);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brommer other = (Brommer) obj;
		return klasse == other.klasse;
	}
    
    
    
    //TODO: vraag 20
}

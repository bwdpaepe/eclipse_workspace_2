package domein;

public class Mountainbike extends Fiets 
{
    private Soort soort;
    
   
    public Soort getSoort() 
    {
        return soort;
    }
    private void setSoort(Soort soort)
    {
        this.soort = soort;
    }

    //TODO: vraag 7
    public Mountainbike(int bandenmaat, boolean elektrisch, Soort soort) {
    	super(bandenmaat, elektrisch);
    	this.setSoort(soort);
    }
    
    public double berekenMilieubijdrageVoorTweewieler() {
    	double bijdrage = 0.0;
    	if(this.getSoort() == Soort.XC || this.getSoort() == Soort.FR) {
    		bijdrage = 20.0;
    	}
    	if(this.getSoort() == Soort.EN || this.getSoort() == Soort.DH) {
    		bijdrage = 30.0;
    	}
    	if(super.isElektrisch()) {
    		bijdrage = bijdrage + (bijdrage / 3.0);
    	}
    	return bijdrage;
    	
    }
    
    
    //TODO: vraag 8
    @Override
    public String toString() {
    	String output = "";
    	
    	output = String.format("%s en %s%n", super.toString(), this.getSoort().getOmschrijving());
    	
    	return output;
    }
    
}
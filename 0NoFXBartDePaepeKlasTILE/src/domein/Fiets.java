package domein;

import exceptions.BandException;

public abstract class Fiets implements Tweewieler
{
    private int bandenmaat;
    private boolean elektrisch;   
    
    public Fiets ()
    {
        this (28,false);
    } 
    public Fiets (int bandenmaat, boolean elektrisch)
    {
        setBandenmaat(bandenmaat);
        setElektrisch(elektrisch);
    } 
    public boolean isElektrisch()
    {
        return elektrisch;
    }
    private void setElektrisch (boolean elektrisch)
    {
        this.elektrisch = elektrisch;
    }
    public int getBandenmaat()
    {
        return bandenmaat;
    }
    
    //TODO: vraag 2
    private void setBandenmaat(int bandenmaat) throws BandException {
    	if(bandenmaat < 12 || bandenmaat >= 29) {
    		throw new BandException("De bandenmaat moet liggen tussen 12 en 29 (ondergrens inbegrepen en bovengrens niet inbegrepen)");
    	}
    	this.bandenmaat = bandenmaat;
    	
    }
    
    //TODO: vraag 3
    @Override
    public String toString() {
    	StringBuilder buffer1 = new StringBuilder(this.getClass().getSimpleName());
    	char first = buffer1.charAt(0);
    	buffer1.deleteCharAt(0);
    	//buffer1.insert(0, ((Character)first).toLowerCase());
    	
    	
    	String output = this.elektrisch ? String.format("Elektrisch, %s, %d%n", buffer1.toString(), this.getBandenmaat()) : String.format("Mechanisch, %s, %d%n", this.getClass().getSimpleName(), this.getBandenmaat());
    	
    	return output;
    	
    }
    
}

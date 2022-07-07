package domein;

public class Stadsfiets extends Fiets implements Comparable<Stadsfiets>
{
    private String bijzonderheden;
        
    public Stadsfiets() 
    {
        this(26,false,"Nihil");
    }

    //TODO: vraag 4
    public Stadsfiets(int bandenmaat, boolean elektrisch, String bijzonderheden) {
    	super(bandenmaat, elektrisch);
    	this.setBijzonderheden(bijzonderheden);
    }
    
    public String getBijzonderheden()
    {
        return bijzonderheden;
    }
    private void setBijzonderheden(String bijzonderheden) 
    {
        this.bijzonderheden = bijzonderheden.trim();
    }  

    //TODO: vraag 5
    @Override
    public String toString() {
    	String output = "";
    	if(this.getBijzonderheden() != "nihil") {
    		output = String.format("%s en %s%n", super.toString(), this.getBijzonderheden());
    	}
    	else {
    		output = String.format("%s en geen bijzonderheden%n", super.toString());
    	}
    	return output;
    }
    
    //TODO: vraag 6
    public double berekenMilieubijdrageVoorTweewieler() {
    	return 0.0;
    }

	@Override
	public int compareTo(Stadsfiets o) {
		// TODO Auto-generated method stub
		return this.getBandenmaat() - o.getBandenmaat();
	}
    
    //TODO: vraag 21
    
    
}

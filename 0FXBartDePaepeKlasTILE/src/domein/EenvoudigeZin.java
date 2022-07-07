package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EenvoudigeZin 
{
    private final String zin;

    public EenvoudigeZin(String zin) 
    {
        controleerZin(zin);
        this.zin = zin;
    }
    
    private void controleerZin(String zin) 
    {
    	// TO DO: vraag 1
               
        //zin moet bestaan uit een hoofdletter (enkel eerste letter),
        //kleine letters, spaties en leestekens (,.?!).
        //komma en spatie mag enkel voorkomen middenin de zin, andere 
    	//leestekens alleen helemaal op het einde.
    	
    	if(zin == "null" || zin.trim().isEmpty()) {
    		throw new IllegalArgumentException("zin mag niet leeg zijn");
    	}
    	
    	if(!zin.matches("[A-Z]{1}[a-z\\s,]+[\\.\\?!]{1}")) {
    		throw new IllegalArgumentException("de zin voldoet niet aan het verwachte patroon");
    	}
       
    }

    public List<String> geefWoordenMetAantalLetters(int aantalLetters)
    {
    	// TO DO: vraag 2
    	
    	List<String> outputList = new ArrayList<>();
    	
    	Pattern expression = Pattern.compile("[^A-Za-z]+");
		
		Matcher matcher = expression.matcher(this.getZin());
		
		while(matcher.find()) {
			outputList.add(matcher.group());
		}
		
		return outputList;
    }
    
	public String getZin()
	{
		return zin;
	}
     
    
}

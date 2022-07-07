package domein;

import java.util.List;

public class DomeinController {
	private final TweewielerRepository tweewielerRepository;

    public DomeinController() {
        
    	tweewielerRepository = new TweewielerRepository();
    }
    
    public String lijstOmzettenNaarTekst(List<Tweewieler> tweewielerLijst) {
    	String output = "";
    	for(Tweewieler tw: tweewielerLijst) {
    		output += String.format("%s%n", tw);
    	}
    	return output;
    }

    
}

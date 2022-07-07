package domein;

import java.util.List;

import persistentie.TweewielerMapper;

public class TweewielerRepository 
{
    private final List<Tweewieler> tweewielerLijst;
    private final TweewielerMapper tweewielerMapper;
        
    //TODO: vraag 11
    public TweewielerRepository()
    {
    	tweewielerMapper = new TweewielerMapper();
        tweewielerLijst = tweewielerMapper.leesTekstBestandTweewielers("\\bestanden\\tweewielers.txt");
    }
    
    //TODO: vraag 12
    public List<Tweewieler> geefElektrischeTweewielerLijst(){
    	List<Tweewieler> eltw = new ArrayList<>();
    	for(Tweewieler tw: this.tweewielerLijst) {
    		if(tw instanceof Stadsfiets || tw instanceof Mountainbike) {
    			if(((Fiets)tw).isElektrisch()) {
    				eltw.add(tw);
    			}
    		}
    	}
    	return eltw;
    }
    
      
    public void serialiseerElektrischeTweewieler()
    {
        List<Tweewieler> lijst = this.geefElektrischeTweewielerLijst();
        tweewielerMapper.serialiseerVolledigeLijst(lijst, "src\\bestanden\\elektrischeTweewieler.ser");
    }
    
    public List<Tweewieler> getTweewielers()
    {
        return tweewielerLijst;
    }
}

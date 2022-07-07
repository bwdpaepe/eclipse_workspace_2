package domein;

import java.util.List;

import persistentie.WinkelMapper;

public class WinkelRepository {
	
	private List<Winkel> winkels;
	private WinkelMapper winkelMapper;
	
	public WinkelRepository() {
		this.winkelMapper = new WinkelMapper();
		this.winkels = winkelMapper.geefStandaardWinkels();
		
	}
	
	public Winkel geefWinkel(String naamWinkel) {
		for(Winkel w: this.winkels) {
			if(w.getNaam() == naamWinkel) {
				return w;
			}
			
		}
		//throw new IllegalArgumentException(String.format("%s komt niet voor in de lijst%n", naamWinkel));
		return null;
	}
	
	
	
	public List<Winkel> getWinkels() {
		return winkels;
	}

	public void serialiseerWinkels(String naamBestand) {
		this.winkelMapper.serialiseerWinkels(naamBestand);
	}

}

package domein;

import java.util.List;

public class DomeinController {
	
	private WinkelRepository winkelRepository;
	
	public DomeinController() {
		this.winkelRepository = new WinkelRepository();
	}
	
	public String[] geefDoucheBakkenMetLengteEnBreedteEnMateriaal(int deLengte, int deBreedte, String hetMateriaal, String naamWinkel) {
		String[] output;
		if(naamWinkel == null || naamWinkel.trim().isEmpty()) {
			throw new IllegalArgumentException("naam winkel mag niet leeg zijn");
		}
		else {
			Winkel w = this.winkelRepository.geefWinkel(naamWinkel);
			if(!(w instanceof BadkamerWinkel)) {
				throw new IllegalArgumentException("winkel moet een badkamerwinkel zijn!");
				
			}
			else {
				List<DoucheBak> ldb = ((BadkamerWinkel)w).getVoorraad();
				output = new String[ldb.size()];
				int counter = 0;
				for(DoucheBak db: ldb) {
					output[counter] = db.toString();
					counter++;
				}
			}
		}
		return output;
	}
	
	public String[] geefNamenWinkels() {
		String output[];
		List<Winkel> lw = this.winkelRepository.getWinkels();
		output = new String[lw.size()];
		int counter = 0;
		for(Winkel w: lw) {
			output[counter] = w.getNaam();
			counter++;
		}
		return output;
	}
	
	public void serialiseerWinkels() {
		this.winkelRepository.serialiseerWinkels("winkels_uit.ser");
	}

}

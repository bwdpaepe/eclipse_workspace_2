package domein;

import java.util.List;

public class DomeinController {
	
	private KostenRepository deKostenRepos;
	
	public DomeinController() {
		deKostenRepos = new KostenRepository();
	}
	
	public String[] geefTitelsBeheersKosten() {
		List<BeheersKost> lijstBeheerskosten = deKostenRepos.getKostenLijst();

        String[] itemsTitel = new String[lijstBeheerskosten.size()];
        int index = 0;
        for (BeheersKost item : lijstBeheerskosten) {
            if (item instanceof Kluis) {
                itemsTitel[index++] = item.toString();
            } else {
                itemsTitel[index++] = String.format("%s, houder = %s", item.getClass().getSimpleName().toLowerCase(), ((Rekening) item).getHouder());
            }
        }
        return itemsTitel;
	}
	
	public String geefDetailBeheersKost(int index) {
		return deKostenRepos.geefBeheersKost(index).toString();
	}
	
	public double geefBeheersKostWaarde(int index) {
		return deKostenRepos.geefBeheersKost(index).geefJaarlijkseKost();
	}

}

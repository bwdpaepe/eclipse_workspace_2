package domein;

import java.util.List;

import persistentie.BeheersKostenMapper;

public class KostenRepository {
	
	private BeheersKostenMapper beheerskostenMapper;
	private List<BeheersKost> kostenLijst;
	
	public KostenRepository() {
		beheerskostenMapper = new BeheersKostenMapper();
        kostenLijst = beheerskostenMapper.geefBeheersKosten();
	}
	
	public BeheersKost geefBeheersKost(int index) {
		return this.kostenLijst.get(index);
	}

    public List<BeheersKost> getKostenLijst()
    {
        return this.kostenLijst;
    }
}

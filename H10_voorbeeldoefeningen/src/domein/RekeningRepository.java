package domein;

import java.util.List;

import persistentie.RekeningMapper;

public class RekeningRepository {
	
	private List<Rekening> rekeningen;
	private RekeningMapper rekeningMapper;
	
	public RekeningRepository() {
		this.rekeningMapper = new RekeningMapper();
		this.rekeningen = this.rekeningMapper.geefRekeningen();
	}

	public List<Rekening> getRekeningen() {
		return rekeningen;
	}
	
	

}

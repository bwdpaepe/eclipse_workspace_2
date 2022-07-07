package domein;

import java.util.List;

public class DomeinController {
	
	private RekeningRepository deRekeningRepository;
	
	public DomeinController() {
		this.deRekeningRepository = new RekeningRepository();
	}
	
	public List<Rekening> geefRekeningen(){
		return this.deRekeningRepository.getRekeningen();
	}

}

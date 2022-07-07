package domein;

import java.util.Comparator;

public class SorteerOpWoonplaats implements Comparator<Werknemer> {

	@Override
	public int compare(Werknemer o1, Werknemer o2) {
		// TODO Auto-generated method stub
		return o1.getWoonplaats().compareTo(o2.getWoonplaats());
	}

}

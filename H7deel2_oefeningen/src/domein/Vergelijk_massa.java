package domein;

import java.util.Comparator;

public class Vergelijk_massa implements Comparator<Container>{

	@Override
	public int compare(Container o1, Container o2) {
		// TODO Auto-generated method stub
		int res = Integer.compare(o1.getMassa(), o2.getMassa());
		return res;
	}

}

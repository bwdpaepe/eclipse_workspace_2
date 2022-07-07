package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kleur1 = {"rood", "groen", "blauw", "geel", "paars"};
		String[] kleur2 = {"paars","groen"};
		
		List<String> lijst1 = new ArrayList<String>(Arrays.asList(kleur1));
		List<String> lijst2 = new ArrayList<String>(Arrays.asList(kleur2));
		
		removeFromList(lijst1, lijst2);
		
		
	}
	
	private static void removeFromList(Collection<String> c1, Collection<String> c2) {
		
		Iterator<String> i = c1.iterator();
		
		while(i.hasNext()) {
			if(c2.contains(i.next())) {
				i.remove();
			}
		}
		
	}

}

package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
		List<String> lijstColors = new ArrayList<>(Arrays.asList(colors));
		
		String[] removeColors = { "RED", "WHITE", "BLUE" };
		List<String> lijstRemove = new ArrayList<>(Arrays.asList(removeColors));
		
		removeColors(lijstColors, lijstRemove);
		
		//addColors(lijstColors, lijstRemove;)

	}
	
	private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
		Iterator<String> iterator = collection1.iterator();
		
		while(iterator.hasNext()) {
			if(collection2.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}
	
	

}

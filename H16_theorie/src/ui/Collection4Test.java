package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collection4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
		List<String> lijstColors = new ArrayList<>(Arrays.asList(colors));
		
		String[] removeColors = { "RED", "WHITE", "BLUE" };
		List<String> lijstRemove = new ArrayList<>(Arrays.asList(removeColors));
		
		removeColors(lijstColors, lijstRemove);
		
		//addColors(lijstColors, lijstRemove;)

	}
	
	private static void removeColors(Collection<String> c1, Collection<String> c2) {
		Iterator<String> i = c1.iterator();
		while(i.hasNext()) {
			if(c2.contains(i.next())) {
				i.remove();
			}
		}
	}

}

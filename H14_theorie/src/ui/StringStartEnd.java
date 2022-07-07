package ui;

public class StringStartEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"started", "starting", "ended", "ending"};
		
		for(String s: strings) {
			if(s.startsWith("start")) {
				System.out.printf("\"%s\" starts with \"start\"%n", s);
			}
		}
		
		for(String s: strings) {
			if(s.startsWith("art",2)) {
				System.out.printf("\"%s\" starts with \"art\" at position 2%n", s);
			}
		}
		
		for(String s: strings) {
			if(s.endsWith("ing")) {
				System.out.printf("\"%s\" ends with \"ing\"%n", s);
			}
		}

	}

}

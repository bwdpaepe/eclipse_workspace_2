package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import domein.SorteerOpWoonplaats;
import domein.Werknemer;

public class WerknemerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Werknemer> werknemers = new ArrayList<>();
		werknemers.add(new Werknemer(123456, "Janssens", "Jan", "Oudenaarde"));
		werknemers.add(new Werknemer(23584, "Pieters", "Piet"));
		werknemers.add(new Werknemer(123457, "Boomans", "Luc"));
		werknemers.add(new Werknemer(123455, "Lauwers", "Frederik", "Antwerpen"));

		Werknemer w1 = new Werknemer(123457, "Boomans", "Luc");
		
		for(Werknemer wn: werknemers) {
			if(wn.equals(w1)) {
				System.out.printf("werknemer gevonden %s%n", wn);
				break;
			}
		}
		
		vervolg1();
		
		//vervolg2();

	}
	
	public static void vervolg1() {
		Werknemer[] werknemers = new Werknemer[4];
		werknemers[0] = new Werknemer(123456, "Janssens", "Jan","Oudenaarde");
		werknemers[1] = new Werknemer(23584, "Pieters", "Piet");
		werknemers[2] = new Werknemer(123457, "Pieters", "Luc");
		werknemers[3] = new Werknemer(123455, "Lauwers", "Frederik","Antwerpen");

		System.out.println("Na ingave: ");
		for(Werknemer s: werknemers)
			System.out.println(s);
		
		Arrays.sort(werknemers);
		System.out.println("Na sort: ");
		for(Werknemer s: werknemers)
			System.out.println(s);
		
		Arrays.sort(werknemers, new SorteerOpWoonplaats());
		System.out.println("Na sort op woonplaats: ");
		for(Werknemer s: werknemers)
			System.out.println(s);
		
		Arrays.sort(werknemers, new Comparator<Werknemer>() {

			@Override
			public int compare(Werknemer o1, Werknemer o2) {
				// TODO Auto-generated method stub
				int res = o1.getNaam().compareTo(o2.getNaam());
				if(res == 0) {
					return o1.getVoornaam().compareTo(o2.getVoornaam());
				}
				return res;
			}
			
		});
		System.out.println("Na sort op naam en voornaam: ");
		for(Werknemer s: werknemers)
			System.out.println(s);
		
		vervolg2();
		
	}
	
	public static void vervolg2() {
		Werknemer[] werknemers = new Werknemer[4];
		werknemers[0] = new Werknemer(123456, "Janssens", "Jan","Oudenaarde");
		werknemers[1] = new Werknemer(23584, "Pieters", "Piet");
		werknemers[2] = new Werknemer(123457, "Pieters", "Luc");
		werknemers[3] = new Werknemer(123455, "Lauwers", "Frederik","Antwerpen");
		
		List<Werknemer> werknemerLijst = new ArrayList<>(Arrays.asList(werknemers));
		werknemerLijst.add(new Werknemer(1234458,"Peters","Dana", "Stekene"));
		
		Werknemer[] werknemers2 = werknemerLijst.toArray(new Werknemer[werknemerLijst.size()]);
		for(Werknemer s: werknemers2)
			System.out.println(s);
		
		System.out.println();
		Werknemer[] werknemers3 = werknemerLijst.toArray(new Werknemer[0]);
		for(Werknemer s: werknemers3)
			System.out.println(s);
		
		
	}

}

package cui;

import domein.Driehoek;
import domein.Rechthoek;
import domein.Veelhoek;

public class VeelhoekApplicatie {
	public void start() {
		Veelhoek vh = new Veelhoek(5);
		Driehoek dh = new Driehoek(4,5,6);
		Rechthoek rh = new Rechthoek(8.0,5.0);
		System.out.println(vh);
		System.out.println(dh);
		System.out.println(rh);
		System.out.printf("Aantal veelhoeken: %d%n", Veelhoek.getAantal());
		
	}
}

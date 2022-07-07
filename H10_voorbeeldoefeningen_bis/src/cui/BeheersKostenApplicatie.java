package cui;

import domein.DomeinController;

public class BeheersKostenApplicatie {
	
	public BeheersKostenApplicatie(DomeinController dc) {
		String[] bankproductenTitels = dc.geefTitelsBeheersKosten();
		 //Dezelfde opmerking als het oorspronkelijk project       
		        /*int i = 0;
		            for(String titel : bankproductenTitels)
		            {
		                    System.out.println(titel);
		                    System.out.println("Detail: " + dc.geefDetailBeheersKost(i));
		                    System.out.println("Kost: " + dc.geefBeheersKostWaarde(i++));
		                    System.out.println();
		            }*/
		        for (int index = 0; index < bankproductenTitels.length; index++) {
		            System.out.println(bankproductenTitels[index]);
		            System.out.printf("Detail: %s", dc.geefDetailBeheersKost(index));
		            System.out.printf("Kost: %s%n%n", dc.geefBeheersKostWaarde(index));
		        }
	}

}

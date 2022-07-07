package cui;

import java.util.List;

import domein.DomeinController;
import domein.Rekening;
import domein.SpaarRekening;
import domein.ZichtRekening;

public class RekeningApplicatie
{
	private DomeinController dc;

    public RekeningApplicatie(DomeinController dc)
    {
    	
        this.dc = dc;
    	/*Rekening rekeningen[] = new Rekening[3];

        String namen[] = {"jan", "an", "piet"};
        long rekeningnrs[] = {123456789911L, 123123456784L, 123123456986L};

        for (int i = 0; i < rekeningen.length; i++)
        {
            rekeningen[i] = new Rekening(rekeningnrs[i], namen[i]);
        }

        rekeningen[0].stortOp(1000);
        rekeningen[1].stortOp(50);
        rekeningen[2].stortOp(500);

        if (rekeningen[0].stortOp(200))
        {
            System.out.println("Jan heeft 200 euro op zijn rekening gestort!");
        }

        if (rekeningen[1].haalAf(30))
        {
            System.out.println("An heeft 30 euro van haar rekening gehaald!");
        }

        if (rekeningen[2].schrijfBedragOverNaar(50, rekeningen[1]))
        {
            System.out.println("De overschrijving van 50 euro van Piet naar An is gelukt!");
        }

        System.out.printf("Piet heeft momenteel %.2f als saldo%n", rekeningen[2].getSaldo());
        System.out.printf("An heeft momenteel %.2f als saldo%n", rekeningen[1].getSaldo());
        System.out.printf("Jan heeft momenteel %.2f als saldo%n", rekeningen[0].getSaldo());

        for(Rekening r:rekeningen)
            System.out.printf("%s%n",r);
        System.out.println();
        */

    }
    
    public void werkMetRekeningen() {
    	List<Rekening> rekeningenList = dc.geefRekeningen();
    	for(Rekening eenRekening: rekeningenList) {
    		if(eenRekening instanceof SpaarRekening) {
    			eenRekening.stortOp(eenRekening.getSaldo() * SpaarRekening.getAangroeiIntrest());
    		}
    		if(eenRekening instanceof ZichtRekening) {
    			((ZichtRekening) eenRekening).setMaxKredietOnderNul(((ZichtRekening) eenRekening).getMaxKredietOnderNul() - 10);
    		}
    	}
    }
}

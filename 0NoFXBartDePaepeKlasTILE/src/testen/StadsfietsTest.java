package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.Stadsfiets;

public class StadsfietsTest 
{
    private Stadsfiets stfiets1, stfiets2;

    @Test
    public void maakStadsfiets_ToegelatenAttributen_objectWordtGemaakt()
    {
        stfiets1 = new Stadsfiets(22, true, "Inclusief fietsslot");
    }

    @Test
    public void maakStadsfiets_BijzonderhedenNietOK_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Stadsfiets(26, false,"D en nog andere ZAKEN");});
    }

    @Test
    public void toString_tekstWeergave_tekst() 
    {
        stfiets1 = new Stadsfiets(22, true, "Inclusief fietsslot");
        Assertions.assertEquals("Elektrische stadsfiets met bandenmaat 22 en bijzonderheden Inclusief fietsslot", stfiets1.toString());
    }
 
}

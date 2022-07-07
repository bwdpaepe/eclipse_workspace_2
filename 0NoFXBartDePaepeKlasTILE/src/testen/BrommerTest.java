package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.Brommer;

public class BrommerTest 
{
   private Brommer brom;

    @Test
    public void maakBrommer_ToegelatenAttributen_objectWordtGemaakt() 
    {
        brom = new Brommer('A', "S-AAA111");
    }

    @Test
    public void maakBrommer_NummerplaatNietOK_werptException() 
    {
    	Assertions.assertThrows(IllegalArgumentException.class , () -> {new Brommer('P', "S-BAA111");});
    }

    @Test
    public void toString_tekstWeergave_tekst()  {
        brom = new Brommer('A', "S-AAA111");
        Assertions.assertEquals("Brommer van klasse A met nummerplaat S-AAA111", brom.toString());
    }
 
}


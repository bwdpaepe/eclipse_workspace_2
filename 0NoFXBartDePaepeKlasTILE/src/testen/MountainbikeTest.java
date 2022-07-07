package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domein.Mountainbike;
import domein.Soort;
import exceptions.BandException;

public class MountainbikeTest 
{
   private Mountainbike mtbike1, mtbike2;

    @Test
    public void maakMountainbike_ToegelatenAttributen_objectWordtGemaakt() 
    {
        mtbike1 = new Mountainbike(28, false, Soort.XC);
    }

    @Test
    public void maakMountainbike_BandenmaatNietOK_werptException() 
    {
    	Assertions.assertThrows(BandException.class , () -> {new Mountainbike(30, true, Soort.EN);});
    }

    @Test
    public void toString_tekstWeergave_tekst()  
    {
        mtbike1 = new Mountainbike(28, false, Soort.XC);
        Assertions.assertEquals("Mechanische mountainbike met bandenmaat 28 en soort Cross country", mtbike1.toString());
    }
 
}

package domein;

import java.util.ArrayList;
import java.util.List;

public class VeelhoekRepository
{
    private final List<GriekseBenaming> veelhoeken;

    public VeelhoekRepository()
    {
        veelhoeken = new ArrayList<>();
    }

    public void voegVeelhoekToe(String gegevens[])
    {
        if (gegevens.length == 2)
        {
            voegRechthoekToe(gegevens);
        } 
        else
        {
            voegDriehoekToe(gegevens);
        }
    }

    private void voegRechthoekToe(String[] gegevens)
    {
        veelhoeken.add(new Rechthoek(Double.parseDouble(gegevens[0]),
                Double.parseDouble(gegevens[1])));
    }

    private void voegDriehoekToe(String[] gegevens)
    {
        veelhoeken.add(new Driehoek(Integer.parseInt(gegevens[0]),
                Integer.parseInt(gegevens[1]),
                Integer.parseInt(gegevens[2])));
    }

    public List<GriekseBenaming> getVeelhoeken()
    {
        return veelhoeken;
    }

}

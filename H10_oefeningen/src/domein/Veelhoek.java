package domein;

public abstract class Veelhoek implements GriekseBenaming
{
    private final int aantalHoeken;
    private static int aantal;
    
    public Veelhoek (int aantalHoeken)
    {
        controleerAantalHoeken(aantalHoeken);
        this.aantalHoeken = aantalHoeken;
        aantal++;
    }

    private void controleerAantalHoeken(int aantalHoeken) 
    {
       if (aantalHoeken <= 2)
          throw new IllegalArgumentException("Aantal hoeken moet groter dan 2 zijn!");
    }
    
    public static int getAantal()
    {
        return aantal;
    }
    
    public int getAantalHoeken()
    {
        return aantalHoeken;
    }
        
    @Override
    public String toString()
    {
        return String.format("%s%nAantal hoeken = %d%n%s",
                this.getClass().getSimpleName(),aantalHoeken, this.geefGriekseBenaming());
    }
    @Override
    protected void finalize()
    {
        aantal--;
    }
}

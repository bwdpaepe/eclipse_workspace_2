package domein;

public class Driehoek extends Veelhoek
{
    private int a, b, c;

    public Driehoek(int a, int b, int c)
    {
        super(3);
        setA(a);
        setB(b);
        setC(c);
    }

    private void setA(int a)
    {
        controleerZijde(a);
        this.a = a;
    }

    private void setB(int b)
    {
        controleerZijde(b);
        this.b = b;
    }

    private void setC(int c)
    {
        controleerZijde(c);
        this.c = c;
    }

    private void controleerZijde(int z)
    {
        if (z <= 0)
        {
            throw new IllegalArgumentException("De zijde is foutief");
        }
    }

    public int getA()
    {
        return a;
    }

    public int getB()
    {
        return b;
    }

    public int getC()
    {
        return c;
    }

    public boolean isRechthoekigeDriehoek()
    {
        return a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b;
    }

    @Override
    public String toString()
    {
        return String.format("%s%nZijde 1 = %d%nZijde 2 = %d%nZijde 3 = %d%n"
                + "Rechthoekig: %s%n",
                super.toString(),a,b,c,
                isRechthoekigeDriehoek() ? "ja" : "nee" 
                );
    }
    @Override
    public String geefGriekseBenaming()
    {
        return "trigoon";
    }
}

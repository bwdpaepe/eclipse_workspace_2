package domein;

public class Rechthoek extends Veelhoek
{
    private double breedte;
    private double lengte;

    public Rechthoek(double breedte, double lengte) 
    {
        super(4);
        setBreedte(breedte);
        setLengte(lengte);
    }

    public double getBreedte() 
    {
        return breedte;
    }

    public double getLengte() 
    {
        return lengte;
    }

 

    private void setBreedte(double breedte) 
    {
        if (breedte <= 0 || breedte >= 20)
            throw new IllegalArgumentException("De breedte moet tussen 0 en 20 liggen");
        this.breedte = breedte;
    }

    private void setLengte(double lengte) {
        if (lengte <= 0 || lengte >= 20)
           throw new IllegalArgumentException("De lengte moet tussen 0 en 20 liggen");
        this.lengte = lengte;    
    }

    public double berekenOppervlakte(){
        return lengte * breedte;
    }

    public double berekenOmtrek(){
        return 2*(lengte + breedte);
    }
    
    @Override
    public String toString()
    {
        return String.format("%s%nLengte = %.1f%nBreedte = %.1f%n"
                + "Omtrek = %.1f%nOppervlakte = %.1f%n",
                super.toString(),lengte,breedte,
                berekenOmtrek(),berekenOppervlakte()
                );
    }

    @Override
    public String geefGriekseBenaming()
    {
        return "tetragoon";
    }
    
}
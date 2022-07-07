package domein;

public enum DierSoort
{
    KAT(new String[]{ "geboortejaar"}),
    HOND(new String[] {"naam", "geboortejaar"});

    private final String[] attribuutNamen;

    DierSoort(String[] attribuutNamen)
    {
        this.attribuutNamen = attribuutNamen;
    }

    public String[] getAttribuutNamen()
    {
        return attribuutNamen;
    }
}

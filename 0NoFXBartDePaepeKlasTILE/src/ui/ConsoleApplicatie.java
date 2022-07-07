package ui;

import domein.DomeinController;

public class ConsoleApplicatie 
{
    private final DomeinController dc;
    
    public ConsoleApplicatie(DomeinController dc)
    {
        this.dc = dc;
        dc.serialiseerElektrischeTweewieler();
    }
    public void drukOverzichtenAf()
    {
        System.out.println( dc.geefOverzichtTweewielers() ); 
        System.out.println( dc.geefOverzichtElektrischeTweewielers() );
    }  
}


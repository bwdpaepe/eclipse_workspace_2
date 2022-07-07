package cui;

import domein.DierSoort;
import domein.DomeinController;
import java.util.Scanner;

public class ConsoleApplicatie
{

    private final DomeinController domeinController;
    
    public ConsoleApplicatie(DomeinController domeinController)
    {
        this.domeinController = domeinController;
    }

    public void startApplicatie()
    {
        System.out.println(domeinController.maakOverzicht());

        int keuze = 0;
        String jaar;
        String[] gegHond;
        do
        {
            keuze = maakKeuze();
            if (keuze != 3)
            {
                switch (DierSoort.values()[keuze - 1])
                {
                    case KAT:
                        jaar = voerGegevensKatIn();
                        domeinController.voegKatToe(Integer.parseInt(jaar));
                        break;
                    case HOND:
                        gegHond = voerGegegevensHondIn();
                        domeinController.voegHondToe(gegHond[0], Integer.parseInt(gegHond[1]));
                        break;
                }
            }
                System.out.println(domeinController.maakOverzicht()); 
        } while (keuze != 3);
    }
    private int maakKeuze()
    {
        int keuze;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("\nMaak je keuze: \n 1: toevoegen kat\n 2: toevoegen hond\n 3: stoppen");
            keuze = input.nextInt();
        } while (keuze < 1 || keuze > 3);

        return keuze;
    }

    private String voerGegevensKatIn()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef jaar: ");
        return input.next();
    }

    private String[] voerGegegevensHondIn()
    {
        String[] gegHond = new String[2];
        Scanner input = new Scanner(System.in);
        System.out.printf("%nGeef geboortejaar van de hond: ");
        gegHond[1] = input.next();
        input.nextLine();
        System.out.printf("%nGeef naam van de hond: ");
        gegHond[0] = input.nextLine();
        return gegHond;
    }
}

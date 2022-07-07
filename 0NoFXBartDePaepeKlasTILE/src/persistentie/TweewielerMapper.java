package persistentie;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import domein.Brommer;
import domein.Mountainbike;
import domein.Soort;
import domein.Stadsfiets;
import domein.Tweewieler;

public class TweewielerMapper 
{
    //TODO: vraag 17
	public List<Tweewieler> leesTekstBestandTweewielers(String naambestand){
		List<Tweewieler> tw = new ArrayList<>();
		
		Scanner input;

		//open read file
		try {	
			input = new Scanner(Files.newInputStream(Paths.get(naambestand)));
		}
		catch(InvalidPathException e) {
			System.err.println("could not find file");
		}
		catch(IOException ex) {
			System.err.println("Error opening file.");
            
		}
		
		//read file
		try {
			while(input.hasNext()) {
				String type = input.next();
				if(type == "S") {
					this.leesStadsfietsUitBestand(input, tw);
				
				}
				else if(type == "M") {
					this.leesMountainbikeUitBestand(input, tw);
				}
				else if (type == "B") {
					this.leesBrommerUitBestand(input, tw);
				}
			}
		}
		catch (InputMismatchException elementException) // <2>
        {
            System.err.println("File improperly formed.");
            
        } catch (NoSuchElementException elementException) // <3>
        {
            System.err.println("Element missing");
            
        } catch (IllegalStateException stateException) // <4>
        {
            System.err.println("Error reading from file.");
            
        }
		
		
	}
    
    private void leesStadsfietsUitBestand(Scanner scanner, List<Tweewieler> tweewielersLijst)
    {
        int bandenmaat;
        boolean elektrisch;
        String bijzonderheden;
        
        try
        {
            bandenmaat = scanner.nextInt();
            elektrisch = scanner.nextBoolean();
            bijzonderheden = scanner.nextLine();
            Tweewieler stadsfiets = new Stadsfiets(bandenmaat, elektrisch, bijzonderheden);
            tweewielersLijst.add(stadsfiets);    
        } 
        catch (InputMismatchException e)
        {
            System.err.println("Type gegevens klopt niet!");
        } 
        catch (NoSuchElementException e)
        {
            System.err.println("Er ontbreken gegevens!");
        } 
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }  
    }     
    private void leesMountainbikeUitBestand(Scanner scanner, List<Tweewieler> tweewielersLijst) 
    {
        int bandenmaat;
        boolean elektrisch;
        Soort soort;
        String soortString;
        try
        {
            bandenmaat = scanner.nextInt();
            elektrisch = scanner.nextBoolean();
            soortString = scanner.next();                
            soort = Soort.valueOf(soortString);           
            Tweewieler mountainbike = new Mountainbike(bandenmaat, elektrisch, soort);
            tweewielersLijst.add(mountainbike);    
        } 
        catch (InputMismatchException e)
        {
            System.err.println("Type gegevens klopt niet!");
        } 
        catch (NoSuchElementException e)
        {
            System.err.println("Er ontbreken gegevens!");
        } 
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }    
    }
    private void leesBrommerUitBestand(Scanner scanner, List<Tweewieler> tweewielersLijst) 
    {
        char klasse;
        String nummerplaat;
        try
        {
            klasse = scanner.next().charAt(0); 
            nummerplaat = scanner.next();    
            Brommer brommer = new Brommer(klasse, nummerplaat);
            tweewielersLijst.add(brommer);    
        } 
        catch (InputMismatchException e)
        {
            System.err.println("Type gegevens klopt niet!");
        } 
        catch (NoSuchElementException e)
        {
            System.err.println("Er ontbreken gegevens!");
        } 
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }
    }    
    
    //TODO: vraag 18
    public void serialiseerVolledigeLijst(List<Tweewieler> twlijst, String outputBestand) {
    	//write
    	private ObjectOutputStream output;
    	try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get(outputBestand),StandardOpenOption.APPEND));
		}
		catch(InvalidPathException ie) {
			System.err.println("error finding file");
		}
		catch(IOException ex) {
			System.err.println("Error opening file.");
		}
    	
    	for(Tweewieler tw: twlijst) {
    		try {
    			output.writeObject(tw);
    		}
    		catch (IOException ex)
    		{
    			System.err.println("Error writing to file.");
    		}
    	}
    }
    
}

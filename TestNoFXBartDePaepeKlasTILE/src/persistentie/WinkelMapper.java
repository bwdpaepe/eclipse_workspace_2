package persistentie;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import domein.BadkamerWinkel;
import domein.Classificatie;
import domein.KeukenWinkel;
import domein.Winkel;

public class WinkelMapper {
	
	public List<Winkel> geefStandaardWinkels(){
		
	}
	
	public List<Winkel> leesTekstBestandWinkels(String naamBestand){
		//lezen
		Scanner input;
		List<Winkel> lw = new ArrayList<>();
		
		//lezen
		try {
			input = new Scanner(Files.newInputStream(Paths.get(naamBestand)));
		}
		catch(InvalidPathException e) {
			System.err.println("file not found");
			System.exit(1);
		}
		catch(IOException e) {
			System.err.println("file not open");
			System.exit(1);
		}
		
		//lezen
		try {
			while(input.hasNext()) {
				String winkelRecord = input.nextLine();
				String[] winkelArray = winkelRecord.split("-");
				Classificatie classificatie;
				if(winkelArray[5].toLowerCase() == "klein") {
					classificatie = Classificatie.KLEIN;
				}
				if(winkelArray[0] == "b") {
					lw.add(new BadkamerWinkel(winkelArray[1], winkelArray[2], winkelArray[3], Integer.parseInt(winkelArray[4]), classificatie));
				}
				else {
					lw.add(new KeukenWinkel(winkelArray[1], winkelArray[2], winkelArray[3], Integer.parseInt(winkelArray[4]), classificatie));
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
	
	public void serialiseerWinkels(List<Winkel> winkels, String naamBestand) {
		// schrijven
		ObjectOutputStream output;
		
		try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get(naamBestand)));
		}
		catch(InvalidPathException ie) {
			System.err.println("error finding file");
			System.exit(1);
		}
		catch(IOException ex) {
			System.err.println("Error opening file.");
            System.exit(1);
		}
		
		try {
			for(Winkel w: winkels) {
				output.writeObject(w);
			}
		}
		catch (IOException ex) // <2>
        {
            System.err.println("Error writing to file.");
        }
	}

}

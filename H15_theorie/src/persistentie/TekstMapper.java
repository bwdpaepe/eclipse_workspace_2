package persistentie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TekstMapper {
	
	//lezen
	private Scanner input;
	//schrijven
	private Formatter output;
	
	//lezen
	private void openFileRead() {
		try {
			input = new Scanner(Files.newInputStream(Paths.get("src\\tekstbestand\\clients.txt")));
		}
		catch(InvalidPathException ie) {
			System.err.println("error finding file");
			System.exit(1);
		}
		catch(IOException ex) {
			System.err.println("Error opening file.");
            System.exit(1);
		}
		
	}
	
	//schrijven
	private void openFileWrite() {
		try {
			output = new Formatter(Files.newOutputStream(Paths.get("src\\tekstbestand\\clients.txt"),StandardOpenOption.APPEND));
		}
		catch (InvalidPathException ie) // <2>
        {
            System.err.println("Error finding file.");
            System.exit(1);
        } 
        catch (IOException ex) // <3>
        {
            System.err.println("Error creating file.");
            System.exit(1);
        }
	}
	
	//lezen
	public List<String> readRecords(){
		if(input == null) {
			this.openFileRead();
		}
		List<String> inputList = new ArrayList<>();
		
		try {
		
			while(input.hasNext()) {
				inputList.add(input.nextLine());
			}
		}
		catch (InputMismatchException elementException) // <2>
        {
            System.err.println("File improperly formed.");
            input.close();
            System.exit(1);
        } catch (NoSuchElementException elementException) // <3>
        {
            System.err.println("Element missing");
            input.close();
            System.exit(1);
        } catch (IllegalStateException stateException) // <4>
        {
            System.err.println("Error reading from file.");
            System.exit(1);
        }
		
		return inputList;
		
	}
	
	//schrijven
	public void writeRecords(List<String> outputList) {
		if(output == null) {
			this.openFileWrite();
		}
		try {
			for(String record: outputList) {
				output.format("%s%n", record);	
			}
		}
		catch (FormatterClosedException formatterClosedException) // <2>
        {
            System.err.println("Error writing to file.");
        }
		
	}
	
	public void closeFiles()
    {
        if (output != null)
        {
            output.close();
        }

        if (input != null)
        {
            input.close();
        }
    }
	
	
	
	
	
	

}

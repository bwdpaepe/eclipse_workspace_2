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

public class TekstMapper2 {
	
	//lezen
	private Scanner input;
	//schrijven
	private Formatter output;
	
	//lezen
	private void openFileRead() {
		try {
			input = new Scanner(Files.newInputStream(Paths.get("src\\files\\clients.txt")));
		}
		catch(InvalidPathException e) {
			System.err.print("Cannot find file");
			System.exit(1);
		}
		catch(IOException e) {
			System.err.print("Cannot read file");
			System.exit(1);
		}
	}
	//schrijven
	private void openFileWrite() {
		try {
			output = new Formatter(Files.newOutputStream(Paths.get("src\\files\\clients.txt"),StandardOpenOption.APPEND));
		}
		catch(InvalidPathException e) {
			System.err.print("Cannot find file");
			System.exit(1);
		}
		catch(IOException e) {
			System.err.print("Cannot write file");
			System.exit(1);
		}
	}
	
	//lezen
	public List<String> readFile(){
		if(input == null) {
			this.openFileRead();
		}
		List<String> lijst = new ArrayList<>();
		try {
			while(input.hasNext()) {
				lijst.add(input.nextLine());
			}
		}
		catch (InputMismatchException elementException) // <2>
        {
            System.err.println("File improperly formed.");
            input.close();
            System.exit(1);
        } 
		catch (NoSuchElementException elementException) // <3>
        {
            System.err.println("Element missing");
            input.close();
            System.exit(1);
        } 
		catch (IllegalStateException stateException) // <4>
        {
            System.err.println("Error reading from file.");
            System.exit(1);
        }
		return lijst;
	}
	//schrijven
	public void writeFile(List<String> lijst) {
		if(output==null) {
			this.openFileWrite();
		}
		try {
			for(String record: lijst) {
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

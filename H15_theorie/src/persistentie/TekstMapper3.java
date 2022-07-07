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

public class TekstMapper3 {
	
	//read
	Scanner input;
	
	//write
	Formatter output;
	
	//read
	public void openFileRead() {
		try {
			input = new Scanner(Files.newInputStream(Paths.get("clients.txt")));
		}
		catch(InvalidPathException e) {
			System.err.println("file not found");
		}
		catch(IOException e) {
			System.err.println("file not open");
		}
	}
	
    //write
	public void openFileWrite() {
		try {
			output = new Formatter(Files.newOutputStream(Paths.get("clients.txt"), StandardOpenOption.APPEND));
		}
		catch(InvalidPathException e) {
			System.err.println("file not found");
		}
		catch(IOException e) {
			System.err.println("file not open");
		}
	}
		
	//read
	private List<String> readFile(){
		if(input == null) {
			this.openFileRead();
		}
		List<String> toto = new ArrayList<>();
		try {
			while(input.hasNext()) {
				toto.add(input.next());
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
		return toto;
	}
	
	
	//write
	private void writeFile(List<String> toto) {
		if(output == null) {
			this.openFileWrite();
		}
		try {
			for(String record: toto) {
				output.format("%s%n", record);
			}
		}
		catch(FormatterClosedException e) {
			System.err.println("error writing");
		}
	}
	

}

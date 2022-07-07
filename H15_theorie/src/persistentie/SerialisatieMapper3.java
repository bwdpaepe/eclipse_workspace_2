package persistentie;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SerialisatieMapper3 {
	
	//read
	ObjectInputStream input;
	//write
	ObjectOutputStream output;
	
	//read
	public void openFileRead() {
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("clients.ser")));
		}
		catch(InvalidPathException e){
			System.err.println("file not found");
		}
		catch(IOException e) {
			System.err.println("file not open");
		}
	}
	
	//write
	public void openFileWrite() {
		try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get("clients.ser")));
		}
		catch(InvalidPathException e){
			System.err.println("file not found");
		}
		catch(IOException e) {
			System.err.println("file not open");
		}
	}
		
	//read
	private List<Student> readFile(){
		if(input == null) {
			this.openFileRead();
		}
		List<Student> toto = new ArrayList<>();
		try {
			while(true) {
				toto.add(input.readObject());
			}
		}
		catch(EOFException e) {
			System.err.println("EOF");
		}
		catch (ClassNotFoundException ex) // <3>
        {
            System.err.print("ongeldige objectstream");
            System.exit(1);
        } catch (IOException e) // <4>
        {
            System.err.println("Error reading file.");
            System.exit(1);
        } 
	}
	
    //write
	private void writeFile(List<Student> toto) {
		if(output == null) {
			this.openFileWrite();
		}
		try {
			for(Student gringo: toto) {
				ouput.writeObject(gringo);
			}
		}
		catch (IOException ex) // <2>
        {
            System.err.println("Error writing to file.");
        }
	}
		
	

}

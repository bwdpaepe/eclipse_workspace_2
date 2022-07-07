package persistentie;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class SerialisatieMapper2 {
	
	//lezen
	ObjectInputStream input;
	//schrijven
	ObjectOutputStream output;
	
	//lezen
	private void openReadFile() {
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("src\\files\\clients.ser")));
		}
		catch(InvalidPathException e) {
			System.out.println("cannot find file");
			System.exit(1);
		}
		catch(IOException e) {
			System.out.println("cannot open file");
			System.exit(1);
		}
	}
	//schrijven
	private void openWriteFile() {
		try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get("src\\files\\clients.ser")));
		}
		catch(InvalidPathException e) {
			System.out.println("cannot find file");
			System.exit(1);
		}
		catch(IOException e) {
			System.out.println("cannot open file");
			System.exit(1);
		}
	}
	
	
	//lezen
	public List<AccountRecord> readFile() {
		if(input == null) {
			this.openReadFile();
		}
		List<AccountRecord> lijst = new ArrayList<>();
		try {
			while(true) {
				lijst.add((AccountRecord)input.readObject());
			}
		}
		catch(EOFException e) {
			System.out.println("end of file");
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
		return lijst;
	}
	//schrijven
	public void writeFile(List<AccountRecord> lijst) {
		if(output == null) {
			this.openWriteFile();
		}
		try {
			for(AccountRecord record: lijst) {
				output.writeObject(record);
			}
		}
		catch (IOException ex) // <2>
        {
            System.err.println("Error writing to file.");
        }
	}
	
	private void closeFiles() {
		if(input != null) {
			try
            {
                input.close();
            } catch (IOException ex)
            {
                System.exit(1);
            }
		}
		if(output != null) {
			try
            {
                output.close();
            } catch (IOException ex)
            {
                System.exit(1);
            }
		}

	}
	
	

}

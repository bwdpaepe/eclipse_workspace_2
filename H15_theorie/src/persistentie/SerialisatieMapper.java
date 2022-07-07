package persistentie;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SerialisatieMapper {

	
		
	//lezen
	private ObjectInputStream input;		
	//schrijven
	private ObjectOutputStream output;
		
		
	//lezen
	private void openFileRead() {
		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("src\\tekstbestand\\clients.ser")));
		}
		catch(InvalidPathException ie) {
			System.err.println("error finding file");
			System.exit(1);
		}
		catch(IOException ex) {
			System.err.println("Error creating file.");
            System.exit(1);
		}
	}
	//schrijven
	private void openFileWrite() {
		try {
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get("src\\tekstbestand\\clients.ser"),StandardOpenOption.APPEND));
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
		
	//lezen
	public List<AccountRecord> readRecords(){
		if(input == null) {
			openFileRead();
		}
		List<AccountRecord> lijst = new ArrayList<>();
		try {
			while(true) {
				AccountRecord record = (AccountRecord) input.readObject();
				lijst.add(record);
			}
		}
		catch(EOFException e) {}
		catch(ClassNotFoundException e) {
			System.err.print("ongeldige objectstream");
            System.exit(1);
		}
		catch (IOException e) // <4>
        {
            System.err.println("Error reading file.");
            System.exit(1);
        } 
		return list;
	}
	//schrijven
	public void writeRecords(AccountRecord record) {
		if(output == null) {
			openFileWrite();
		}
		try {
			output.writeObject(record);
		}
		catch (IOException ex) // <2>
        {
            System.err.println("Error writing to file.");
        }
	}
		
	public void closeFile()
    {
        if (output != null)
        {
            try
            {
                output.close();
            } catch (IOException ex)
            {
                System.exit(1);
            }
        }

        if (input != null)
        {
            try
            {
                input.close();
            } catch (IOException ex)
            {
                System.exit(1);
            }
        }
    }
	

}

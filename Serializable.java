package tema4bb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable  {
	private static final long serialVersionUID=1L;
	
	public void serializare(Bank bank) throws IOException  {
	
            FileOutputStream fileOut = new FileOutputStream("bank.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(bank);
            out.close();
            fileOut.close();
    
	}

	public static Bank deserializare() {

		Bank  bank = null;

		 try
	        {
	            FileInputStream fileIn = new FileInputStream("bank.ser");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            bank = (Bank) in.readObject();
	            in.close();
	            fileIn.close();
	        }catch(IOException i)
	        {
	            i.printStackTrace();
	        }catch(ClassNotFoundException c)
	        {
	            c.printStackTrace();
	        }
	        return bank;
	}

}

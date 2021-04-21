 

import app.Command;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//change arraylist to list
public class Application {
	

	public static void main(String[] args) {
		
		ArrayList listOfCommands = null;
		
                
                // We call readCommandsFromFile() to read the text file line by line and return back the ArrayList
		try {
			listOfCommands = readCommandsFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Printing all commands to verify the input commands again
		for(int i = 0; i < listOfCommands.size(); i++) {   
		    System.out.println(listOfCommands.get(i));
		}
		
                // Total commands print
		System.out.println("Total commands in file are  "+(listOfCommands.size()));
                
		// Create object for BoardMovements to call roboAction()
		BoardMovements boardMovement = new BoardMovements();
                //Sending listofCommands to roboAction
		boardMovement.roboAction(listOfCommands);
                
                
                
                
		
		
	}

        
        
	public static ArrayList<String> readCommandsFromFile() throws IOException
	{
		ArrayList<String> commands = new ArrayList<String>();
		BufferedReader buffReader = new BufferedReader(new FileReader("D:\\commands.txt"));

	    String line = buffReader.readLine();
	    while (line != null) {
	    	commands.add(line);
	      line = buffReader.readLine();
	    }

	    buffReader.close();
	    
	    return commands;
		
	}
	
	
	
	


}

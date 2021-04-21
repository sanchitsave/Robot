 

import app.BoardSize;
import app.Command;
import java.util.ArrayList;

public class BoardMovements 
{
	String testString = null;
	public void roboAction(ArrayList<String> listOfCommands)
	{
                //We find first occurence of PLACE and proceed from there
		int indexOfPlace = 0;
		String firstCmd = null,direction = null,xString = null,yString = null;
		int startX,startY;
                
                
               // This loop is just to find the first PLACE command
		for(int commandIndex=0;commandIndex<listOfCommands.size();commandIndex++)
		{
			if(listOfCommands.get(commandIndex).contains("PLACE"))
			{
				indexOfPlace = commandIndex;
				System.out.println("Proceed from line number "+(++commandIndex));	
				firstCmd = listOfCommands.get(indexOfPlace).substring(0,5);
				xString = listOfCommands.get(indexOfPlace).substring(6,7);
				yString = listOfCommands.get(indexOfPlace).substring(8,9);
				direction =(listOfCommands.get(indexOfPlace).substring(10,listOfCommands.get(indexOfPlace).length()));
				break;
                                // Once we find first PLACE command we get out of the loop
			}
			
			
		}
		
		System.out.println("First Command  "+firstCmd+"  X is  "+xString+"  Y is   "+yString+"  Direction is  "+direction);
                //Converting x and y co-ordinates to Int
		startX = Integer.parseInt(xString);
		startY= Integer.parseInt(yString);
		
		RobotToy robot = new RobotToy(direction, startX, startY);
                
		     
		if(robot.getxLoc()<BoardSize.xMax && robot.getyLoc()<BoardSize.yMax)
		{
	            
                    //use switch case and enums for MOVE LEFT
                    
			for(int currentCommand = indexOfPlace+1; currentCommand<listOfCommands.size();currentCommand++)
			{
				if(listOfCommands.get(currentCommand).equals(Command.MOVE.toString()))
				{
					robot.moveRobotAhead();
				}
				
				if(listOfCommands.get(currentCommand).equals(Command.LEFT.toString()))
				{
					robot.rotateLeft();
				}
				if(listOfCommands.get(currentCommand).equals(Command.RIGHT.toString()))
				{
					robot.rotateRight();
				}
				
				if(listOfCommands.get(currentCommand).contains("PLACE"))
				{
					robot.placeRobot(listOfCommands.get(currentCommand));
				}
				if(listOfCommands.get(currentCommand).equals(Command.REPORT.toString()))
				{
					testString = robot.printReport();
                                        
				}
			}
		}
		else
		{
			System.out.println("Cannot place the robot where X and Y are greater than 4. Try again");
		}
	}

	
	


	
	

}
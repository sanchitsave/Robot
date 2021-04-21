
import app.BoardSize;
import app.Command;
import java.util.ArrayList;

 

public class RobotToy
{
	
	private String direction;
	private int xLoc;
	private int yLoc;
	
	public RobotToy(String direction,int xLoc,int yLoc)
	{
		this.direction = direction;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	
	public void moveRobotAhead()
	{
		int currentXLocation = getxLoc();
		int currentYLocation = getyLoc();
		
		if(getCurrentDirection().equals(Command.NORTH.toString()))
        {
            if((currentYLocation+1)<BoardSize.yMax)
            {
            	setyLoc(++currentYLocation);
            	System.out.println("Y changed to "+getyLoc());
            }
            else
            {
            	System.out.println("Value of Y is going beyond limit. So MOVE command not executed");    
            }   
        }
        
        if(getCurrentDirection().equals(Command.SOUTH.toString()))
        {
            if((currentYLocation-1)>=BoardSize.yMin)
            {
            	setyLoc(--currentYLocation);
            	System.out.println("Y changed to "+getyLoc());
            }
           else
           {
        	   System.out.println("Value of Y is going beyond limit. So MOVE command not executed"); 
           }
        }
        
        if(getCurrentDirection().equals(Command.WEST.toString()))
        {
        	if((currentXLocation-1)>=BoardSize.xMin)
            {
        		setxLoc(--currentXLocation);
        		System.out.println("X changed to "+getxLoc());
            }
        	else
        	{
        		System.out.println("Value of X is going beyond limit. So MOVE command not executed"); 
            }
        }
       
        if(getCurrentDirection().equals(Command.EAST.toString()))
        {
            if((currentXLocation+1)<BoardSize.xMax)
            {
            	setxLoc(++currentXLocation);
            	System.out.println("X changed to "+getxLoc());
            }
            else
            {
            	System.out.println("Value of X is going beyond limit. So MOVE command not executed"); 
            }
        }
	}

	
	public void rotateRight()
	{
		 if(getCurrentDirection().equals(Command.NORTH.toString()))
         {	
			 setDirection("EAST");
             System.out.println("dir changed to "+getCurrentDirection());
         }
         
		 else if(getCurrentDirection().equals(Command.EAST.toString()))
         {	
			 setDirection("SOUTH");
             System.out.println("dir changed to "+getCurrentDirection());
         }
         
		 else if(getCurrentDirection().equals(Command.SOUTH.toString()))
         {	
			 setDirection("WEST");
             System.out.println("dir changed to "+getCurrentDirection());
         }
         
		 else if(getCurrentDirection().equals(Command.WEST.toString()))
         {	
			 setDirection("NORTH");
             System.out.println("dir changed to "+getCurrentDirection());
         }
	}
	
	public void rotateLeft()
	{
		 if(getCurrentDirection().equals(Command.NORTH.toString()))
         {	
			 setDirection("WEST");
             System.out.println("dir changed to "+getCurrentDirection());
         }
         
		 else if(getCurrentDirection().equals(Command.EAST.toString()))
         {	
			 setDirection("NORTH");
             System.out.println("dir changed to "+getCurrentDirection());
         }
         
		 else if(getCurrentDirection().equals(Command.SOUTH.toString()))
         {	
			 setDirection("EAST");
             System.out.println("dir changed to "+getCurrentDirection());
         }
         
		 else if(getCurrentDirection().equals(Command.WEST.toString()))
         {	
			 setDirection("SOUTH");
             System.out.println("dir changed to "+getCurrentDirection());
         }
	}
	
	public String printReport()
	{       
                
		 System.out.println("X is  "+getxLoc()+"  Y is  "+getyLoc()+"  Direction is   "+getCurrentDirection());

                 String tempx = new String();
                 tempx = String.valueOf((xLoc));
                 String tempy = new String();
                 tempy = String.valueOf((yLoc));
                 
                 String testFinal = new String();
                 testFinal = tempx+tempy+direction;
                 
                 return testFinal;
                 
	}
	
	public void placeRobot(String inputline)
	{
		int xLoc = Integer.parseInt(inputline.substring(6,7));
		int yLoc = Integer.parseInt(inputline.substring(8,9));
		
		if(xLoc < BoardSize.xMax && yLoc < BoardSize.yMax)
		{
		setxLoc(xLoc);
		setyLoc(yLoc);
		setDirection(inputline.substring(10,inputline.length()));
		printReport();
		}
		else
		{
			System.out.println("Cannot place the robot where X and Y are greater than 4.");
		}
	}
	
	
	public String getCurrentDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}
	
	

}

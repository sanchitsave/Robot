/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Pepega
 */
public class IntegrationTest {

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * JUnit test corresponds to the first test case in Test Plan table
     */
    @Test
    public void IntTest01() {
        String fileAddress = "D:\\commands1.txt";
        ArrayList listOfCommands = null;

        try {
            listOfCommands = readCommandsFromFile(fileAddress);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Create object for BoardMovements to call roboAction()
        BoardMovements boardMovement = new BoardMovements();
        //Sending listofCommands to roboAction
        boardMovement.roboAction(listOfCommands);
        String expected = "20EAST";
        String actual = boardMovement.testString;

        Assert.assertEquals(expected, actual);

    }
    
    
    
    @Test
    public void IntTest02() {
        String fileAddress = "D:\\commands2.txt";
        ArrayList listOfCommands = null;

        try {
            listOfCommands = readCommandsFromFile(fileAddress);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Create object for BoardMovements to call roboAction()
        BoardMovements boardMovement = new BoardMovements();
        //Sending listofCommands to roboAction
        boardMovement.roboAction(listOfCommands);
        String expected = "20SOUTH";
        String actual = boardMovement.testString;

        Assert.assertEquals(expected, actual);

    }
    
    
    
    @Test
    public void IntTest03() {
        String fileAddress = "D:\\commands3.txt";
        ArrayList listOfCommands = null;

        try {
            listOfCommands = readCommandsFromFile(fileAddress);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Create object for BoardMovements to call roboAction()
        BoardMovements boardMovement = new BoardMovements();
        //Sending listofCommands to roboAction
        boardMovement.roboAction(listOfCommands);
        String expected = "04EAST";
        String actual = boardMovement.testString;

        Assert.assertEquals(expected, actual);

    }
    
    
    
    @Test
    public void IntTest04() {
        String fileAddress = "D:\\commands4.txt";
        ArrayList listOfCommands = null;

        try {
            listOfCommands = readCommandsFromFile(fileAddress);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Create object for BoardMovements to call roboAction()
        BoardMovements boardMovement = new BoardMovements();
        //Sending listofCommands to roboAction
        boardMovement.roboAction(listOfCommands);
        String expected = "33NORTH";
        String actual = boardMovement.testString;

        Assert.assertEquals(expected, actual);

    }
    
    
      @Test
    public void IntTest05() {
        String fileAddress = "D:\\commands5.txt";
        ArrayList listOfCommands = null;

        try {
            listOfCommands = readCommandsFromFile(fileAddress);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Create object for BoardMovements to call roboAction()
        BoardMovements boardMovement = new BoardMovements();
        //Sending listofCommands to roboAction
        boardMovement.roboAction(listOfCommands);
        String expected = "00WEST";
        String actual = boardMovement.testString;

        Assert.assertEquals(expected, actual);

    }

    
    
    
    
    
    
    public static ArrayList<String> readCommandsFromFile(String fileAddress) throws IOException {
        ArrayList<String> commands = new ArrayList<String>();
        BufferedReader buffReader = new BufferedReader(new FileReader(fileAddress));

        String line = buffReader.readLine();
        while (line != null) {
            commands.add(line);
            line = buffReader.readLine();
        }

        buffReader.close();

        return commands;

    }

    public IntegrationTest() {
    }

}

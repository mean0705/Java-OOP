package hw2;

import java.util.*;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    private void setUpGame() {
    	DotCom one = new BigDotCom();
        one.setName("Pets.com");
        DotCom two = new MediumDotCom();
        two.setName("eToys.com");
        DotCom three = new SmallDotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        
        for (DotCom dotComSet : dotComsList) {
        	ArrayList<String> newLocation;

        	if (dotComSet.getSize() == "BIG") {
        		newLocation = helper.placeDotCom(4);
        		
                dotComSet.setLocationCells(newLocation);
                dotComSet.setHor(helper.getComCount() % 2);
                
        	}
        	else  if (dotComSet.getSize() == "MEDIUM") {
        		newLocation = helper.placeDotCom(3);
        		
                dotComSet.setLocationCells(newLocation);
                dotComSet.setHor(helper.getComCount() % 2);
        	}
        	else  if (dotComSet.getSize() == "SMALL") {
        		newLocation = helper.placeDotCom(2);
        		
                dotComSet.setLocationCells(newLocation);
                dotComSet.setHor(helper.getComCount() % 2);        	}
        	else 
                System.out.println("What the hell?");

        }
    }
    
    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    
    private void checkUserGuess(String userGuess)
    {
        numOfGuesses++;
        String result = "miss";
        
        for (DotCom dotComToTest : dotComsList)
        {
        	ArrayList<String> newLocation;
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("HIT!"))
            {
            	newLocation = helper.ChangeDotCom( dotComToTest, 2);
            	dotComToTest.setLocationCells(newLocation);
                break;
            }
            if (result.equals("WHACK!")) {
            	newLocation = helper.ChangeDotCom( dotComToTest, 1);
            	dotComToTest.setLocationCells(newLocation);                
            	break;
            }
            if (result.equals("SMASH!")) {
            	newLocation = helper.ChangeDotCom( dotComToTest, 1);
            	dotComToTest.setLocationCells(newLocation);                
            	break;
            }
            if (result.equals("kill"))
            {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    
    private void finishGame() {
        System.out.println("All Dot Coms are dead!  Your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses");
            System.out.println("You got out before your options sank.");
        }
        else
        {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
    
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}

package OOP;
import java.util.Scanner;
public class Main {
	  static int howManyPlayers, dices, sides;
	  
	  public static void main(String[] args) {
		System.out.println( "how many players want to play?" );
		Scanner reader = new Scanner(System.in);
		System.out.println( "" );
		howManyPlayers = reader.nextInt();
		Player [] Players = new Player[howManyPlayers];
		
		System.out.println( "how many dices of do you want?" );
		System.out.println( "" );
		dices = reader.nextInt();
		
		System.out.println( "how many sides of a dice do you want?" );
		System.out.println( "" );
		sides = reader.nextInt();
		
	    for( int i = 0; i < howManyPlayers; i++ ) Players[i] = new Player();
	    for( int i = 0; i < howManyPlayers; i++ ) {
	    	System.out.println( "player" + (i+1) );
	    	Players[i].start();
	    }
	  } // main
	  
	  static int get_howManyPlayers() {
		  return howManyPlayers;
	  }
	  
	  static int get_dices() {
		  return dices;
	  }
	  
	  static int get_sides() {
		  return sides;
	  }
}


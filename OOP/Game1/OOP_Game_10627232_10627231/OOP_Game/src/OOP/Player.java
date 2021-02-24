package OOP;
import java.util.Scanner;
import java.util.Random;
public class Player {
	  private Dice[]Dices = new Dice[Main.get_dices()] ;
	  private Random random = new Random();
	  
	  void Sort() {
	    for ( int i = 0 ; i < Dices.length ; i++ ) {
	      for ( int j = i ; j < Dices.length ; j++ ) {
	        if ( Dices[i].get_num() > Dices[j].get_num() ) {
	          Dice temp = Dices[i] ;
	          Dices[i] = Dices[j] ;
	          Dices[j] = temp ; 
	        }
	      }
	    }
	  } // Sort
	  
	  int total() {
	    int num = 0 ;
	    for ( int i = 0 ; i < Dices.length ; i++ )
	      num = num + Dices[i].get_num() ;

	    return num ;
	  } // total
	  
	  boolean pair() {
		    for ( int i = 0 ; i < Dices.length - 1 ; i++ ) {
		      if ( Dices[i].get_num() == Dices[i+1].get_num() )
		        return true ;
		    }
		  
		    return false ;
		  } // pair
	  
	  boolean three_of_a_kind() {
	    for ( int i = 0 ; i < Dices.length - 2 ; i++ ) {
	      if ( Dices[i].get_num() == Dices[i+1].get_num() && Dices[i].get_num() == Dices[i+2].get_num() )
	        return true ;
	    }

	    return false ;
	  } // three_of_a_kind

	  boolean straight() {
	    for ( int i = 0 ; i < Dices.length - 1 ; i++ ) {
	      if ( Dices[i].get_num() != Dices[i+1].get_num() - 1 )
	        return false ;
	    }
	    return true ;
	  } // straight

	  void Print() {
	    if ( three_of_a_kind() ) System.out.println( "three of a kind" );
	    else if ( pair() )       System.out.println( "pair" );
	    else if ( straight() )   System.out.println( "straight" );
		else                     System.out.println( "no special case : total is : " + total() );
	  } // print
	  
	  public void start() {
	    for ( int i = 0 ; i < Main.get_dices() ; i++ ) {
	      Dices[i] = new Dice() ;
	      Dices[i].set_num( random.nextInt(Main.get_sides()) + 1 );
		  System.out.println( Dices[i].get_num() );
	    } // for
	    
	    Sort() ;
	    Print() ;
	    
	  } // start
}

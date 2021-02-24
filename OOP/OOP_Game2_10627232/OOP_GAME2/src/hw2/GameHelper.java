package hw2;

import java.io.*;
import java.util.*;

public class GameHelper {

  private static final String alphabet = "abcdefg";
  private int gridLength = 7;
  private int gridSize = 49;
  private int [] grid = new int[gridSize];
  private int comCount = 0;


  public String getUserInput(String prompt) {
     String inputLine = null;
     System.out.print(prompt + "  ");
     try {
       BufferedReader is = new BufferedReader(
	 new InputStreamReader(System.in));
       inputLine = is.readLine();
       if (inputLine.length() == 0 )  return null; 
     } catch (IOException e) {
       System.out.println("IOException: " + e);
     }
     return inputLine.toLowerCase();
  }
  
  public ArrayList<String> ChangeDotCom(DotCom dotComTest, int moveSize) {
	  ArrayList<String> newLocation = new ArrayList<String>();
	  
	  int move = (int)(Math.random() * moveSize) + 1;
	  int direction = (int)(Math.random() * 2);  
	  
	  int [] originalCoords = new int[dotComTest.getLocationCells().size()];
	  int [] newCoords = new int[dotComTest.getLocationCells().size()];
	  
	  for(int j = 0; j < dotComTest.getLocationCells().size(); j++) {
		  int row = ( (int) dotComTest.getLocationCells().get(j).charAt(0) ) - 97;
		  int column = ( (int) dotComTest.getLocationCells().get(j).charAt(1) ) - 48;
		  
		  int x = 7 * column + row;
		  originalCoords[j] = x;
	  }
	  
	  for(int j = 0; j < dotComTest.getLocationCells().size(); j++) {
		  int row = ( (int) dotComTest.getLocationCells().get(j).charAt(0) ) - 97;
		  int column = ( (int) dotComTest.getLocationCells().get(j).charAt(1) ) - 48;
		  
		  int x = 7 * column + row;
		  grid[x] = 0;
	  }
	  
	  for(int j = 0; j < originalCoords.length; j++) {
		  int temp = originalCoords[j];
		  if ( dotComTest.getHor() == 1 ) {
			  if (direction == 0 )
			      temp = temp + 7 * move;
			  else
				  temp = temp - 7 * move;
		  }
			  
		  else if ( dotComTest.getHor() == 0 ) {
			  if (direction == 0)
			      temp = temp + move;
			  else
				  temp = temp - move;
		  }
		  else ;
		  
		  if ( legal( temp ) )
			  newCoords[j] = temp;
		  else {
			  for(int i = 0; i < dotComTest.getLocationCells().size(); i++) {
				  int row = ( (int) dotComTest.getLocationCells().get(i).charAt(0) ) - 97;
				  int column = ( (int) dotComTest.getLocationCells().get(i).charAt(1) ) - 48;
				  
				  int x = 7 * column + row;
				  grid[x] = 1;
			  }
			  return dotComTest.getLocationCells();
		  }
	  }
	  
	  for(int j = 0; j < newCoords.length ; j++) {
		  int row = (int) (newCoords[j] / gridLength);
		  int column = newCoords[j] % gridLength;
		  String temp = String.valueOf(alphabet.charAt(column));
		  
		  if ( dotComTest.getLocationCells().get(j).charAt(dotComTest.getLocationCells().get(j).length()-1) == '!' )
			  newLocation.add(temp.concat(Integer.toString(row) + "!"));
		  else
			  newLocation.add(temp.concat(Integer.toString(row)));
	  }
	  
	  for(int j = 0; j < dotComTest.getLocationCells().size(); j++) {
		  int row = ( (int) dotComTest.getLocationCells().get(j).charAt(0) ) - 97;
		  int column = ( (int) dotComTest.getLocationCells().get(j).charAt(1) ) - 48;
		  
		  int x = 7 * column + row;
		  grid[x] = 1;
	  }
	  
	  /*for(int j = 0 ; j < newLocation.size(); j++) {
		  System.out.print(newLocation.get(j) + "\n" );
	  }*/
	  
	  return newLocation;
	  
  }
  
  public boolean legal( int x ) {
	  boolean success = true;
	  if (x < 0) return false;
	  
	  if ( x > gridSize )
		  return false;
	  
	  if ( grid[x] == 0 ) {
		  if ( x >= gridSize ) {
			  success = false;
		  }
		  if ( x % gridLength == 0 ) {
			  success = false;
		  }
	  }
	  else {
		  success = false;
	  }
	  
	  return success;
  }
  
  public int getComCount() {
	  return comCount;
  }
  
  
  public ArrayList<String> placeDotCom(int comSize) {                 // line 19
    ArrayList<String> alphaCells = new ArrayList<String>();
    String [] alphacoords = new String [comSize];      // holds 'f6' type coords
    String temp = null;                                // temporary String for concat
    int [] coords = new int[comSize];                  // current candidate coords
    int attempts = 0;                                  // current attempts counter
    boolean success = false;                           // flag = found a good location ?
    int location = 0;                                  // current starting location
    
    comCount++;                                        // nth dot com to place
    int incr = 1;                                      // set horizontal increment
    if ((comCount % 2) == 1) {                         // if odd dot com  (place vertically)
      incr = gridLength;                               // set vertical increment
    }

    while ( !success & attempts++ < 200 ) {             // main search loop  (32)
	    location = (int) (Math.random() * gridSize);      // get random starting point
        //aSystem.out.print(" try " + location);
	    int x = 0;                                        // nth position in dotcom to place
        success = true;                                 // assume success
        while (success && x < comSize) {                // look for adjacent unused spots
          if (grid[location] == 0) {                    // if not already used
             coords[x++] = location;                    // save location
             location += incr;                          // try 'next' adjacent
             if (location >= gridSize){                 // out of bounds - 'bottom'
               success = false;                         // failure
             }
             if (x>0 & (location % gridLength == 0)) {  // out of bounds - right edge
               success = false;                         // failure
             }
          } else {                                      // found already used location
              // System.out.print(" used " + location);  
              success = false;                          // failure
          }
        }
    }                                                   // end while

    int x = 0;                                          // turn good location into alpha coords
    int row = 0;
    int column = 0;
    while (x < comSize) {
      grid[coords[x]] = 1;                              // mark master grid pts. as 'used'
      row = (int) (coords[x] / gridLength);             // get row value
      column = coords[x] % gridLength;                  // get numeric column value
      temp = String.valueOf(alphabet.charAt(column));   // convert to alpha
      
      alphaCells.add(temp.concat(Integer.toString(row)));
      x++;

      System.out.print("  coord "+x+" = " + alphaCells.get(x-1));
      
    }
     System.out.println("\n");
    
    return alphaCells;
   }
}
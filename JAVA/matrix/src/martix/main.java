package martix;
import java.util.Scanner;

public class main {
	 public static void main(String[] args) {
	  Scanner reader = new Scanner(System.in);
	  System.out.println( "what's your MartixA's column value?" );
	  int aColumn = reader.nextInt();
	  System.out.println( "what's your MartixA's row value?" );
	  int aRow = reader.nextInt();
	  System.out.println( "what's your MartixB's column value?" );
	  int bColumn = reader.nextInt();
	  System.out.println( "what's your MartixB's row value?" );
	  int bRow = reader.nextInt();
	  
	  if (aRow != bColumn) System.out.println( "we can't do it." );
	  else {
	      int a[][] = new int[aColumn][aRow];
	      int aSum = aColumn * aRow;
	      int temp = 0;
	      System.out.println( "Add " + aSum + "numbers into MartixA" );
	      for(int m = 0; m < aColumn; m++ ) {
		      for (int n = 0; n < aRow ; n++) {
	    		  temp = reader.nextInt();
	    		  a[m][n] = temp;
		      }
	      }


	      int b[][] = new int[bColumn][bRow];
	      int bSum = bColumn * bRow;
	      temp = 0;
	      System.out.println( "Add " + bSum + "numbers into MartixB" );
	      for(int m = 0; m < bColumn; m++ ) {
	    	  for (int n = 0; n < bRow ; n++) {
	    		  temp = reader.nextInt();
	    		  b[m][n] = temp;
	    	  }
	      }
	  
		  int c[][] = new int[a.length][b[0].length];
		  for (int m = 0; m < a.length; m++) {
			 for (int p = 0; p < b[0].length; p++) {
			    for (int n = 0; n < a[0].length; n++) {
			       c[m][p] = c[m][p] + a[m][n] * b[n][p];
			    }
			 }
		  }
		  
		  System.out.println( "Your answer is :" );
		  
		  for (int i = 0; i < c.length; i++) {
			   for (int j = 0; j < c[0].length; j++) {
			      System.out.print(c[i][j] + ",");
			   }
			    System.out.println("");
		  }
	  }
	  
	 }
}
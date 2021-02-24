import java.util.Scanner;
import java.lang.Math;
public class main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println( "f(x) = ax^2 + bx + c." );
		System.out.println( "" );
		System.out.println( "what's your 'a' value?" );
		int a = reader.nextInt();
		System.out.println( "what's your 'b' value?" );
		int b = reader.nextInt();
		System.out.println( "what's your 'c' value?" );
		int c = reader.nextInt();
		
		double temp1=(b*b)-4*(a*c);
		
		if (temp1>0) {
		  double temp2 = Math.sqrt(temp1);
		  double ans1 = (-b + temp2 )/(2*a);
		  double ans2 = (-b - temp2 )/(2*a);
		  
		  System.out.println("your x is " + ans1 + " or " + ans2 );
		}
		else if (temp1==0) {
		  double ans=-b/(2*a);
		  System.out.println("your x is " + ans);
		}
		else {
		  System.out.println("your x is not exist.");
		}
		
		
	}
	
}

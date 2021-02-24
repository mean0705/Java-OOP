package inverse;

import java.util.Scanner;
import java.util.ArrayList;

public class Inverse {

	static ArrayList<Character> charList = new ArrayList<Character>(); 
	
	public static void main( String[] args) {
		System.out.println( "I can inverse your input :" );
		Scanner reader = new Scanner(System.in);
		System.out.println( "" );
		while (reader.hasNext()) { // 還有沒有下一個可以讀
			String s = reader.nextLine();
			for(int j = s.length()-1; j >=0; j--) {  // 從後面印到後面
				System.out.printf("%c", s.charAt(j));
			}
		}
		
	}
}
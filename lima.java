package SI_No_3;

import java.util.Scanner;

public class lima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Boolean b = true;
		Scanner input = new Scanner(System.in);
		
		s = input.next();
		
		for(int i = 0; i <= s.length()/2-1; i++) {
			int x1 = s.charAt(i) - 32;
			char y1 = (char)x1; 
			int x2 = s.charAt(s.length()-1-i) - 32;
			char y2 = (char)x2;
			if(s.charAt(i) != s.charAt(s.length()-1-i) &&
					s.charAt(i) != y2 && y1 != s.charAt(s.length()-1-i))
				b = false;
		}
		
		if(b)
			System.out.print("true");
		else
			System.out.print("false");

	}
}

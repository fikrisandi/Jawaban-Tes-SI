package SI_No_2;

import java.util.Scanner;

public class empat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner input = new Scanner(System.in);
		
		s = input.next();
		
		for(int i=s.length()-1;i>=0;i--) {
//			char c = s[i];
			System.out.print(s.charAt(i));
		}

	}

}

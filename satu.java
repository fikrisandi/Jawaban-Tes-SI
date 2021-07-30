package SI_No_1;

import java.util.Scanner;

public class satu{
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		
		if(n % 15 == 0) {
			System.out.println("Hello World");
		} else
		if(n % 3 == 0) {
			System.out.println("Hello");
		} else 
		if(n % 5 == 0) {
			System.out.println("World");
		}
	}
}

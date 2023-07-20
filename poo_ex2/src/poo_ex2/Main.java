package poo_ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a;
		double b;
		
		a = s.nextInt();
		b= s.nextDouble();

			Spectateur t = new Spectateur(a, b);
			
		Assistant as = new Assistant(a, b);
			
		
	}

}

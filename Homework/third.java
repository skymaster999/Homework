package Homework;

import java.util.Scanner;

public class third {
	public static void main(String[] args) {

		double a = 0;

		double b = 0;

		double c = 0;

		double rez = 0;

		double rez2 = 0;

		Scanner sc = new Scanner(System.in);

			System.out.print("Zapros a: ");

			while (!sc.hasNextDouble()) {
				
			System.out.print("Nevernoe a");
			
			sc.next();
			
			}
			
			a = sc.nextDouble();

				System.out.print("Zapros b: ");

				while (!sc.hasNextDouble()) {
					
				System.out.print("Nevernoe b");
			
				sc.next();
			
				}
				
				b = sc.nextDouble();

					if (a > b) {

					System.out.print("Zapros c: ");

						while (!sc.hasNextDouble()) {
				
						System.out.print("Nevernoe c");
						
						sc.next();
				
						}
			
						c = sc.nextDouble();

						rez = b + c;

						System.out.print("b+c = " + rez);
					
					}

					if (a == b) {

					System.out.print("End");
					
					}
		
					if (a < b) {

					System.out.print("Zapros c: ");

						while (!sc.hasNextDouble()) {

						sc.next();
				
						}
			
						c = sc.nextDouble();

						rez2 = a + b + c;

			System.out.print("a+b+c= " + rez2 + " New Year!");
			
					}
	}
}

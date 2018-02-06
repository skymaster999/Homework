package Homework;

import java.util.Scanner;

public class seventh {

	public static void main(String[] args) {

		double a = 0;

		double b = 0;

		double c = 0;

		double d = 0;

		double rez = 0;

		Scanner scan = new Scanner(System.in);

			System.out.print("Zapros a:");

			while (!scan.hasNextDouble()) {

			System.out.print("Vvedite double znachenie:");

			scan.next();
			
			}
			
			a = scan.nextDouble();

				System.out.print("Zapros b:");

				while (!scan.hasNextDouble()) {

				System.out.print("Vvedite double znachenie:");

				scan.next();
				}
				
				b = scan.nextDouble();
		

					System.out.print("Zapros c:");

					while (!scan.hasNextDouble()) {

					System.out.print("Vvedite double znachenie:");

					scan.next();
					
					}
					
					c = scan.nextDouble();

						System.out.print("Zapros d:");

						while (!scan.hasNextDouble()) {

						System.out.print("Vvedite double znachenie:");

						scan.next();
						
						}
						
						d = scan.nextDouble();

		rez = (a / c) * (b / d) - ((a * b - c) / (c * d));

		System.out.print("Otvet:" + rez);

	}
}

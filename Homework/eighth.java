package Homework;

import java.util.Scanner;

public class eighth {

	public static void main(String[] args) {

		double a = 0;

		double b = 0;

		double c = 0;

		Scanner scan = new Scanner(System.in);

			System.out.print("Zapros chisla 1:");

			while (!scan.hasNextDouble()) {

			System.out.print("Vvedite chislo type Double:");

			scan.next();

			}

			a = scan.nextDouble();

				System.out.print("Zapros chisla 2:");

				while (!scan.hasNextDouble()) {

				System.out.print("Vvedite chislo type Double:");

				scan.next();

				}

				b = scan.nextDouble();

					System.out.print("Zapros chisla 3:");

					while (!scan.hasNextDouble()) {

					System.out.print("Vvedite chislo type Double:");

					scan.next();

					}

					c = scan.nextDouble();

						if (a >= 0) {

						System.out.println("Pervoe=" + Math.pow(a, 2));

							} else {

							System.out.println("Pervoe=" + Math.pow(a, 4));
								
							}
						
						if (b >= 0) {

						System.out.println("Vtoroe=" + Math.pow(b, 2));

							} else {

							System.out.println("Vtoroe=" + Math.pow(b, 4));

							}

						if (a >= 0) {

						System.out.println("Tretie=" + Math.pow(c, 2));

							} else {

							System.out.println("Tretie=" + Math.pow(c, 4));
							
							}
	}
}